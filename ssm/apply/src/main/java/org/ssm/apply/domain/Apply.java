package org.ssm.apply.domain;

import java.util.Date;

public class Apply {
    private Integer apid;

    private Integer aid;

    private Date applytime;

    private String statu;

    private String adept;

    private Integer uid;

    private String uname;

    private String approve;

    private String assigner;

    private String dealer;

    private String aphone;

    private String atitle;

    private String areason;

    private String afile;

    private String aremark;

    private Integer isdelete;

    private Date createtime;

    private Date updatetime;

    public Integer getApid() {
        return apid;
    }

    public void setApid(Integer apid) {
        this.apid = apid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu == null ? null : statu.trim();
    }

    public String getAdept() {
        return adept;
    }

    public void setAdept(String adept) {
        this.adept = adept == null ? null : adept.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getApprove() {
        return approve;
    }

    public void setApprove(String approve) {
        this.approve = approve == null ? null : approve.trim();
    }

    public String getAssigner() {
        return assigner;
    }

    public void setAssigner(String assigner) {
        this.assigner = assigner == null ? null : assigner.trim();
    }

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer == null ? null : dealer.trim();
    }

    public String getAphone() {
        return aphone;
    }

    public void setAphone(String aphone) {
        this.aphone = aphone == null ? null : aphone.trim();
    }

    public String getAtitle() {
        return atitle;
    }

    public void setAtitle(String atitle) {
        this.atitle = atitle == null ? null : atitle.trim();
    }

    public String getAreason() {
        return areason;
    }

    public void setAreason(String areason) {
        this.areason = areason == null ? null : areason.trim();
    }

    public String getAfile() {
        return afile;
    }

    public void setAfile(String afile) {
        this.afile = afile == null ? null : afile.trim();
    }

    public String getAremark() {
        return aremark;
    }

    public void setAremark(String aremark) {
        this.aremark = aremark == null ? null : aremark.trim();
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}