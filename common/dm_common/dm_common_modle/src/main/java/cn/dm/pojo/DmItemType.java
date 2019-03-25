package cn.dm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   节目类型表
*/
public class DmItemType implements Serializable {
    //主键
    private Long id;
    //类型名称
    private String itemType;
    //分类级别;select;(1:1级,2:2级)
    private String level;
    //父级类型
    private Long parent;
    //类别别名
    private String aliasName;
    //页面模板类型
    private String key;
    //创建时间
    private Date createdTime;
    //更新时间
    private Date updatedTime;
    //get set 方法
    public void setId (Long  id){
        this.id=id;
    }
    public  Long getId(){
        return this.id;
    }
    public void setItemType (String  itemType){
        this.itemType=itemType;
    }
    public  String getItemType(){
        return this.itemType;
    }
    public void setLevel (String  level){
        this.level=level;
    }
    public  String getLevel(){
        return this.level;
    }
    public void setParent (Long  parent){
        this.parent=parent;
    }
    public  Long getParent(){
        return this.parent;
    }
    public void setAliasName (String  aliasName){
        this.aliasName=aliasName;
    }
    public  String getAliasName(){
        return this.aliasName;
    }
    public void setKey (String  key){
        this.key=key;
    }
    public  String getKey(){
        return this.key;
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
