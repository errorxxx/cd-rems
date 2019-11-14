package com.cd.rems.controller;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Reference;
import com.cd.rems.api.NavApi;
import com.cd.rems.entity.TNav;
import com.cd.rems.entity.TreeModel;
import com.cd.rems.utils.MenuUtils;
import com.cd.rems.utils.RetCode;
import com.cd.rems.utils.RetResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

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
    public RetResult getAllVisibleMenuByTypeAndUser( HttpServletRequest request) {
        TNav navEntity = new TNav();
        //if(navBean != null){
            navEntity.setNavtype((short)1);//菜单类型 1-后台导航菜单，2-前台导航菜单，3-移动端导航菜单
        //}
        List<TNav> navEntities = navApi.getAllVisibleMenuByType(navEntity);
        List<TNav> navMenu = new ArrayList<>();
        //String userName = (String)request.getSession().getAttribute("username");
        //Set<String> permissions = userService.getPermissions(userName);
        List<Integer> cid = new ArrayList<>();
        List<Integer> navcIds = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
//        for(String permis : permissions){
//            if(permis.indexOf(":") > 0){
//                int navcId = Integer.parseInt(permis.split(":")[0]);
//                cid.add(navcId);
//            }
//        }
//        for(int i = 0;i < cid.size();i++){
//            if(!navcIds.contains(cid.get(i))){
//                navcIds.add(cid.get(i));
//            }
//        }
        for(int i = 0; i < navEntities.size(); i++){
            //if(navcIds.contains(navEntities.get(i).getcId())){
                navMenu.add(navEntities.get(i));
            //}
        }
        map.put("navMenu", navMenu);
        //map.put("navcIds", navcIds);
        return new RetResult(RetCode.SUCCESS.getCode(),"success",navMenu);
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
                tree.setId(sm.getCid());
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

