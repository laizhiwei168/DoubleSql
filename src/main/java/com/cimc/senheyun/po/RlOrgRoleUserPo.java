package com.cimc.senheyun.po;

import java.util.Date;

public class RlOrgRoleUserPo {
    private String pkOrgRoleUser;

    private String pkUser;

    private String pkOrgRole;

    private String pkCompany;

    private String creator;

    private Date creatortime;

    private String modifier;

    private Date modifiedtime;

    private Integer enablestate;

   

    public String getPkOrgRoleUser() {
        return pkOrgRoleUser;
    }

    public void setPkOrgRoleUser(String pkOrgRoleUser) {
        this.pkOrgRoleUser = pkOrgRoleUser == null ? null : pkOrgRoleUser.trim();
    }

    public String getPkUser() {
        return pkUser;
    }

    public void setPkUser(String pkUser) {
        this.pkUser = pkUser == null ? null : pkUser.trim();
    }

    public String getPkOrgRole() {
        return pkOrgRole;
    }

    public void setPkOrgRole(String pkOrgRole) {
        this.pkOrgRole = pkOrgRole == null ? null : pkOrgRole.trim();
    }

    public String getPkCompany() {
        return pkCompany;
    }

    public void setPkCompany(String pkCompany) {
        this.pkCompany = pkCompany == null ? null : pkCompany.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreatortime() {
        return creatortime;
    }

    public void setCreatortime(Date creatortime) {
        this.creatortime = creatortime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier == null ? null : modifier.trim();
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public Integer getEnablestate() {
        return enablestate;
    }

    public void setEnablestate(Integer enablestate) {
        this.enablestate = enablestate;
    }
}