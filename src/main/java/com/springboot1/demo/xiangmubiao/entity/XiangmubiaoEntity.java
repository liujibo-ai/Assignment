package com.springboot1.demo.xiangmubiao.entity;

import java.util.Date;
public class XiangmubiaoEntity {
    private Integer xiangmuid;
    private String xiangmuname;
    private Integer xiangmuzijin;
    private String cehuaren;

    public XiangmubiaoEntity() {
    }

    public XiangmubiaoEntity(Integer xiangmuid, String xiangmuname, Integer xiangmuzijin, String cehuaren) {
        this.xiangmuid = xiangmuid;
        this.xiangmuname = xiangmuname;
        this.xiangmuzijin = xiangmuzijin;
        this.cehuaren = cehuaren;
    }

    public Integer getXiangmuid() {
        return xiangmuid;
    }

    public void setXiangmuid(Integer xiangmuid) {
        this.xiangmuid = xiangmuid;
    }

    public String getXiangmuname() {
        return xiangmuname;
    }

    public void setXiangmuname(String xiangmuname) {
        this.xiangmuname = xiangmuname;
    }

    public Integer getXiangmuzijin() {
        return xiangmuzijin;
    }

    public void setXiangmuzijin(Integer xiangmuzijin) {
        this.xiangmuzijin = xiangmuzijin;
    }

    public String getCehuaren() {
        return cehuaren;
    }

    public void setCehuaren(String cehuaren) {
        this.cehuaren = cehuaren;
    }

    @Override
    public String toString() {
        return "XiangmubiaoEntity{" +
                "xiangmuid=" + xiangmuid +
                ", xiangmuname='" + xiangmuname + '\'' +
                ", xiangmuzijin=" + xiangmuzijin +
                ", cehuaren='" + cehuaren + '\'' +
                '}';
    }
}
