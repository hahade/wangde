package org.ssm.apply.domain;

import java.util.Date;

public class Other {
    private Integer oid;

    private String odes;

    private Integer isdelete;

    private Date createtime;

    private Date updatetime;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOdes() {
        return odes;
    }

    public void setOdes(String odes) {
        this.odes = odes == null ? null : odes.trim();
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