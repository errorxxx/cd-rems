package com.cd.rems.controller;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Reference;
import com.cd.rems.api.NavApi;
import com.cd.rems.entity.TNav;
import com.cd.rems.entity.TreeModel;
import com.cd.rems.utils.MenuUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/nav")
public class NavController {
    @Reference
    NavApi navApi;

    /**
     * 根据导航类型获取可见导航菜单
     *
     * @return
     */
    @RequestMapping("/getAllVisibleMenuByType")
    @ResponseBody
    public Map<String, Object> getAllVisibleMenuByType() {
        TNav nav = new TNav();
        //if(navBean != null){
        //navEntity.setNavType(navBean.getNavType());//菜单类型 1-后台导航菜单，2-前台导航菜单，3-移动端导航菜单
        //}
        nav.setNavtype(Short.valueOf("1"));
        List<TNav> navEntities = navApi.getAllVisibleMenuByType(nav);
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("data", navEntities);
        result.put("count", navEntities.size());
        result.put("code", 0);
        result.put("msg", "");
        return result;
    }


     /*
     * @Author 谢修继
     * @Description 后期加上@CookieValue String userId
     * 获取用户信息设置权限
     * @Date 2019/11/11 22:16
     * @Param
     * @return
     **/
    @RequestMapping("/listByUserId")
    protected List<TreeModel> listByUserId() {
        List<TreeModel> result = new ArrayList<>();
        List<TreeModel> trees = new ArrayList<>();
        try {
            TNav nav = new TNav();
            nav.setNavtype(Short.valueOf("1"));
            List<TNav> navEntities = navApi.getAllVisibleMenuByType(nav);
            for (TNav sm : navEntities) {
                TreeModel tree = new TreeModel();
                tree.setId(sm.getNavid());
                tree.setTitle(sm.getNavtitle());
                tree.setParentId(sm.getPid());
                tree.setIcon(sm.getNavimg() == null ? "" : sm.getNavimg());
                tree.setDisabled(sm.getIsvisible());
                String url = sm.getNavurl();
                if (StringUtils.isNotEmpty(url)) {
//                    if (url.indexOf("?") > -1) {
//                        url += "&menuId=" + sm.getNavid() + "&t=" + System.currentTimeMillis();
//                    } else {
//                        url += "?menuId=" + sm.getNavid() + "&t=" + System.currentTimeMillis();
//                    }
                }

                tree.setHref(url);
                trees.add(tree);
            }
            result = MenuUtils.getTrees(trees, 0);
        } catch (Exception e) {
          e.printStackTrace();
        }
        return result;
    }
}

