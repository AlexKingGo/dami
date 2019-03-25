package cn.dm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   图片表
*/
public class DmImage implements Serializable {
    //
    private Long id;
    //图片URL
    private String imgUrl;
    //关联表ID
    private Integer targetId;
    //顺序
    private Integer sort;
    //图片类型（0:无类型 1:轮播图 2:海报图）
    private Integer type;
    //图片分类（0：用户头像 1：商品图片）
    private Integer category;
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
    public void setImgUrl (String  imgUrl){
        this.imgUrl=imgUrl;
    }
    public  String getImgUrl(){
        return this.imgUrl;
    }
    public void setTargetId (Integer  targetId){
        this.targetId=targetId;
    }
    public  Integer getTargetId(){
        return this.targetId;
    }
    public void setSort (Integer  sort){
        this.sort=sort;
    }
    public  Integer getSort(){
        return this.sort;
    }
    public void setType (Integer  type){
        this.type=type;
    }
    public  Integer getType(){
        return this.type;
    }
    public void setCategory (Integer  category){
        this.category=category;
    }
    public  Integer getCategory(){
        return this.category;
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
