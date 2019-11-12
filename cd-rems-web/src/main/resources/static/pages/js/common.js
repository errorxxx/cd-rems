/** common.js By Beginner Emain:zheng_jinfan@126.com HomePage:http://www.zhengjinfan.cn */
layui.define(['layer'], function(exports) {
	"use strict";

	var $ = layui.jquery,
		layer = layui.layer;

	var common = {
		/**
		 * 抛出一个异常错误信息
		 * @param {String} msg
		 */
		throwError: function(msg) {
			throw new Error(msg);
			return;
		},
		/**
		 * 弹出一个错误提示
		 * @param {String} msg
		 */
		msgError: function(msg) {
			layer.msg(msg, {
				icon: 5
			});
			return;
		}
	};

	exports('common', common);
});

/**
 * tableid 填入 table 元素的ID值，idname id的名称
 * @param tableid
 * @param idname
 * @returns {*}
 */
function getSelectedRow(tableid, idname) {
    var id;
    layui.use('table', function() {
        var table = layui.table;
        var $ = layui.$;
        // 获取选中数据
        var checkStatus = table.checkStatus(tableid), data = checkStatus.data;
        if (data.length != 1) {
            alert("只能勾选一个");
            return;
        }
        id = data[0][idname];
    });
    return id;
}

/**
 * tableid 填入 table 元素的ID值，idname id的名称
 * @param tableid
 * @param idname
 * @returns {string}
 */
function getSelectedRows(tableid, idname) {
    var ids = [];
    layui.use('table', function() {
        var table = layui.table;
        var id;
        // var $ = layui.$;
        // 获取选中数据
        var checkStatus = table.checkStatus(tableid), data = checkStatus.data;
        if (data.length == 0) {
            alert("请勾选数据后再点击");
            return;
        }
        for (i = 0; i < data.length; i++) {
            ids[i] = data[i][idname];
        }
    });
    return ids.join(",");
}