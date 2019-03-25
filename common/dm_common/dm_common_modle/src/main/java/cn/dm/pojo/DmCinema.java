package cn.dm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   剧场表
*/
public class DmCinema implements Serializable {
    //
    private Long id;
    //剧场名称
    private String name;
    //剧场地址
    private String address;
    //区域ID
    private Long areaId;
    //区域名称
    private String areaName;
    //X轴座位长度
    private Integer xLength;
    //Y轴座位长度
    private Integer yLength;
    //纬度
    private String latitude;
    //经度
    private String longitude;
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
    public void setAddress (String  address){
        this.address=address;
    }
    public  String getAddress(){
        return this.address;
    }
    public void setAreaId (Long  areaId){
        this.areaId=areaId;
    }
    public  Long getAreaId(){
        return this.areaId;
    }
    public void setAreaName (String  areaName){
        this.areaName=areaName;
    }
    public  String getAreaName(){
        return this.areaName;
    }
    public void setXLength (Integer  xLength){
        this.xLength=xLength;
    }
    public  Integer getXLength(){
        return this.xLength;
    }
    public void setYLength (Integer  yLength){
        this.yLength=yLength;
    }
    public  Integer getYLength(){
        return this.yLength;
    }
    public void setLatitude (String  latitude){
        this.latitude=latitude;
    }
    public  String getLatitude(){
        return this.latitude;
    }
    public void setLongitude (String  longitude){
        this.longitude=longitude;
    }
    public  String getLongitude(){
        return this.longitude;
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
