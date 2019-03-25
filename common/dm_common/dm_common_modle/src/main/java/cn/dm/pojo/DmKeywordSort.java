package cn.dm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   热门关键词排序表
*/
public class DmKeywordSort implements Serializable {
    //
    private Long id;
    //搜索关键词
    private String keyword;
    //搜索数目
    private Integer count;
    //
    private Date createdTime;
    //
    private Date updatedTime;
    //get set 方法
    public void setId (Long  id){
        this.id=id;
    }
    public  Long getId(){
        return this.id;
    }
    public void setKeyword (String  keyword){
        this.keyword=keyword;
    }
    public  String getKeyword(){
        return this.keyword;
    }
    public void setCount (Integer  count){
        this.count=count;
    }
    public  Integer getCount(){
        return this.count;
    }
    public void setCreatedTime (Date  createdTime){
        this.createdTime=createdTime;
    }
    public  Date getCreatedTime(){
        return this.createdTime;
    }
    public void setUpdatedTime (Date  updatedTime){
        this.updatedTime=updatedTime;
    }
    public  Date getUpdatedTime(){
        return this.updatedTime;
    }
}
