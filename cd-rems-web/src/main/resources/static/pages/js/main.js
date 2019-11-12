/**
 * Created by Tanjinchuan 2018/11/22
 */

var websocket = null;//websocket实体

$(function () {
    //iframe自适应
    $(window).on('resize', function () {
        var $content = $('.admin-nav-card .layui-tab-content');
        $content.height($(this).height() - 108);
        $content.find('iframe').each(function () {
            $(this).height($content.height());
        });
    }).resize();

    //隐藏显示菜单
    $('.admin-side-toggle').on('click', function () {
        var sideWidth = $('#admin-side').width();
        if (sideWidth === 220) {
            $('#admin-body').animate({
                left: '0'
            }); //admin-footer
            $('#admin-footer').animate({
                left: '0'
            });
            $('#admin-side').animate({
                width: '0'
            });
        } else {
            $('#admin-body').animate({
                left: '220px'
            });
            $('#admin-footer').animate({
                left: '220px'
            });
            $('#admin-side').animate({
                width: '220px'
            });
        }
    });

    //全屏
    $('.admin-side-full').on('click', function () {
        var docElm = document.documentElement;
        //W3C
        if (docElm.requestFullscreen) {
            docElm.requestFullscreen();
        }
        //FireFox
        else if (docElm.mozRequestFullScreen) {
            docElm.mozRequestFullScreen();
        }
        //Chrome等
        else if (docElm.webkitRequestFullScreen) {
            docElm.webkitRequestFullScreen();
        }
        //IE11
        else if (elem.msRequestFullscreen) {
            elem.msRequestFullscreen();
        }
        layer.msg('按Esc即可退出全屏');
    });


    //手机设备的简单适配
    var treeMobile = $('.site-tree-mobile'),
        shadeMobile = $('.site-mobile-shade');
    treeMobile.on('click', function () {
        $('body').addClass('site-mobile');
    });
    shadeMobile.on('click', function () {
        $('body').removeClass('site-mobile');
    });
})

/**
 *显示用户信息及系统时间
 */
var vm_user = new Vue({
    el: '#userInfo',
    data: {
        sysdate: '',
        user: {},
    },
    mounted: function () {
        Vue.nextTick(function(){
        	vm_user.getSysDate();
            vm_function.getFunctionsByUser();
            vm_user.getUserInfo();
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
 *显示左侧菜单
 */
var vm_function = new Vue({
    el: "#admin-side",
    data: {
        funcs: {}
    },
    methods: {
        /**获取该用户授权菜单*/
        getFunctionsByUser: function () {
            this.$resource("../nav/listByUserId").query().then(function(response){
                this.funcs = response.data[0];
                //数据加载完后渲染左侧菜单
                Vue.nextTick(function(){
                	vm_function.renderNavTree();
                })
            }).catch(function(error){
            })
        },
        /**渲染左侧菜单*/
        renderNavTree: function () {
            layui.config({
                base: 'js/',
                version: new Date().getTime()
            }).use(['element', 'layer', 'navbar', 'tab'], function () {
                var element = layui.element,
                    layer = layui.layer,
                    navbar = layui.navbar(),
                    tab = layui.tab({
                        elem: '.admin-nav-card', //设置选项卡容器
                        contextMenu: true,
                        onSwitch: function (data) {
                            // console.log(data.id); //当前Tab的Id
                            // console.log(data.index); //得到当前Tab的所在下标
                            // console.log(data.elem); //得到当前的Tab大容器
                            // console.log(tab.getCurrentTabId())
                        },
                        closeBefore: function (obj) { //tab 关闭之前触发的事件
                            // console.log(obj);
                            return true;
                        }
                    });
                //设置navbar
                navbar.set({
                    spreadOne: true,
                    elem: '#admin-navbar-side',
                    cached: true,
                    data: vm_function.funcs.children
                });
                //渲染navbar
                navbar.render();

                //监听点击事件
                navbar.on('click(side)', function (data) {
                    tab.tabAdd(data.field);
                });
            });
        }
    }

});


/**
 *消息服务
 */
var vm_message = new Vue({
    el: "#messageTemplate",
    data: {
        mqUrl: '',
        message: {}
    },
    mounted: function () {
//        Vue.nextTick(() => {
//            this.getMQAdress();
//        })
    },
    methods: {
        /**获取MQ地址*/
        getMQAdress: function () {
            this.$resource('../api/message/getMQAdress').query().then(function(response){
                this.mqUrl = response.data;
            }).catch(function (error) {
                console.log(error);
                layer.msg(error.data.errMsg, {icon: 2, anim: 6, time: 1000});
            }).finally(function(){
                /** 判断当前浏览器是否支持WebSocket*/
                if ('WebSocket' in window) {
                    if (getCookie("hnms-userid") != null) {
                        websocket = new WebSocket("ws://" + vm_message.mqUrl + "/websocket/" + getCookie("hnms-userid"));
                    }
                } else {
                    alert('当前浏览器不支持websocket，将无法接收消息推送，请更换浏览器！')
                }
                /** 连接发生错误的回调方法*/
                websocket.onerror = function () {
                    console.log("WebSocket连接发生错误");
                    // alert("WebSocket连接发生错误");
                };

                /** 连接成功建立的回调方法*/
                websocket.onopen = function () {
                    // alert("WebSocket连接成功");
                    console.log("WebSocket连接成功");
                }
                /** 接收到消息的回调方法*/
                websocket.onmessage = function (event) {
                    // notie.alert({type: 1, text: '你有新的消息'});
                    vm_user.message = JSON.parse(event.data);

                    //多窗口模式，层叠置顶
                    layer.open({
                        type: 1
                        , title: '消息'
                        , area: ['390px', '330px']
                        , shade: 0
                        , offset: 'rb'
                        , maxmin: true
                        , content: vm_user.message.msgContent
                        , btn: ['现在处理', '忽略'] //只是为了演示
                        , yes: function () {
                            $(that).click(); //此处只是为了演示，实际使用可以剔除
                        }
                        , btn2: function () {
                            layer.closeAll();
                        }
                        , zIndex: layer.zIndex //重点1
                        , success: function (layero) {
                            layer.setTop(layero); //重点2
                        }
                    });

                    // notie.confirm({
                    //     text: vm_user.message.msgContent,
                    //     cancelCallback: function () {
                    //         notie.alert({type: 3, text: 'Aw, why not? :(', time: 2})
                    //     },
                    //     submitCallback: function () {
                    //         notie.alert({type: 1, text: 'Good choice! :D', time: 2})
                    //     }
                    // })
                }
                /** 连接关闭的回调方法*/
                websocket.onclose = function () {
                    console.log("WebSocket连接关闭");
                    // alert("WebSocket连接关闭");
                }

                /** 监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。*/
                window.onbeforeunload = function () {
                    closeWebSocket();
                }
            });
        },
    }
});

/** 将消息显示在网页上*/
function setMessageInnerHTML(innerHTML) {
    document.getElementById('message').innerHTML += innerHTML + '<br/>';
}

/** 关闭WebSocket连接*/
function closeWebSocket() {
    websocket.close();
}

/** 发送消息*/
function send() {
    var message = document.getElementById('text').value;
    websocket.send(message);
}

