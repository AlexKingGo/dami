package cn.dm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   订单表
*/
public class DmOrder implements Serializable {
    //主键
    private Long id;
    //订单编号
    private String orderNo;
    //下单用户Id
    private Long userId;
    //排期ID
    private Long schedulerId;
    //剧集Id(冗余)
    private Long itemId;
    //
    private String itemName;
    //微信交易号
    private String wxTradeNo;
    //支付宝交易号
    private String aliTradeNo;
    //订单类型(0:未支付 -1:支付超时/支付取消 2:已支付)
    private Integer orderType;
    //支付类型(1:微信支付 2：支付宝支付)
    private String payType;
    //购买数目
    private Integer totalCount;
    //
    private Long area;
    //0:WEB端 1:手机端 2:其他客户端
    private Integer sourceType;
    //是否需要发票（0：不需要 1：需要）
    private Integer isNeedInvoice;
    //发票类型（0：个人 1：公司）
    private Integer invoiceType;
    //发票抬头
    private String invoiceHead;
    //发票号
    private String invoiceNo;
    //是否需要保险(0：不需要 1:需要)
    private Integer isNeedInsurance;
    //总价
    private Double totalAmount;
    //保险金额
    private Double insuranceAmount;
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
    public void setSchedulerId (Long  schedulerId){
        this.schedulerId=schedulerId;
    }
    public  Long getSchedulerId(){
        return this.schedulerId;
    }
    public void setItemId (Long  itemId){
        this.itemId=itemId;
    }
    public  Long getItemId(){
        return this.itemId;
    }
    public void setItemName (String  itemName){
        this.itemName=itemName;
    }
    public  String getItemName(){
        return this.itemName;
    }
    public void setWxTradeNo (String  wxTradeNo){
        this.wxTradeNo=wxTradeNo;
    }
    public  String getWxTradeNo(){
        return this.wxTradeNo;
    }
    public void setAliTradeNo (String  aliTradeNo){
        this.aliTradeNo=aliTradeNo;
    }
    public  String getAliTradeNo(){
        return this.aliTradeNo;
    }
    public void setOrderType (Integer  orderType){
        this.orderType=orderType;
    }
    public  Integer getOrderType(){
        return this.orderType;
    }
    public void setPayType (String  payType){
        this.payType=payType;
    }
    public  String getPayType(){
        return this.payType;
    }
    public void setTotalCount (Integer  totalCount){
        this.totalCount=totalCount;
    }
    public  Integer getTotalCount(){
        return this.totalCount;
    }
    public void setArea (Long  area){
        this.area=area;
    }
    public  Long getArea(){
        return this.area;
    }
    public void setSourceType (Integer  sourceType){
        this.sourceType=sourceType;
    }
    public  Integer getSourceType(){
        return this.sourceType;
    }
    public void setIsNeedInvoice (Integer  isNeedInvoice){
        this.isNeedInvoice=isNeedInvoice;
    }
    public  Integer getIsNeedInvoice(){
        return this.isNeedInvoice;
    }
    public void setInvoiceType (Integer  invoiceType){
        this.invoiceType=invoiceType;
    }
    public  Integer getInvoiceType(){
        return this.invoiceType;
    }
    public void setInvoiceHead (String  invoiceHead){
        this.invoiceHead=invoiceHead;
    }
    public  String getInvoiceHead(){
        return this.invoiceHead;
    }
    public void setInvoiceNo (String  invoiceNo){
        this.invoiceNo=invoiceNo;
    }
    public  String getInvoiceNo(){
        return this.invoiceNo;
    }
    public void setIsNeedInsurance (Integer  isNeedInsurance){
        this.isNeedInsurance=isNeedInsurance;
    }
    public  Integer getIsNeedInsurance(){
        return this.isNeedInsurance;
    }
    public void setTotalAmount (Double  totalAmount){
        this.totalAmount=totalAmount;
    }
    public  Double getTotalAmount(){
        return this.totalAmount;
    }
    public void setInsuranceAmount (Double  insuranceAmount){
        this.insuranceAmount=insuranceAmount;
    }
    public  Double getInsuranceAmount(){
        return this.insuranceAmount;
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
