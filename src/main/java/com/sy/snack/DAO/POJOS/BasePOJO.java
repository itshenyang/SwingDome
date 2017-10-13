package com.sy.snack.DAO.POJOS;

import org.apache.ibatis.type.Alias;

/**
 * Created by Administrator on 2017/10/13.
 */
@Alias("basepojo")
public class BasePOJO  {
    private String tokenuserid;

    private String tag;

    private String versions;

    public String getTokenuserid() {
        return tokenuserid;
    }

    public void setTokenuserid(String tokenuserid) {
        this.tokenuserid = tokenuserid;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getVersions() {
        return versions;
    }

    public void setVersions(String versions) {
        this.versions = versions;
    }

    @Override
    public String toString() {
        return "BasePOJO{" +
                "tokenuserid='" + tokenuserid + '\'' +
                ", tag='" + tag + '\'' +
                ", versions='" + versions + '\'' +
                '}';
    }
}
