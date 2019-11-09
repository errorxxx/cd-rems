package com.cd.rems.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cd.rems.api.NavApi;
import com.cd.rems.entity.TNav;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/nav")
public class NavController {
    @Reference
    NavApi navApi;
    /**
     * 根据导航类型获取可见导航菜单
     * @return
     */
    @RequestMapping("/getAllVisibleMenuByType")
    @ResponseBody
    public Map<String,Object> getAllVisibleMenuByType() {
        TNav nav = new TNav();
        //if(navBean != null){
        //navEntity.setNavType(navBean.getNavType());//菜单类型 1-后台导航菜单，2-前台导航菜单，3-移动端导航菜单
        //}
        nav.setNavtype(Short.valueOf("1"));
        List<TNav> navEntities = navApi.getAllVisibleMenuByType(nav);
        Map<String,Object> result = new HashMap<String,Object>();
        result.put("data", navEntities);
        result.put("count", navEntities.size());
        result.put("code", 0);
        result.put("msg", "");
        return result;
    }
}

