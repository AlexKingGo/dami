package cn.dm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   节目排期表
*/
public class DmScheduler implements Serializable {
    //
    private Long id;
    //排期名称
    private String title;
    //开始时间
    private Date startTime;
    //结束时间
    private Date endTime;
    //剧集Id
    private Long itemId;
    //剧场Id
    private Long cinemaId;
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
    public void setTitle (String  title){
        this.title=title;
    }
    public  String getTitle(){
        return this.title;
    }
    public void setStartTime (Date  startTime){
        this.startTime=startTime;
    }
    public  Date getStartTime(){
        return this.startTime;
    }
    public void setEndTime (Date  endTime){
        this.endTime=endTime;
    }
    public  Date getEndTime(){
        return this.endTime;
    }
    public void setItemId (Long  itemId){
        this.itemId=itemId;
    }
    public  Long getItemId(){
        return this.itemId;
    }
    public void setCinemaId (Long  cinemaId){
        this.cinemaId=cinemaId;
    }
    public  Long getCinemaId(){
        return this.cinemaId;
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
