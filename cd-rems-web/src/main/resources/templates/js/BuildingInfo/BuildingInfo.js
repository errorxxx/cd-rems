var _minDate = null;
var _maxDate = null;
var vueObject = new Vue({
    el: '#app',
    data() {
        return {
            totalCount: 0,
            currentPage: 1,
            pageSize: 5,
            tableData: [],
            //默认值设置，可为空
            address: {
                sheng: '',
                shi: '',
                qu: '',
            },
            nowType: [
                {label: 'A', value: '1'},
                {label: 'B', value: '2'},
                {label: 'C', value: '3'},
                {label: 'D', value: '4'}
            ],
            selectedRow: {},
            buildingInfoVo: {
                name: '',

                address: '',
                nowTypeId: '',
                startTime: '',
                endTime: '',
                currentPage: 1,
                pageSize: 5
            },
            areaJson: '/json/address.json',
            addressArray: [],//所有数据
            cityArray: [],
            areaArray: [],
            dateRange: [],//默认选择日期范围
            pickerOptions: {//日期选择参数
                onPick(time) {
                    //如果只选择一个时间
                    if (!time.maxDate) {
                        // var timeRange = 6 * 24 * 60 * 60 * 1000; //6天
                        // _minDate = time.minDate.getTime() - timeRange;
                        // _maxDate = time.minDate.getTime() + timeRange;
                        //选择了两个时间
                    } else {
                        _minDate = _maxDate = null;
                    }
                }, disabledDate(time) {//不显示的时间
                    if (_minDate && _maxDate) {
                        return time.getTime() < _minDate || time.getTime() > _maxDate
                    }
                }
            }
        }
    },
    mounted: function () {
        Vue.nextTick(function () {
            vueObject.getAddressData();
            vueObject.getResource();
        })
    },
    methods: {
        editBuildingInfo() {
            window.location.href = contextPath + "/html/BuildingInfo/AddBuildingInfo.html";
        },
        getRow: function (row) {
            vueObject.selectRow = row;
        },
        deleteBuildingInfo() {
            if (vueObject.selectRow == null) {
                vueObject.showMsgError("请选择要删除的数据");
            } else if (confirm("确定要删除选中的数据?")) {
                vueObject.$resource(contextPath + '/buildingInfo/delete').save(vueObject.selectRow).then(function (response) {
                    vueObject.getResource();
                }).catch(function () {
                    vueObject.showMsgError("楼盘信息删除错误");
                });
            }
        },
        getResource() {//分页查询所有数据
            var minDate = '';
            var maxDate = '';
            if (vueObject.dateRange != null && vueObject.dateRange.length > 0) {
                minDate = vueObject.dateRange[0];
                maxDate = vueObject.dateRange[1];
            }
            Vue.set(vueObject.buildingInfoVo, "address", vueObject.address.sheng + vueObject.address.shi + vueObject.address.qu);
            Vue.set(vueObject.buildingInfoVo, "startTime", minDate)
            Vue.set(vueObject.buildingInfoVo, "endTime", maxDate)
            vueObject.$resource(contextPath + '/buildingInfo/listAll').save(vueObject.buildingInfoVo).then(function (response) {
                vueObject.tableData = response.data.data.list;
                vueObject.totalCount = response.data.data.total;
            }).catch(function () {
                vueObject.showMsgError("楼盘信息查询错误");
            });
        },
        search() {//模糊查询
            vueObject.currentPage = 1;//当前页
            vueObject.getResource();
        },
        add() {//添加
            window.location.href = contextPath + "/html/BuildingInfo/AddBuildingInfo.html";
        },
        exportData() {//导出

        },
        getAddressData() {
            var that = vueObject;
            vueObject.$http.get(contextPath + vueObject.areaJson).then(function (response) {
                if (response.status === 200) {
                    //获取地址
                    that.addressArray = response.data.data;
                    //默认值赋值获取城市数组
                    if (that.address.sheng) {
                        for (var ad of that.addressArray) {
                            if (ad.areaname === that.address.sheng) {
                                that.cityArray = ad.subarea;
                                //---
                                //默认赋值获取区域数组
                                if (that.address.shi) {
                                    for (var area of that.cityArray) {
                                        if (area.reaname === that.address.shi) {
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
            vueObject.address.shi = '';
            vueObject.address.qu = '';
            vueObject.$emit('change', vueObject.address);//发送改变
            for (var ad of vueObject.addressArray) {
                if (ad.areaname === val) {
                    Vue.cityArray = ad.subarea;
                    return
                }
            }
        },
        getAreaData(val) {
            //清空区
            vueObject.address.qu = '';
            vueObject.$emit('change', vueObject.address);//发送改变
            for (var area of vueObject.cityArray) {
                if (area.areaname === val) {
                    vueObject.areaArray = area.subarea;
                    return
                }
            }
        },
        //地区数据变动后
        onAreaChanged(val) {
            vueObject.$emit('change', vueObject.address);//发送改变
        },
        handleSizeChange: function (size) { //分页    初始页currentPage、初始每页数据数pagesize和数据testpage
            vueObject.pageSize = size;
            vueObject.getResource();
        },
        handleCurrentChange: function (currentPage) {
            vueObject.currentPage = currentPage;
            vueObject.getResource();
        },
        selectToday(arr) {//选择今日
            $(".selectToday").addClass("activeDate");
            $(".selectVueYear").removeClass("activeDate");
            $(".selectVueMonth").removeClass("activeDate");
            $(".selectVueWeek").removeClass("activeDate");
            var obj = {
                starttime: '',
                endtime: ''
            }
            obj.starttime = moment(new Date().valueOf()).format('YYYY-MM-DD');
            obj.endtime = obj.starttime;
            vueObject.dateRange = [obj.starttime, obj.endtime];
        },
        selectVueWeek() {//选择本周
            $(".selectVueWeek").addClass("activeDate");
            $(".selectVueYear").removeClass("activeDate");
            $(".selectVueMonth").removeClass("activeDate");
            $(".selectToday").removeClass("activeDate");
            var obj = {
                starttime: '',
                endtime: ''
            }
            obj.starttime = moment(moment().week(moment().week()).startOf('week').add(1, 'days').valueOf()).format('YYYY-MM-DD')
            obj.endtime = moment(moment().week(moment().week()).endOf('week').add(1, 'days').valueOf()).format('YYYY-MM-DD');
            Vue.dateRange = [obj.starttime, obj.endtime];
        },
        selectVueMonth() {//选择本月
            $(".selectVueMonth").addClass("activeDate");
            $(".selectVueYear").removeClass("activeDate");
            $(".selectVueWeek").removeClass("activeDate");
            $(".selectToday").removeClass("activeDate");
            var obj = {
                starttime: '',
                endtime: ''
            }
            obj.starttime = moment(moment().month(moment().month()).startOf('month').valueOf()).format('YYYY-MM-DD');
            obj.endtime = moment(moment().month(moment().month()).endOf('month').valueOf()).format('YYYY-MM-DD');
            vueObject.dateRange = [obj.starttime, obj.endtime];
        },
        selectVueYear() {//选择本年
            $(".selectVueYear").addClass("activeDate");
            $(".selectVueMonth").removeClass("activeDate");
            $(".selectVueWeek").removeClass("activeDate");
            $(".selectToday").removeClass("activeDate");
            var obj = {
                starttime: '',
                endtime: ''
            }
            obj.starttime = moment(moment().year(moment().year()).startOf('year').valueOf()).format('YYYY-MM-DD');
            obj.endtime = moment(moment().year(moment().year()).endOf('year').valueOf()).format('YYYY-MM-DD');
            vueObject.dateRange = [obj.starttime, obj.endtime];
        }
    }
})