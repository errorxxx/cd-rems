/**
 * Created by wanglin on 2017-09-11.
 */

/**
 * 设置cookie
 * @param name
 * @param value
 * @param days
 */
function setCookie (name, value, days){
    var d = new Date;
    d.setTime(d.getTime() + 24*60*60*1000*days);
    window.document.cookie = name + "=" + value + ";path=/;expires=" + d.toGMTString();

};

function getCookieUserId(){
	return getCookie("userId");
}

function getCookieOrgId(){
	return getCookie("orgId");
}

function getCookieDeptId(){
	return getCookie("deptId");
}

/**
 * 获取cookie
 * @param name
 * @returns {null}
 */
function getCookie(name) {
    var v = window.document.cookie.match('(^|;) ?' + name + '=([^;]*)(;|$)');
    return v ? v[2] : null;
};

/**
 * 删除cookie
 * @param name
 */
function delCookie (name) {
    this.setCookie(name, '', -1);
};

/**获取链接中的参数*/
function GetQueryString(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
    var r = window.location.search.substr(1).match(reg);
    if (r != null) return unescape(r[2]);
    return null;
}

/*var employeeId = GetQueryString("user");
var userId = GetQueryString("userId");

if(employeeId!=null && userId!=null){
    setCookie("him-employeeId",employeeId,1);
    setCookie("hnms-userid",userId,1);
}else{
    delCookie("him-employeeId");
}
*/
Vue.http.options.headers = {
    'Content-Type': 'application/json;charset=UTF-8',
    'userId':getCookie("hnms-userid"),
    'token':getCookie("hnms-token")
}

var contextPath = "/cd-rems";

/**
 * 菜单权限验证
 */
function checkUserFunction(mId) {
    var uid = getCookie("hnms-userid");

    if(uid==null){
        if(window.parent.vm_user!=null){
            window.parent.vm_user.lock();
        }else{
            window.parent.location = "login.html";
        }

        return;
    }

    Vue.resource('http://localhost:8082/cdxt-ics/card/gwione/read').query(
    		).then(function(response){
    	console.log(response);
    }).catch(function(response){
        console.log(response);
    });
}

/**
 * 菜单权限验证
 */
function checkUserMenuBtn() {
    var uid = getCookie("hnms-userid");

    //管理员
    if(uid==1){
        return;
    }
    var mId = GetQueryString('menuId');
    if(mId!=null){
    	$(":button").each(function(){
    		var id = $(this).attr("id");
    		if(id!=undefined){
    			$("#"+id).hide();
    		}
    	})
    	
    	Vue.resource(contextPath+'/api/user/{userId}/menuBtn/{menuId}'
        ).query({
            	userId:uid,
            	menuId:mId
            }
        ).then(function(response){
        	$.each(response.data,function(index,value){
        		var btnId = value.url;
        		$("#"+btnId).show();
        	});
        }).catch(function(response){
        });
    }
    
}


/**系统后台出错提示弹窗*/
Vue.prototype.showMsgError=function(msg){
   /* this.$message({
        type: 'fail',
        showClose:true,
        duration:1000,
        message: msg
    });*/
	this.$alert(msg);
}

/**系统保存成功提示弹窗*/
Vue.prototype.showMsgSuccess=function(msg){
	this.$message({
		type: 'success',
		showClose:true,
		duration:1000,
		message: msg
	});
}

//时间格式化
function dateFormat(date,fmt) { //author: meizz   
	if(!date){
		return null;
	}
	if(fmt == null){
		fmt = "yyyy-MM-dd hh:mm:ss";
	}
	var o = {
		"M+": date.getMonth() + 1, //月份   
		"d+": date.getDate(), //日   
		"h+": date.getHours(), //小时   
		"m+": date.getMinutes(), //分   
		"s+": date.getSeconds(), //秒   
		"q+": Math.floor((date.getMonth() + 3) / 3), //季度   
		"S": date.getMilliseconds() //毫秒   
	};
	if (/(y+)/.test(fmt))
		fmt = fmt.replace(RegExp.$1, (date.getFullYear() + "").substr(4 - RegExp.$1.length));
	for (var k in o)
		if (new RegExp("(" + k + ")").test(fmt))
			fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
	return fmt;
}
//时间比较
function examineDates(startDate, endDate) {
	if (startDate != '' && startDate != undefined && endDate != '' && endDate != undefined) {
		var date1 = Date.parse(new Date(endDate));
		var date2 = Date.parse(new Date(startDate));
		var date3 = date1 - date2;
		if (date3 < 0) {
			alert("结束时间不能小于开始时间！");
			return false;
		}
	}
	return true;
}

/*
 *   功能:实现VBScript的DateAdd功能.
 *   参数:interval,字符串表达式，表示要添加的时间间隔类型，年、月、日，周等.
 *   参数:number,数值表达式，表示要添加的时间间隔的个数.
 *   参数:date,时间对象.
 *   返回:新的时间对象.
 *   var now = new Date();
 *   var newDate = DateAdd( "d ", 5, now);
 *---------------   DateAdd(interval,number,date)   -----------------
 */
function DateAdd(interval, number, date) {
    switch (interval) {
	    case "y": {
	        date.setFullYear(date.getFullYear() + number);
	        return date;
	        break;
	    }
	    case "q": {
	        date.setMonth(date.getMonth() + number * 3);
	        return date;
	        break;
	    }
	    case "m": {
	        date.setMonth(date.getMonth() + number);
	        return date;
	        break;
	    }
	    case "w": {
	        date.setDate(date.getDate() + number * 7);
	        return date;
	        break;
	    }
	    case "d": {
	        date.setDate(date.getDate() + number);
	        return date;
	        break;
	    }
	    case "h": {
	        date.setHours(date.getHours() + number);
	        return date;
	        break;
	    }
	    case "m": {
	        date.setMinutes(date.getMinutes() + number);
	        return date;
	        break;
	    }
	    case "s": {
	        date.setSeconds(date.getSeconds() + number);
	        return date;
	        break;
	    }
	    default: {
	        date.setDate(d.getDate() + number);
	        return date;
	        break;
	    }
	}
}
/** 
 * 计算2个日期相差的天数，包含今天，如：2016-12-13到2016-12-15，相差3天 
 * @param startDateString 
 * @param endDateString 
 * @returns 
 */  
function dateDiffIncludeToday(startDate, endDate){  
    var startDate = new Date(startDate);  
    var endDate = new Date(endDate);  
    return parseInt(Math.abs(endDate - startDate ) / 1000 / 60 / 60 /24) + 1;//把相差的毫秒数转换为天数   
}; 

/**
 * 电话号码校验
 */
var phoneValidate = function(rule, value, callback){
	if (value == null || value =='') {
		callback();
		return;
	}
	if(value.match(/^1[3-9]\d{9}$/)){
		callback();
	}else{
		callback(new Error('格式错误'));
	}
}
// 身份证号校验
var idValidate = function(rule, id , callback){
    if (id == null || id =='') {
        callback();
        return;
    }
	// 1 "验证通过!", 0 //校验不通过
    var format = /^(([1][1-5])|([2][1-3])|([3][1-7])|([4][1-6])|([5][0-4])|([6][1-5])|([7][1])|([8][1-2]))\d{4}(([1][9]\d{2})|([2]\d{3}))(([0][1-9])|([1][0-2]))(([0][1-9])|([1-2][0-9])|([3][0-1]))\d{3}[0-9xX]$/;
    //号码规则校验
    if(!format.test(id)){
        callback(new Error('身份证号码不合规'));
    }
    //区位码校验
    //出生年月日校验   前正则限制起始年份为1900;
    var year = id.substr(6,4),//身份证年
        month = id.substr(10,2),//身份证月
        date = id.substr(12,2),//身份证日
        time = Date.parse(month+'-'+date+'-'+year),//身份证日期时间戳date
        now_time = Date.parse(new Date()),//当前时间戳
        dates = (new Date(year,month,0)).getDate();//身份证当月天数
    if(time>now_time||date>dates){
        callback(new Error('出生日期不合规'));
    }
    //校验码判断
    var c = new Array(7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2);   //系数
    var b = new Array('1','0','X','9','8','7','6','5','4','3','2');  //校验码对照表
    var id_array = id.split("");
    var sum = 0;
    for(var k=0;k<17;k++){
        sum+=parseInt(id_array[k])*parseInt(c[k]);
    }
    if(!id_array[17] || id_array[17].toUpperCase() != b[sum%11].toUpperCase()){
        callback(new Error('身份证校验码不合规'));
    }
    callback();
}

/**
 * 金额大于0校验
 */
var amountValidate = function(rule, value, callback){
	if (value == null || value =='') {
		callback();
		return;
	}
	if(value>0){
		callback();
	}else{
		callback(new Error('金额必须大于0'));
	}
}

/**
 * 邮编格式校验
 */
var postcodeValidate = function(rule, value, callback){
	if (value == null || value =='') {
		callback();
		return;
	}
	if(value.match(/^[0-9]{6}$/)){
		callback();
	}else{
		callback(new Error('格式错误'));
	}
}

/*根据出生日期算出年龄*/
function jsGetAge(strBirthday){       
    var returnAge;
    var strBirthdayArr=strBirthday.split("-");
    var birthYear = strBirthdayArr[0];
    var birthMonth = strBirthdayArr[1];
    var birthDay = strBirthdayArr[2];
    
    d = new Date();
    var nowYear = d.getFullYear();
    var nowMonth = d.getMonth() + 1;
    var nowDay = d.getDate();
    
    if(nowYear == birthYear){
        returnAge = 0;//同年 则为0岁
    }
    else{
        var ageDiff = nowYear - birthYear ; //年之差
        if(ageDiff > 0){
            if(nowMonth == birthMonth) {
                var dayDiff = nowDay - birthDay;//日之差
                if(dayDiff < 0)
                {
                    returnAge = ageDiff - 1;
                }
                else
                {
                    returnAge = ageDiff ;
                }
            }
            else
            {
                var monthDiff = nowMonth - birthMonth;//月之差
                if(monthDiff < 0)
                {
                    returnAge = ageDiff - 1;
                }
                else
                {
                    returnAge = ageDiff ;
                }
            }
        }
        else
        {
            returnAge = -1;//返回-1 表示出生日期输入错误 晚于今天
        }
    }
    
    return returnAge;//返回周岁年龄
    
}

/**
 * 查找list中符合条件的第一条数据
 * @param list 要查找的list
 * @param listProp list对象中的属性，用于判断
 * @param matchProp 用于匹配属性的值
 */
function findItem(list, listProp, matchProp){
	for ( var index in list) {
		if(list[index][listProp] === matchProp){
			return list[index];
		}
	}
	return null;
}

/**
 * 判断字符串是否为空
 * @param str 要判断的字符串
 */
function strIsNull(str) {
	str = $.trim(str);
	if(str === null || str === "" || str === undefined){
		return true;
	}else {
		return  false;
	}
}
/**
 * 时间格式YYY-mm-dd hh:mm:ss
 * @param date
 * @returns {String}
 */
function formatDate(date) {
	if(date === null || date === ""){
		return "";
	}
	var day = new Date(date);
	if(day == "Invalid Date"){
		day = new Date(date.replace(/-/g,"/"));
	}
	var Year = 0;
	var Month = 0;
	var Day = 0;
	var CurrentDate = "";
	//初始化时间
	//Year= day.getYear();//有火狐下2008年显示108的bug
	Year= day.getFullYear();//ie火狐下都可以
	Month= day.getMonth()+1;
	Day = day.getDate();
	Hour = day.getHours();
	Minute = day.getMinutes();
	Second = day.getSeconds();
	CurrentDate += Year + "-";
	if (Month >= 10 ) {
		CurrentDate += Month + "-";
	}
	else {
		CurrentDate += "0" + Month + "-";
	}
	if (Day >= 10 ) {
		CurrentDate += Day ;
	}
	else {
		CurrentDate += "0" + Day ;
	}
	if(Hour>=10){
		CurrentDate +=" "+Hour;
	}else{
		CurrentDate +=" "+"0"+Hour;
	}
	if(Minute>=10){
		CurrentDate +=":"+Minute;
	}else{
		CurrentDate +=":"+"0"+Minute;
	}
	if(Second>=10){
		CurrentDate +=":"+Second;
	}else{
		CurrentDate +=":"+"0"+Second;
	}
	return CurrentDate;
}

/**
 * 时间格式YYY-mm-dd
 * @param date
 * @returns {String}
 */
function formatDateSample(date) {
	if(date==undefined||date==""){
		return "";
	}
	var day = new Date(date);
	var Year = 0;
	var Month = 0;
	var Day = 0;
	var CurrentDate = "";
	//初始化时间
	//Year= day.getYear();//有火狐下2008年显示108的bug
	Year= day.getFullYear();//ie火狐下都可以
	Month= day.getMonth()+1;
	Day = day.getDate();
	CurrentDate += Year + "-";
	if (Month >= 10 ) {
		CurrentDate += Month + "-";
	}
	else {
		CurrentDate += "0" + Month + "-";
	}
	if (Day >= 10 ) {
		CurrentDate += Day ;
	}
	else {
		CurrentDate += "0" + Day ;
	}

	return CurrentDate;
}


/**
 * 读取诊疗卡号
 */
function readHcno(callback,callerror) {
//	var ocx = document.getElementById("gwiOcx");
//	var ret = ocx.M1CardOpen();
//	if (ret === 0) {
//		var cardId = ocx.M1CardReadID();
//		if(cardId.indexOf("诊疗卡") === -1){
//			var cardNo = ocx.M1CardHEXRead(1,0,0,"FFFFFFFFFFFF");
//			if(cardNo.indexOf("诊疗卡") === -1){
//				var hcno = cardNo.substring(0,10);
//				ocx.M1CardClose();
//				return hcno;
//			}else{
//				throw new Error(cardNo);
//			}
//		}else{
//			throw new Error(cardNo);
//		}
//	}else{
//		throw new Error("打开设备失败："+ ret);
//	}
//	for (var int = 0; int < 100; int++) {
		Vue.resource('http://localhost:8889/cdxt-ics/card/gwi/read'
	    ).query().then(function(response){
	    	callback(response.bodyText);
	    }).catch(function(response){
//	    	if(response.data.errMsg){
	    		callerror(response.data.errMsg);
//	    	}else{
////	    		callerror("读卡服务异常，请重试");
////	    		Vue.resource(contextPath + '/card/gwi/start'
////	    	    ).query().then(function(response){
////	    	    	
////	    	    }).catch(function(response){
////	    	    	
////	    	    });
//	    	}
	    });
//	}
}

//checkUserMenuBtn();