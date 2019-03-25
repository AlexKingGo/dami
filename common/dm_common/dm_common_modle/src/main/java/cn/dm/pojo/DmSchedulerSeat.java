package cn.dm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   排期座位表
*/
public class DmSchedulerSeat implements Serializable {
    //
    private Long id;
    //x坐标
    private Integer x;
    //y坐标
    private Integer y;
    //区域级别(1:A;2:B;3:C)
    private Integer areaLevel;
    //排期Id
    private Long scheduleId;
    //订单编号
    private String orderNo;
    //如果已经售出记录购买用户id
    private Long userId;
    //座位状态(0:没座位 1:有座位 2:锁定待付款 3:已售出 )
    private Integer status;
    //排序
    private Integer sort;
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
    public void setScheduleId (Long  scheduleId){
        this.scheduleId=scheduleId;
    }
    public  Long getScheduleId(){
        return this.scheduleId;
    }
    public void setOrderNo (String  orderNo){
        this.orderNo=orderNo;
    }
    public  String getOrderNo(){
        return this.orderNo;
    }
    public void setUserId (Long  userId){
        this.userId=userId;
    }
    public  Long getUserId(){
        return this.userId;
    }
    public void setStatus (Integer  status){
        this.status=status;
    }
    public  Integer getStatus(){
        return this.status;
    }
    public void setSort (Integer  sort){
        this.sort=sort;
    }
    public  Integer getSort(){
        return this.sort;
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
