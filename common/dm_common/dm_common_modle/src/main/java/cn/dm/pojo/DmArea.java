package cn.dm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   区域表
*/
public class DmArea implements Serializable {
    //
    private Long id;
    //区域名称
    private String name;
    //父级区域
    private String parent;
    //分类级别;select;(0:全国,1:1级,2:2级)
    private Integer level;
    //是否是热门城市(0:不是,1:是)
    private Integer isHot;
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
    public void setName (String  name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }
    public void setParent (String  parent){
        this.parent=parent;
    }
    public  String getParent(){
        return this.parent;
    }
    public void setLevel (Integer  level){
        this.level=level;
    }
    public  Integer getLevel(){
        return this.level;
    }
    public void setIsHot (Integer  isHot){
        this.isHot=isHot;
    }
    public  Integer getIsHot(){
        return this.isHot;
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
