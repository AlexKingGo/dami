package cn.dm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class DmTrade implements Serializable {
    //
    private String id;
    //业务订单号
    private String orderNo;
    //交易订单号
    private String tradeNo;
    //(1:支付宝 2:微信)
    private Integer payMethod;
    //交易金额
    private Double amount;
    //
    private Date createdTime;
    //
    private Date updatedTime;
    //get set 方法
    public void setId (String  id){
        this.id=id;
    }
    public  String getId(){
        return this.id;
    }
    public void setOrderNo (String  orderNo){
        this.orderNo=orderNo;
    }
    public  String getOrderNo(){
        return this.orderNo;
    }
    public void setTradeNo (String  tradeNo){
        this.tradeNo=tradeNo;
    }
    public  String getTradeNo(){
        return this.tradeNo;
    }
    public void setPayMethod (Integer  payMethod){
        this.payMethod=payMethod;
    }
    public  Integer getPayMethod(){
        return this.payMethod;
    }
    public void setAmount (Double  amount){
        this.amount=amount;
    }
    public  Double getAmount(){
        return this.amount;
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
