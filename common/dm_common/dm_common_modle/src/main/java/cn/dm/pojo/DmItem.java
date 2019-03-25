package cn.dm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   节目表
*/
public class DmItem implements Serializable {
    //
    private Long id;
    //节目名称
    private String itemName;
    //摘要信息
    private String abstractMessage;
    //节目类型管理ID
    private Long itemType1Id;
    //节目名称
    private String itemType1Name;
    //节目类型管理ID
    private Long itemType2Id;
    //节目名称
    private String itemType2Name;
    //状态(1:项目待定2:预售/预订3:开始售票4:演出开始)
    private Integer state;
    //基础描述
    private String basicDescription;
    //项目描述
    private String projectDescription;
    //温馨提示
    private String reminderDescription;
    //经度
    private String longitude;
    //纬度
    private String latitude;
    //是否推荐(0:默认 1:热推)
    private Integer isBanner;
    //是否推荐(0:不推荐 1:推荐)
    private Integer isRecommend;
    //平均分
    private Double avgScore;
    //评论数目
    private Integer commentCount;
    //剧场Id
    private Long cinemaId;
    //开始演出时间
    private Date startTime;
    //结束时间
    private Date endTime;
    //最低价格
    private Double minPrice;
    //最高价格
    private Double maxPrice;
    //年龄段（0:全年龄段,1:0-3岁,2:3-6岁,3:6-12岁）
    private Integer ageGroup;
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
    public void setItemName (String  itemName){
        this.itemName=itemName;
    }
    public  String getItemName(){
        return this.itemName;
    }
    public void setAbstractMessage (String  abstractMessage){
        this.abstractMessage=abstractMessage;
    }
    public  String getAbstractMessage(){
        return this.abstractMessage;
    }
    public void setItemType1Id (Long  itemType1Id){
        this.itemType1Id=itemType1Id;
    }
    public  Long getItemType1Id(){
        return this.itemType1Id;
    }
    public void setItemType1Name (String  itemType1Name){
        this.itemType1Name=itemType1Name;
    }
    public  String getItemType1Name(){
        return this.itemType1Name;
    }
    public void setItemType2Id (Long  itemType2Id){
        this.itemType2Id=itemType2Id;
    }
    public  Long getItemType2Id(){
        return this.itemType2Id;
    }
    public void setItemType2Name (String  itemType2Name){
        this.itemType2Name=itemType2Name;
    }
    public  String getItemType2Name(){
        return this.itemType2Name;
    }
    public void setState (Integer  state){
        this.state=state;
    }
    public  Integer getState(){
        return this.state;
    }
    public void setBasicDescription (String  basicDescription){
        this.basicDescription=basicDescription;
    }
    public  String getBasicDescription(){
        return this.basicDescription;
    }
    public void setProjectDescription (String  projectDescription){
        this.projectDescription=projectDescription;
    }
    public  String getProjectDescription(){
        return this.projectDescription;
    }
    public void setReminderDescription (String  reminderDescription){
        this.reminderDescription=reminderDescription;
    }
    public  String getReminderDescription(){
        return this.reminderDescription;
    }
    public void setLongitude (String  longitude){
        this.longitude=longitude;
    }
    public  String getLongitude(){
        return this.longitude;
    }
    public void setLatitude (String  latitude){
        this.latitude=latitude;
    }
    public  String getLatitude(){
        return this.latitude;
    }
    public void setIsBanner (Integer  isBanner){
        this.isBanner=isBanner;
    }
    public  Integer getIsBanner(){
        return this.isBanner;
    }
    public void setIsRecommend (Integer  isRecommend){
        this.isRecommend=isRecommend;
    }
    public  Integer getIsRecommend(){
        return this.isRecommend;
    }
    public void setAvgScore (Double  avgScore){
        this.avgScore=avgScore;
    }
    public  Double getAvgScore(){
        return this.avgScore;
    }
    public void setCommentCount (Integer  commentCount){
        this.commentCount=commentCount;
    }
    public  Integer getCommentCount(){
        return this.commentCount;
    }
    public void setCinemaId (Long  cinemaId){
        this.cinemaId=cinemaId;
    }
    public  Long getCinemaId(){
        return this.cinemaId;
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
    public void setMinPrice (Double  minPrice){
        this.minPrice=minPrice;
    }
    public  Double getMinPrice(){
        return this.minPrice;
    }
    public void setMaxPrice (Double  maxPrice){
        this.maxPrice=maxPrice;
    }
    public  Double getMaxPrice(){
        return this.maxPrice;
    }
    public void setAgeGroup (Integer  ageGroup){
        this.ageGroup=ageGroup;
    }
    public  Integer getAgeGroup(){
        return this.ageGroup;
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
