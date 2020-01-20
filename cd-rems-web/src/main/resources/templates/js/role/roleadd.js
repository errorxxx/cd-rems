var Vue = new Vue({
    el: '#app',
    data() {
        return{
            totalCount:0,
            currentPage:1,
            pageSize:5,
            tableData: [],
            form:{
                qq:''
            },
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
            carparkName:'',//停车场名称
            xxdz:'',//详细地址
            developer:'',//物业名称
            management:'',//管理方名称
            buildingName:'',//开发商名称

            areaJson: '/json/address.json',
            addressArray: [],//所有数据
            cityArray: [],
            areaArray: [],
            carParkRankValue:'',//评级
            fileList2: [{name: 'food.jpeg', url: 'https://fuss10.elemecdn.com/3/63/4e7f3a15429bfda99bce42a18cdd1jpeg.jpeg?imageMogr2/thumbnail/360x360/format/webp/quality/100'}]
        }
    },
    mounted: function () {
        Vue.nextTick(function () {
            Vue.getAddressData();
        })
    },
    methods: {
        handleRemove(file, fileList) {
            console.log(file, fileList);
        },
        handlePreview(file) {
            console.log(file);
        },
        addSubmit(){//添加

        },
        addCancel(){//取消

        },
        getAddressData() {
            var that = this;
            this.$http.get(contextPath+that.areaJson).then(function (response) {
                if (response.status === 200) {
                    //获取地址
                    that.addressArray = response.data.data;
                    //默认值赋值获取城市数组
                    if(that.caddress.sheng){
                        for (let ad of that.addressArray) {
                            if (ad.areaname === that.caddress.sheng) {
                                that.cityArray = ad.subarea;
                                //---
                                //默认赋值获取区域数组
                                if(that.caddress.shi){
                                    for (let area of that.cityArray) {
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
            for (let ad of this.addressArray) {
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
            for (let area of this.cityArray) {
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