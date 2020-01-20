var date = new Date();
var dateStr = dateFormat(date, null);
var vueObject = new Vue({
    el: '#app',
    data() {
        return {
            totalCount: 0,
            currentPage: 1,
            pageSize: 5,
            tableData: [],
            carParkRank: [
                {label: 'A', value: '1'},
                {label: 'B', value: '2'},
                {label: 'C', value: '3'},
                {label: 'D', value: '4'}
            ],
            buildingInfo: {
                buildingname: '',
                developer: '',
                propertymanager: '',
                sheng: '',
                shi: '',
                qu: '',
                xxdz: '',//详细地址
                propertymanagerfee: 0,
                totalarea: 0,
                arearate: 0,
                nowtypeid: 0,
                buildingnumber: 0,
                averageprice: 0,
                saledate: dateStr,
                saleissue: 0,
                delivereddate: dateStr,
                intputer: '',
                contacts: '',
                contactstel: '',
                inputdate: dateStr,
                carparknumber: 0,
                carparklayernumber: 0,
                carparkprice: 0,
                ntcarparknumber: 0,
                carparkrate: 0,
                upcarpark: 0,
                downcarpark: 0,
                carparkfee: 0,
                upmacarpark: 0,
                downmacarpark: 0,
                mafee: 0
            },
            rules: {
                buildingname: [
                    {required: true, message: '楼盘名称不能为空', trigger: 'blur'},
                ],
                developer: [
                    {required: true, message: '开发商名称不能为空', trigger: 'blur'},
                ],
                sheng: [
                    {required: true, message: '省不能为空', trigger: 'blur'},
                ],
                shi: [
                    {required: true, message: '市不能为空', trigger: 'blur'},
                ],
                qu: [
                    {required: true, message: '区不能为空', trigger: 'blur'},
                ],
                xxdz: [
                    {required: true, message: '详细地址不能为空', trigger: 'blur'},
                ],
                propertymanager: [
                    {required: true, message: '物业名称不能为空', trigger: 'blur'},
                ],
                propertymanagerfee: [
                    {required: true, message: '物业费不能为空', trigger: 'blur'},
                ],
                totalarea: [
                    {required: true, message: '楼盘总建面不能为空', trigger: 'blur'},
                ],
                arearate: [
                    {required: true, message: '楼盘容积率不能为空', trigger: 'blur'},
                ],
                nowtypeid: [
                    {required: true, message: '楼盘现状不能为空', trigger: 'blur'},
                ],
                buildingnumber: [
                    {required: true, message: '楼盘总套数不能为空', trigger: 'blur'},
                ],
                averageprice: [
                    {required: true, message: '楼盘销售均价不能为空', trigger: 'blur'},
                ],
                saledate: [
                    {required: true, message: '开盘时间不能为空', trigger: 'blur'},
                ],
                saleissue: [
                    {required: true, message: '开盘期数不能为空', trigger: 'blur'},
                ],
                delivereddate: [
                    {required: true, message: '首次交房时间不能为空', trigger: 'blur'},
                ],
                intputer: [
                    {required: true, message: '录入人不能为空', trigger: 'blur'},
                ],
                contacts: [
                    {required: true, message: '新盘联系人不能为空', trigger: 'blur'},
                ],
                contactstel: [
                    {validator: phoneValidate, trigger: 'blur'}
                ],
                inputdate: [
                    {required: true, message: '录入时间不能为空', trigger: 'blur'},
                ],
                carparknumber: [
                    {required: true, message: '车位总数量不能为空', trigger: 'blur'},
                ],
                carparklayernumber: [
                    {required: true, message: '车位分层数量不能为空', trigger: 'blur'},
                ],
                ntcarparknumber: [
                    {required: true, message: '符合贷后管理要求车位数量不能为空', trigger: 'blur'},
                ],
                carparkrate: [
                    {required: true, message: '车位配比不能为空', trigger: 'blur'},
                ],
                upcarpark: [
                    {required: true, message: '地上平面车位不能为空', trigger: 'blur'},
                ],
                downcarpark: [
                    {required: true, message: '地下平面车位不能为空', trigger: 'blur'},
                ],
                carparkfee: [
                    {required: true, message: '平面车位管理费不能为空', trigger: 'blur'},
                ],
                upmacarpark: [
                    {required: true, message: '地上机械车位不能为空', trigger: 'blur'},
                ],
                downmacarpark: [
                    {required: true, message: '地下机械车位不能为空', trigger: 'blur'},
                ],
                mafee: [
                    {required: true, message: '平面机械管理费不能为空', trigger: 'blur'},
                ]
            },
            areaJson: '/json/address.json',
            addressArray: [],//所有数据
            cityArray: [],
            areaArray: [],
            carParkRankValue: '',//评级
        }
    },
    mounted: function () {
        Vue.nextTick(function () {
            vueObject.getAddressData();
        })
    },
    methods: {
        add: function (form) {//添加
            vueObject.$refs[form].validate(function (valid) {
                if (valid) {
                    Vue.set(vueObject.buildingInfo, "buildingaddr", vueObject.buildingInfo.sheng + vueObject.buildingInfo.shi + vueObject.buildingInfo.qu + vueObject.buildingInfo.xxdz);
                    vueObject.$resource(contextPath + '/buildingInfo/add').save(vueObject.buildingInfo).then(function (response) {
                        window.location.href = contextPath + "/html/BuildingInfo/BuildingInfo.html";
                    }).catch(function () {
                        vueObject.showMsgError("添加楼盘信息失败");
                    });
                }
            })
        },
        getAddressData() {
            var that = vueObject;
            this.$http.get(contextPath + that.areaJson).then(function (response) {
                if (response.status === 200) {
                    //获取地址
                    that.addressArray = response.data.data;
                    //默认值赋值获取城市数组
                    if (that.buildingInfo.sheng) {
                        for (var ad of that.addressArray) {
                            if (ad.areaname === that.buildingInfo.sheng) {
                                that.cityArray = ad.subarea;
                                //默认赋值获取区域数组
                                if (that.buildingInfo.shi) {
                                    for (var area of that.cityArray) {
                                        if (area.areaname === that.buildingInfo.shi) {
                                            that.areaArray = area.subarea;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            })
        },
        //选择省份
        getCityData(val) {
            //清空市，和区
            this.buildingInfo.shi = '';
            this.buildingInfo.qu = '';
            this.$emit('change', this.buildingInfo);//发送改变
            for (var ad of this.addressArray) {
                if (ad.areaname === val) {
                    this.cityArray = ad.subarea;
                    return
                }
            }
        },
        getAreaData(val) {
            //清空区
            this.buildingInfo.qu = '';
            this.$emit('change', this.buildingInfo);//发送改变
            for (var area of this.cityArray) {
                if (area.areaname === val) {
                    this.areaArray = area.subarea;
                    return
                }
            }
        },
        //地区数据变动后
        onAreaChanged(val) {
            this.$emit('change', this.buildingInfo);//发送改变
        }
    }
})