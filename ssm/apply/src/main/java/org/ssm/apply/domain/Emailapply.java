package org.ssm.apply.domain;

import java.util.Date;

public class Emailapply {
    private Integer eid;

    private String zone;

    private String worksite;

    private String ename;

    private String allname;

    private Integer isdelete;

    private Date createtime;

    private Date updatetime;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone == null ? null : zone.trim();
    }

    public String getWorksite() {
        return worksite;
    }

    public void setWorksite(String worksite) {
        this.worksite = worksite == null ? null : worksite.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getAllname() {
        return allname;
    }

    public void setAllname(String allname) {
        this.allname = allname == null ? null : allname.trim();
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