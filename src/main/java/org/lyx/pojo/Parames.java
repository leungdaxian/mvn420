package org.lyx.pojo;

public class Parames {
    private Integer pageCurrent=1;
    private Integer pageSize=8;

    public Integer getPageCurrent() {
        return pageCurrent;
    }

    public void setPageCurrent(Integer pageCurrent) {
        this.pageCurrent = pageCurrent;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Parames() {
    }

    public Parames(Integer pageCurrent, Integer pageSize) {
        this.pageCurrent = pageCurrent;
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "Parames{" +
                "pageCurrent=" + pageCurrent +
                ", pageSize=" + pageSize +
                '}';
    }
}
