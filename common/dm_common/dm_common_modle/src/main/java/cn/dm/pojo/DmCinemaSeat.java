package cn.dm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   剧场座位表
*/
public class DmCinemaSeat implements Serializable {
    //
    private Long id;
    //x坐标
    private Integer x;
    //y坐标
    private Integer y;
    //区域级别(1:A;2:B;3:C)
    private Integer areaLevel;
    //排期Id
    private Long cinemaId;
    //排序
    private Integer sort;
    //座位状态(1:有座位 0:没座位)
    private Integer status;
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
    public void setX (Integer  x){
        this.x=x;
    }
    public  Integer getX(){
        return this.x;
    }
    public void setY (Integer  y){
        this.y=y;
    }
    public  Integer getY(){
        return this.y;
    }
    public void setAreaLevel (Integer  areaLevel){
        this.areaLevel=areaLevel;
    }
    public  Integer getAreaLevel(){
        return this.areaLevel;
    }
    public void setCinemaId (Long  cinemaId){
        this.cinemaId=cinemaId;
    }
    public  Long getCinemaId(){
        return this.cinemaId;
    }
    public void setSort (Integer  sort){
        this.sort=sort;
    }
    public  Integer getSort(){
        return this.sort;
    }
    public void setStatus (Integer  status){
        this.status=status;
    }
    public  Integer getStatus(){
        return this.status;
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
