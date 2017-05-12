package com.leiwenjie.base.support.user.entity;

import java.util.Date;

import com.leiwenjie.base.support.common.base.entity.BaseEntity;

/**
 * 用户信息
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月11日 下午8:30:32
 */
public class UserDo extends BaseEntity {

    /**
     * 用户来源，1：本地注册；2：微信登录
     */
    public static final String USER_REGIST_TYPE_LOCAL = "1";
    public static final String USER_REGIST_TYPE_WEBCHAT = "2";
    

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private int id;

    private String loginName;

    private String password;

    private String email;

    private String phone;

    private String sex;

    private String nickName;

    private String city;

    private String province;

    private String country;

    private String headimgurl;

    /**
     * 类型:1、系统注册；2、微信单点
     */
    private String type;

    private Date registerTime;

    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserDo [id=");
        builder.append(id);
        builder.append(", loginName=");
        builder.append(loginName);
        builder.append(", password=");
        builder.append(password);
        builder.append(", email=");
        builder.append(email);
        builder.append(", phone=");
        builder.append(phone);
        builder.append(", sex=");
        builder.append(sex);
        builder.append(", nickName=");
        builder.append(nickName);
        builder.append(", city=");
        builder.append(city);
        builder.append(", province=");
        builder.append(province);
        builder.append(", country=");
        builder.append(country);
        builder.append(", headimgurl=");
        builder.append(headimgurl);
        builder.append(", type=");
        builder.append(type);
        builder.append(", registerTime=");
        builder.append(registerTime);
        builder.append(", status=");
        builder.append(status);
        builder.append("]");
        return builder.toString();
    }
}
