;layui.define("layer",function(e){"use strict";var i=layui.$,t=layui.layer,a=layui.hint(),n=layui.device(),l="form",r=".layui-form",s="layui-this",u="layui-hide",o="layui-disabled",c=function(){this.config={verify:{required:[/[\S]+/,"必填项不能为空"],phone:[/^1\d{10}$/,"请输入正确的手机号"],email:[/^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/,"邮箱格式不正确"],url:[/(^#)|(^http(s*):\/\/[^\s]+\.[^\s]+)/,"链接格式不正确"],number:function(e){if(!e||isNaN(e))return"只能填写数字"},date:[/^(\d{4})[-\/](\d{1}|0\d{1}|1[0-2])([-\/](\d{1}|0\d{1}|[1-2][0-9]|3[0-1]))*$/,"日期格式不正确"],identity:[/(^\d{15}$)|(^\d{17}(x|X|\d)$)/,"请输入正确的身份证号"]}}};c.prototype.set=function(e){var t=this;return i.extend(!0,t.config,e),t},c.prototype.verify=function(e){var t=this;return i.extend(!0,t.config.verify,e),t},c.prototype.on=function(e,i){return layui.onevent.call(this,l,e,i)},c.prototype.render=function(e,t){var n=this,c=i(r+function(){return t?'[lay-filter="'+t+'"]':""}()),d={select:function(){var e,t="请选择",a="layui-form-select",n="layui-select-title",r="layui-select-none",d="",f=c.find("select"),y=function(t,l){i(t.target).parent().hasClass(n)&&!l||(i("."+a).removeClass(a+"ed "+a+"up"),e&&d&&e.val(d)),e=null},h=function(t,c,f){var h=i(this),p=t.find("."+n),m=p.find("input"),k=t.find("dl"),g=k.children("dd");if(!c){var b=function(){var e=t.offset().top+t.outerHeight()+5-v.scrollTop(),i=k.outerHeight();t.addClass(a+"ed"),g.removeClass(u),e+i>v.height()&&e>=i&&t.addClass(a+"up")},x=function(e){t.removeClass(a+"ed "+a+"up"),m.blur(),e||C(m.val(),function(e){e&&(d=k.find("."+s).html(),m&&m.val(d))})};p.on("click",function(e){t.hasClass(a+"ed")?x():(y(e,!0),b()),k.find("."+r).remove()}),p.find(".layui-edge").on("click",function(){m.focus()}),m.on("keyup",function(e){var i=e.keyCode;9===i&&b()}).on("keydown",function(e){var i=e.keyCode;9===i?x():13===i&&e.preventDefault()});var C=function(e,t,a){var n=0;layui.each(g,function(){var t=i(this),l=t.text().toUpperCase(),r=l.indexOf(e)===-1;(""===e||"blur"===a?e!==l:r)&&n++,"keyup"===a&&t[r?"addClass":"removeClass"](u)});var l=n===g.length;return t(l),l},w=function(e){var i=this.value.toUpperCase(),t=e.keyCode;return 9!==t&&13!==t&&37!==t&&38!==t&&39!==t&&40!==t&&(C(i,function(e){e?k.find("."+r)[0]||k.append('<p class="'+r+'">无匹配项</p>'):k.find("."+r).remove()},"keyup"),void(""===i&&k.find("."+r).remove()))};f&&m.on("keyup",w).on("blur",function(i){e=m,d=k.find("."+s).html(),setTimeout(function(){C(m.val(),function(e){d||m.val("")},"blur")},200)}),g.on("click",function(){var e=i(this),a=e.attr("lay-value"),n=h.attr("lay-filter");return!e.hasClass(o)&&(e.hasClass("layui-select-tips")?m.val(""):(m.val(e.text()),e.addClass(s)),e.siblings().removeClass(s),h.val(a).removeClass("layui-form-danger"),layui.event.call(this,l,"select("+n+")",{elem:h[0],value:a,othis:t}),x(!0),!1)}),t.find("dl>dt").on("click",function(e){return!1}),i(document).off("click",y).on("click",y)}};f.each(function(e,l){var r=i(this),u=r.next("."+a),c=this.disabled,d=l.value,f=i(l.options[l.selectedIndex]),y=l.options[0],mh=r.attr("max-height");if("string"==typeof r.attr("lay-ignore"))return r.show();var v="string"==typeof r.attr("lay-search"),p=y?y.value?t:y.innerHTML||t:t,m=i(['<div class="'+(v?"":"layui-unselect ")+a+(c?" layui-select-disabled":"")+'">','<div class="'+n+'"><input type="text" placeholder="'+p+'" value="'+(d?f.html():"")+'" '+(v?"":"readonly")+' class="layui-input'+(v?"":" layui-unselect")+(c?" "+o:"")+'">','<i class="layui-edge"></i></div>','<dl class="layui-anim layui-anim-upbit'+(r.find("optgroup")[0]?" layui-select-group":"")+'"'+(mh==undefined?'':' style="max-height: '+mh+';"')+'">'+function(e){var i=[];return layui.each(e,function(e,a){0!==e||a.value?"optgroup"===a.tagName.toLowerCase()?i.push("<dt>"+a.label+"</dt>"):i.push('<dd lay-value="'+a.value+'" class="'+(d===a.value?s:"")+(a.disabled?" "+o:"")+'">'+a.innerHTML+"</dd>"):i.push('<dd lay-value="" class="layui-select-tips">'+(a.innerHTML||t)+"</dd>")}),0===i.length&&i.push('<dd lay-value="" class="'+o+'">没有选项</dd>'),i.join("")}(r.find("*"))+"</dl>","</div>"].join(""));u[0]&&u.remove(),r.after(m),h.call(this,m,c,v)})},checkbox:function(){var e={checkbox:["layui-form-checkbox","layui-form-checked","checkbox"],_switch:["layui-form-switch","layui-form-onswitch","switch"]},t=c.find("input[type=checkbox]"),a=function(e,t){var a=i(this);e.on("click",function(){var i=a.attr("lay-filter"),n=(a.attr("lay-text")||"").split("|");a[0].disabled||(a[0].checked?(a[0].checked=!1,e.removeClass(t[1]).find("em").text(n[1])):(a[0].checked=!0,e.addClass(t[1]).find("em").text(n[0])),layui.event.call(a[0],l,t[2]+"("+i+")",{elem:a[0],value:a[0].value,othis:e}))})};t.each(function(t,n){var l=i(this),r=l.attr("lay-skin"),s=(l.attr("lay-text")||"").split("|"),u=this.disabled;"switch"===r&&(r="_"+r);var c=e[r]||e.checkbox;if("string"==typeof l.attr("lay-ignore"))return l.show();var d=l.next("."+c[0]),f=i(['<div class="layui-unselect '+c[0]+(n.checked?" "+c[1]:"")+(u?" layui-checkbox-disbaled "+o:"")+'" lay-skin="'+(r||"")+'">',{_switch:"<em>"+((n.checked?s[0]:s[1])||"")+"</em><i></i>"}[r]||(n.title.replace(/\s/g,"")?"<span>"+n.title+"</span>":"")+'<i class="layui-icon">'+(r?"&#xe605;":"&#xe618;")+"</i>","</div>"].join(""));d[0]&&d.remove(),l.after(f),a.call(this,f,c)})},radio:function(){var e="layui-form-radio",t=["&#xe643;","&#xe63f;"],a=c.find("input[type=radio]"),n=function(a){var n=i(this),s="layui-anim-scaleSpring";a.on("click",function(){var u=n[0].name,o=n.parents(r),c=n.attr("lay-filter"),d=o.find("input[name="+u.replace(/(\.|#|\[|\])/g,"\\$1")+"]");n[0].disabled||(layui.each(d,function(){var a=i(this).next("."+e);this.checked=!1,a.removeClass(e+"ed"),a.find(".layui-icon").removeClass(s).html(t[1])}),n[0].checked=!0,a.addClass(e+"ed"),a.find(".layui-icon").addClass(s).html(t[0]),layui.event.call(n[0],l,"radio("+c+")",{elem:n[0],value:n[0].value,othis:a}))})};a.each(function(a,l){var r=i(this),s=r.next("."+e),u=this.disabled;if("string"==typeof r.attr("lay-ignore"))return r.show();var c=i(['<div class="layui-unselect '+e+(l.checked?" "+e+"ed":"")+(u?" layui-radio-disbaled "+o:"")+'">','<i class="layui-anim layui-icon">'+t[l.checked?0:1]+"</i>","<span>"+(l.title||"未命名")+"</span>","</div>"].join(""));s[0]&&s.remove(),r.after(c),n.call(this,c)})}};return e?d[e]?d[e]():a.error("不支持的"+e+"表单渲染"):layui.each(d,function(e,i){i()}),n};var d=function(){var e=i(this),a=f.config.verify,s=null,u="layui-form-danger",o={},c=e.parents(r),d=c.find("*[lay-verify]"),y=e.parents("form")[0],v=c.find("input,select,textarea"),h=e.attr("lay-filter");return layui.each(d,function(e,l){var r=i(this),o=r.attr("lay-verify").split("|"),c=r.attr("lay-verType"),d=r.val();if(r.removeClass(u),layui.each(o,function(e,i){var o,f="",y="function"==typeof a[i];if(a[i]){var o=y?f=a[i](d,l):!a[i][0].test(d);if(f=f||a[i][1],o&&"required"===i||o&&d)return"tips"===c?t.tips(f,r,{tips:1}):"alert"===c?t.alert(f,{title:"提示",shadeClose:!0}):t.msg(f,{icon:5,shift:6}),n.android||n.ios||l.focus(),r.addClass(u),s=!0}}),s)return s}),!s&&(layui.each(v,function(e,i){i.name&&(/^checkbox|radio$/.test(i.type)&&!i.checked||(o[i.name]=i.value))}),layui.event.call(this,l,"submit("+h+")",{elem:this,form:y,field:o}))},f=new c,y=i(document),v=i(window);f.render(),y.on("reset",r,function(){var e=i(this).attr("lay-filter");setTimeout(function(){f.render(null,e)},50)}),y.on("submit",r,d).on("click","*[lay-submit]",d),e(l,f)});