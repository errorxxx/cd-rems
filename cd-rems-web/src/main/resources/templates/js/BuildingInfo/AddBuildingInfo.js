var date = new Date();
var Vue = new Vue({
    el: '#app',
    data() {
        return{
            totalCount:0,
            currentPage:1,
            pageSize:5,
            tableData: [],
            //默认值设置，可为空
            caddress:{
                sheng: '',
                shi: '',
                qu: ''
            },
            carParkRank:[
                {label:'A',value:'1'},
                {label:'B',value:'2'},
                {label:'C',value:'3'},
                {label:'D',value:'4'}
            ],
            buildingInfo:{
                buildingname:'',
                developer:'',
                propertymanager:'',
                propertymanagerfee:'',
                totalarea:0,
                arearate:0,
                nowtypeid:0,
                buildingnumber:0,
                averageprice:0,
                saledate:date,
                saleissue:'',
                delivereddate:date,
                intputer:'',
                contacts:'',
                contactstel:'',
                inputdate:date
            },
            xxdz:'',//详细地址
            areaJson: '../json/address.json',
            addressArray: [],//所有数据
            cityArray: [],
            areaArray: [],
            carParkRankValue:'',//评级
        }
    },
    mounted: function () {
        Vue.nextTick(function () {
            Vue.getAddressData();
        })
    },
    methods: {
        add(){//添加
            window.location.href = contextPath+"/html/test.html";
        },
        getAddressData() {
            var that = Vue;
            this.$http.get(contextPath+that.areaJson).then(function (response) {
                if (response.status === 200) {
                    //获取地址
                    that.addressArray = response.data.data;
                    //默认值赋值获取城市数组
                    if(that.caddress.sheng){
                        for (var ad of that.addressArray) {
                            if (ad.areaname === that.caddress.sheng) {
                                that.cityArray = ad.subarea;
                                //---
                                //默认赋值获取区域数组
                                if(that.caddress.shi){
                                    for (var area of that.cityArray) {
                                        if (area.areaname === that.caddress.shi) {
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
            this.caddress.shi='';
            this.caddress.qu='';
            this.$emit('change', this.caddress);//发送改变
            for (var ad of this.addressArray) {
                if (ad.areaname === val) {
                    this.cityArray = ad.subarea;
                    return
                }
            }
        },
        getAreaData(val) {
            //清空区
            this.caddress.qu='';
            this.$emit('change', this.caddress);//发送改变
            for (var area of this.cityArray) {
                if (area.areaname === val) {
                    this.areaArray = area.subarea;
                    return
                }
            }
        },
        //地区数据变动后
        onAreaChanged(val) {
            this.$emit('change', this.caddress);//发送改变
        }
    }
})