/**
 *显示用户信息及系统时间
 */
var vm_user = new Vue({
    el: '#LAY_app',
    data: {
        sysdate: '',
        user: {},
    },
    mounted: function () {
        Vue.nextTick(function(){
        	vm_user.getSysDate();
            vm_user.getUserInfo();
            getAllBackModuleMenu();
            // vm_user.getUserDepartInfo();
            // vm_user.checkLogin();
        })
    },
    methods: {
        /**验证登录**/
        checkLogin : function () {
            if(getCookie("userId")!=null){
            }else{
                window.self.location="/cdxt-cds/user/login";
            }
        },
        /**获取用户的员工信息*/
        getUserInfo: function () {
            if (getCookie("userId") != null && getCookie("deptId") != null) {
                // this.$resource(contextPath + '/api/user/checkLoginById', {id: getCookie("userId")}
                // ).query().then(function (response) {
                //     this.user = response.data;
                // }).catch(function () {
                //     this.showMsgError("请联系管理员配置工作区域及科室");
                // });
            }
        },
        /**自动刷新系统时间*/
        getSysDate: function () {
            var dateObj = new Date(); //表示当前系统时间的Date对象
            var year = dateObj.getFullYear(); //当前系统时间的完整年份值
            var month = dateObj.getMonth() + 1; //当前系统时间的月份值
            var date = dateObj.getDate(); //当前系统时间的月份中的日
            var day = dateObj.getDay(); //当前系统时间中的星期值
            var hour = dateObj.getHours(); //当前系统时间的小时值
            var minute = dateObj.getMinutes(); //当前系统时间的分钟值
            var second = dateObj.getSeconds(); //当前系统时间的秒钟值
            //如果月、日、小时、分、秒的值小于10，在前面补0
            if (month < 10) {
                month = "0" + month;
            }
            if (date < 10) {
                date = "0" + date;
            }
            if (hour < 10) {
                hour = "0" + hour;
            }
            if (minute < 10) {
                minute = "0" + minute;
            }
            if (second < 10) {
                second = "0" + second;
            }
            var newDate = year + "/" + month + "/" + date + " " + hour + ":" + minute + ":" + second;
            this.sysdate = newDate

            setTimeout("vm_user.getSysDate()", 1000);//每隔1秒重新调用一次获取系统时间的函数
        },
        /**注销*/
        logout: function () {
            var result=confirm("您确认退出登录？");
            if(result){
                delCookie("userId");
                delCookie("deptId");
                delCookie("orgId");
            }
            window.location.reload();
        },
        /**锁屏*/
        lock: function () {
            delCookie("hnms-token");
            layui.use('layer', function () {
                var layer = layui.layer;

                layer.open({
                    type: 2,
                    title: false,
                    area: ['470px', '330px'], //宽高
                    content: 'lock.html',
                    closeBtn: 0,
                    resize: false

                });
            });
        },
        /**解锁屏幕*/
        unlock: function () {
            layui.use('layer', function () {
                var layer = layui.layer;

                layer.close(layer.index);
            });
        },
        /**切换科室*/
        changeDept:function(){
        	layui.use('layer', function () {
                var layer = layui.layer;

                layer.open({
                    type: 2,
                    title: false,
                    area: ['470px', '330px'], //宽高
                    content: 'change-department.html',
                    closeBtn: 1,
                    resize: false

                });
            });
        }
    }
})
/**
 * 获取后台所有导航菜单
 */
function getAllBackModuleMenu(){
    var navType = 1;//1表示后台，2表示前台，3移动端
    $.post(contextPath +"/nav/getAllVisibleMenuByType",
        {navType:navType},
        showAllPCModuleMenu,"json")
}
function treeHtml(arr, rootId) {
    var getHtmlFn = function(arrNodes, pid) {
        var childNodes = [];
        for (var i = 0; i < arrNodes.length; i++) {
            if (arrNodes[i].pid === pid) {
                childNodes.push(arrNodes[i]);
            }
        }
        var moduleName = "";
        if (childNodes && childNodes.length > 0) {
            var tempHTML = '<dl class="layui-nav-child">';
            for (var j = 0; j < childNodes.length; j++) {
                var navUrl;
                if(childNodes[j].navurl == "javascript:;"){
                    navUrl =  childNodes[j].navurl;
                }else{
                    navUrl = contextPath + childNodes[j].navurl;
                }
                if(getHtmlFn(arr, childNodes[j].cid)){
                    tempHTML += '<dd data-name="'+childNodes[j].cid+'" class="layui-nav-itemed">'
                        + '<a href="javascript:;">'+childNodes[j].navtitle
                        +'</a>'+ getHtmlFn(arr, childNodes[j].cid)+'</dd>';
                }else{
                    tempHTML += '<dd data-name="'+childNodes[j].cid+'" >'
                        + '<a lay-href="'+navUrl+'">'+childNodes[j].navtitle
                        +'</a>'+ getHtmlFn(arr, childNodes[j].cid)+'</dd>';
                }

            }
            tempHTML += '</dl>';
            return tempHTML;
        }
        return '';
    }
    var treeHtml = getHtmlFn(arr, rootId);
    return treeHtml;
}

function showAllPCModuleMenu(result){
    var modules = result.data;//导航菜单集合
    var navcIds = result.data.navcIds;//用户权限中菜单cId
    var pIdArr = new Array();//二级菜单pId集合
    for(var i = 0; i < modules.length; i++){
        if(modules[i].navlevel == 2){
            pIdArr[i] = modules[i].pid;
        }
    }
    var str = "";
    str += '<li data-name="home" class="layui-nav-item layui-nav-itemed layui-this">'
        + '<a href="javascript:;" lay-tips="数据总览" lay-direction="2">'
        + '<i class="layui-icon layui-icon-home"></i>'
        + '<cite>数据总览</cite>'
        + '</a>'
        + '</li>';
    for(var i = 0;i < modules.length; i++){
        if(pIdArr.indexOf(modules[i].cid) < 0 && modules[i].navlevel == 1){//只有一级菜单
            var navUrl;
            if(modules[i].navurl == "javascript:;"){
                navUrl =  modules[i].navurl;
            }else{
                navUrl = contextPath + modules[i].navurl;
            }
            str += '<li data-name="'+modules[i].cid+'" class="layui-nav-item">'
                + '<a href="javascript:;" lay-href="'+navUrl+'" lay-tips="'+modules[i].navtitle+'" lay-direction="2">'
                + '<i class="layui-icon layui-icon-app"></i>'
                + '<cite>'+modules[i].navtitle+'</cite>'
                + '</a></li>';
        }else{
            if(modules[i].navlevel == 1){
                str += '<li data-name="'+modules[i].cid+'" class="layui-nav-item">'
                    + '<a href="javascript:;" lay-tips="'+modules[i].navtitle+'" lay-direction="2">'
                    + '<i class="layui-icon layui-icon-app"></i>'
                    + '<cite>'+modules[i].navtitle+'</cite>'
                    + '</a>'+treeHtml(modules,modules[i].cid)+'</li>';
            }
        }
    }
    $("#LAY-system-side-menu").html(str);
    initLayUi();
}
/**
 * 初始化layui
 */
function initLayUi(){
    layui.use(['layer', 'element'], function () {
        var layer = layui.layer, element = layui.element;
        var layFilter = $("#LAY-system-side-menu").attr('lay-filter');
        element.render('nav',layFilter);
    });
}