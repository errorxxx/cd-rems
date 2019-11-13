/**
 * Created by wanglin on 2018-02-02.
 */

var layer;

layui.use('layer', function(){
    layer = layui.layer;
});

/**
 * 登录表单
 */
var vueObject = new Vue({
    el: '#loginForm',
    data :{
        user:{},
        name : ''
    },
    mounted: function () {
        vueObject.user.loginName = window.parent.vm_user.user.loginName;
        vueObject.user.password = '';
       // vueObject.name = window.parent.vm_user.user.name + '【' + window.parent.vm_user.user.deptName +'】';
        vueObject.name = window.parent.vm_user.user.name
    },
    methods :{
        /**登录*/
        login :function(){

            vueObject.$resource('../api/user/login'
            ).save(
                vueObject.user
            ).then(function(response){
                setCookie("hnms-userid",response.headers.get("userId"),1);
                setCookie("hnms-token",response.headers.get("token"),1);

                window.parent.vm_user.unlock();
            }).catch(function(error){
                layer.msg(error.data.errMsg, {icon: 2,anim :6,time:1000});
            });
        }
    }
});