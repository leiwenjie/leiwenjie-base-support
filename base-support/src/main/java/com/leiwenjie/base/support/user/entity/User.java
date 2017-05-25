package com.leiwenjie.base.support.user.entity;

import java.util.Date;

import org.nutz.dao.entity.annotation.ColDefine;
import org.nutz.dao.entity.annotation.ColType;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Index;
import org.nutz.dao.entity.annotation.Table;
import org.nutz.dao.entity.annotation.TableIndexes;

import com.leiwenjie.base.support.common.base.entity.BaseEntity;

/**
 * 用户信息
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月11日 下午8:30:32
 */
@Table("t_user")
@TableIndexes({ @Index(unique = true, fields = { "id" }, name = "unique_t_user_id") })
public class User extends BaseEntity {

    /**
     * 用户来源，1：本地注册；2：微信登录
     */
    public static final String USER_REGIST_TYPE_LOCAL = "1";
    public static final String USER_REGIST_TYPE_WEBCHAT = "2";

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 32, notNull = true)
    private String loginName;

    @Column
    @ColDefine(type = ColType.VARCHAR, width = 64, notNull = true)
    private String password;

    @Column
    @ColDefine(type = ColType.VARCHAR, width = 256)
    private String email;

    @Column
    @ColDefine(type = ColType.VARCHAR, width = 64)
    private String phone;

    @Column
    @ColDefine(type = ColType.VARCHAR, width = 2)
    private String sex;

    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 32)
    private String nickName;

    @Column
    @ColDefine(type = ColType.VARCHAR, width = 32)
    private String city;

    @Column
    @ColDefine(type = ColType.VARCHAR, width = 32)
    private String province;

    @Column
    @ColDefine(type = ColType.VARCHAR, width = 32)
    private String country;

    @Column
    @ColDefine(type = ColType.VARCHAR, width = 256)
    private String headimgurl;

    /**
     * 类型:1、系统注册；2、微信单点
     */
    @Column
    @ColDefine(type = ColType.VARCHAR, width = 2, notNull = true)
    private String type;

    @Column(hump = true)
    @ColDefine(type = ColType.TIMESTAMP, notNull = true, update = false)
    private Date registerTime;

    @Column(hump = true)
    @ColDefine(type = ColType.TIMESTAMP)
    private Date lastLoginTime;

    @Column
    @ColDefine(type = ColType.VARCHAR, width = 2, notNull = true)
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
