var Vue = new Vue({
    el: '#app',
    data() {
        return {
            selectedBuildingSet:{}
        }
    },
    mounted: function () {
        Vue.nextTick(function () {
            Vue.getAddressData();
        })
    },
    methods: {
        add() {//添加
            window.location.href = contextPath + "/html/test.html";
        },
    }
})