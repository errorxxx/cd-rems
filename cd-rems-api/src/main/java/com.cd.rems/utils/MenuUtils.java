package com.cd.rems.utils;


import com.cd.rems.entity.TreeModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: MenuUtils
 * @Description:
 * @Author 谢修继
 * @Copyright: Copyright (c) 2018
 * @Company:成都信通网易医疗科技发展有限公司
 * @Date 2018/9/30 17:07
 */
public class MenuUtils {

    public static List<TreeModel> getTrees(List<TreeModel> menus, int topParents) {

        if (menus == null) {
            return menus;
        }

        List<TreeModel> parents = getParents(menus, topParents);

        parents = addChildMenus(parents, menus);

        return parents;
    }

    private static List<TreeModel> getParents(List<TreeModel> menus, int topParents) {
        List<TreeModel> parents = new ArrayList<>();

        Iterator<TreeModel> mi = menus.iterator();
        while (mi.hasNext()) {
            TreeModel m = mi.next();
            if (topParents == m.getParentId()){
                parents.add(m);
                mi.remove();//减少循环的次数
            }
        }

        return parents;
    }

    private static List<TreeModel> addChildMenus(List<TreeModel> parents, List<TreeModel> menus) {

        for (TreeModel p : parents) {
            int pid = p.getId();
            List<TreeModel> childMenus = new ArrayList<>();
            p.setChildren(childMenus);

            Iterator<TreeModel> mi = menus.iterator();
            while (mi.hasNext()) {
                TreeModel child = mi.next();
                if (pid==child.getParentId()) {
                    childMenus.add(child);
                    mi.remove();
                }
            }
            addChildMenus(childMenus, menus);
        }

        return parents;
    }



}
