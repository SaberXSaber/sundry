package com.gsb.sundry.pojo;

/**
 * Created by IntelliJ IDEA.
 * User: guoshubo
 * Date: 2017/3/6
 * Time: 17:07
 * Description：
 */
public class BuyCondition {



    public static int DEFAULT_PAGE_SIZE = 15;
    private int rows = DEFAULT_PAGE_SIZE; //行数
    private int page = 1; //当前页
    private int recordTotal = -1; //记录总数
    private int recordStart =0;
    private int recordEnd = 15;
    private int total = -1; //页码记录
    private String  searchTime;


    private String sord; //排序
    private String sidx;

    public String getSidx() {
        return sidx;
    }

    public void setSidx(String sidx) {
        this.sidx = sidx;
    }

    private String searchField;//查询字段
    private String searchString;//查询值
    private String searchOper;//查询条件

    private String sqlCondition;

    private String filters;


    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
        int recordStart = (this.getPage()-1)*rows;
        this.setRecordStart(recordStart);
        this.setRecordEnd(this.getRecordStart()+rows);
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;

    }



    public int getTotal() {
        if( this.getRecordTotal()%this.rows>0){
            return  this.getRecordTotal()/this.rows+1;
        }else {
            return this.getRecordTotal()/this.rows;
        }
    }

    public void setTotal(int total) {
        this.total =total;
    }

    public int getRecordStart() {
        return recordStart;
    }

    public void setRecordStart(int recordStart) {
        this.recordStart = recordStart;
    }

    public String getSord() {
        return sord;
    }

    public void setSord(String sord) {
        this.sord = sord;
    }

    public String getSearchField() {
        return searchField;
    }

    public void setSearchField(String searchField) {
        this.searchField = searchField;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public String getSearchOper() {
        return searchOper;
    }

    public void setSearchOper(String searchOper) {
        this.searchOper = searchOper;
    }


    public int getRecordEnd() {
        return recordEnd;
    }

    public void setRecordEnd(int recordEnd) {
        this.recordEnd = recordEnd;
    }

    public int getRecordTotal() {
        return recordTotal;
    }

    public void setRecordTotal(int recordTotal) {
        this.recordTotal = recordTotal;
    }

    public void setSqlCondition(String sqlCondition) {
        this.sqlCondition = sqlCondition;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }


    private Double oneMonth ;
    private Double threeMonth;
    private Double sixMonth;
    private Double oneYear;
    private Double threeYear;
    private Double always ;

    public Double getThreeYear() {
        return threeYear;
    }

    public void setThreeYear(Double threeYear) {
        this.threeYear = threeYear;
    }

    public Double getOneMonth() {
        return oneMonth;
    }

    public void setOneMonth(Double oneMonth) {
        this.oneMonth = oneMonth;
    }

    public Double getThreeMonth() {
        return threeMonth;
    }

    public void setThreeMonth(Double threeMonth) {
        this.threeMonth = threeMonth;
    }

    public Double getSixMonth() {
        return sixMonth;
    }

    public void setSixMonth(Double sixMonth) {
        this.sixMonth = sixMonth;
    }

    public Double getOneYear() {
        return oneYear;
    }

    public void setOneYear(Double oneYear) {
        this.oneYear = oneYear;
    }

    public Double getAlways() {
        return always;
    }

    public void setAlways(Double always) {
        this.always = always;
    }

    public PageBean getPageBean() {
        return pageBean;
    }

    public void setPageBean(PageBean pageBean) {
        this.pageBean = pageBean;
    }

    private PageBean pageBean;
}
