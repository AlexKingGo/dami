package cn.dm.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   用户表
*/
public class DmUser implements Serializable {
    //主键
    private Long id;
    //手机号
    private String phone;
    //密码
    private String password;
    //
    private String wxUserId;
    //真实姓名
    private String realName;
    //昵称
    private String nickName;
    //性别(0:男,1:女)
    private Integer sex;
    //兴趣爱好
    private String hobby;
    //身份证号
    private String idCard;
    //生日
    private Date birthday;
    //创建时间
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
    public void setPhone (String  phone){
        this.phone=phone;
    }
    public  String getPhone(){
        return this.phone;
    }
    public void setPassword (String  password){
        this.password=password;
    }
    public  String getPassword(){
        return this.password;
    }
    public void setWxUserId (String  wxUserId){
        this.wxUserId=wxUserId;
    }
    public  String getWxUserId(){
        return this.wxUserId;
    }
    public void setRealName (String  realName){
        this.realName=realName;
    }
    public  String getRealName(){
        return this.realName;
    }
    public void setNickName (String  nickName){
        this.nickName=nickName;
    }
    public  String getNickName(){
        return this.nickName;
    }
    public void setSex (Integer  sex){
        this.sex=sex;
    }
    public  Integer getSex(){
        return this.sex;
    }
    public void setHobby (String  hobby){
        this.hobby=hobby;
    }
    public  String getHobby(){
        return this.hobby;
    }
    public void setIdCard (String  idCard){
        this.idCard=idCard;
    }
    public  String getIdCard(){
        return this.idCard;
    }
    public void setBirthday (Date  birthday){
        this.birthday=birthday;
    }
    public  Date getBirthday(){
        return this.birthday;
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
