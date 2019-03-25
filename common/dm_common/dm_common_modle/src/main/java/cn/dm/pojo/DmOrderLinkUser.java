package cn.dm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   订单联系人表
*/
public class DmOrderLinkUser implements Serializable {
    //主键
    private Long id;
    //订单id
    private Long orderId;
    //联系人id
    private Long linkUserId;
    //入住人姓名逗号分隔
    private String linkUserName;
    //
    private Integer x;
    //
    private Integer y;
    //价格
    private Double price;
    //
    private Date createdTime;
    //
    private Long updatedTime;
    //get set 方法
    public void setId (Long  id){
        this.id=id;
    }
    public  Long getId(){
        return this.id;
    }
    public void setOrderId (Long  orderId){
        this.orderId=orderId;
    }
    public  Long getOrderId(){
        return this.orderId;
    }
    public void setLinkUserId (Long  linkUserId){
        this.linkUserId=linkUserId;
    }
    public  Long getLinkUserId(){
        return this.linkUserId;
    }
    public void setLinkUserName (String  linkUserName){
        this.linkUserName=linkUserName;
    }
    public  String getLinkUserName(){
        return this.linkUserName;
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
    public void setPrice (Double  price){
        this.price=price;
    }
    public  Double getPrice(){
        return this.price;
    }
    public void setCreatedTime (Date  createdTime){
        this.createdTime=createdTime;
    }
    public  Date getCreatedTime(){
        return this.createdTime;
    }
    public void setUpdatedTime (Long  updatedTime){
        this.updatedTime=updatedTime;
    }
    public  Long getUpdatedTime(){
        return this.updatedTime;
    }
}
