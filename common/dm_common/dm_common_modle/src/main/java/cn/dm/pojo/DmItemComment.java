package cn.dm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   剧评表
*/
public class DmItemComment implements Serializable {
    //
    private Long id;
    //剧目Id
    private Long itemId;
    //评论用户ID
    private Long userId;
    //评分(1-10)
    private Integer score;
    //剧评
    private String content;
    //更新时间
    private Date createdTime;
    //修改时间
    private Date updatedTime;
    //get set 方法
    public void setId (Long  id){
        this.id=id;
    }
    public  Long getId(){
        return this.id;
    }
    public void setItemId (Long  itemId){
        this.itemId=itemId;
    }
    public  Long getItemId(){
        return this.itemId;
    }
    public void setUserId (Long  userId){
        this.userId=userId;
    }
    public  Long getUserId(){
        return this.userId;
    }
    public void setScore (Integer  score){
        this.score=score;
    }
    public  Integer getScore(){
        return this.score;
    }
    public void setContent (String  content){
        this.content=content;
    }
    public  String getContent(){
        return this.content;
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
