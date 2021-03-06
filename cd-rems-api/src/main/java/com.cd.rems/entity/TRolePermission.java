package com.cd.rems.entity;

import java.io.Serializable;

public class TRolePermission implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_permission.rolePermId
     *
     * @mbg.generated
     */
    private Integer rolepermid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_permission.roleName
     *
     * @mbg.generated
     */
    private String rolename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_permission.permissionName
     *
     * @mbg.generated
     */
    private String permissionname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_role_permission
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_permission.rolePermId
     *
     * @return the value of t_role_permission.rolePermId
     *
     * @mbg.generated
     */
    public Integer getRolepermid() {
        return rolepermid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_permission.rolePermId
     *
     * @param rolepermid the value for t_role_permission.rolePermId
     *
     * @mbg.generated
     */
    public void setRolepermid(Integer rolepermid) {
        this.rolepermid = rolepermid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_permission.roleName
     *
     * @return the value of t_role_permission.roleName
     *
     * @mbg.generated
     */
    public String getRolename() {
        return rolename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_permission.roleName
     *
     * @param rolename the value for t_role_permission.roleName
     *
     * @mbg.generated
     */
    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_permission.permissionName
     *
     * @return the value of t_role_permission.permissionName
     *
     * @mbg.generated
     */
    public String getPermissionname() {
        return permissionname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_permission.permissionName
     *
     * @param permissionname the value for t_role_permission.permissionName
     *
     * @mbg.generated
     */
    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname == null ? null : permissionname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rolepermid=").append(rolepermid);
        sb.append(", rolename=").append(rolename);
        sb.append(", permissionname=").append(permissionname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}