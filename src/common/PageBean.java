package common;

import java.util.List;

public class PageBean<T> {
    private int pageSize;   //页面大小
    private int currPage;   //当前页数
    private int totalPage;  //总页数
    private List<T> pageList;   //当前页面展示数据

    public PageBean(int pageSize, int currPage, int totalPage) {
        this.pageSize = pageSize;
        this.currPage = currPage;
        this.totalPage = totalPage;
    }

    public PageBean() {

    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getPageList() {
        return pageList;
    }

    public void setPageList(List<T> pageList) {
        this.pageList = pageList;
    }
}
