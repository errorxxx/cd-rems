package com.cd.rems.entity;

import java.util.List;
import java.util.Map;

/**
 * @Description 前端菜单栏
 * @Autor 谢修继
 * @Date 2019/11/11 21:48
 */
public class TreeModel {
    private int id;//菜单树id
    private String name;//菜单树名称
    private int parentId;//菜单树父id
    private List<TreeModel> children;//子节点
    private boolean disabled;//是否禁用
    private Map<String, String> params;//参数
    private String icon;//菜单图标
    private String title;//菜单名称
    private String href;//菜单路径

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TreeModel> getChildren() {
        return children;
    }

    public void setChildren(List<TreeModel> children) {
        this.children = children;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
