package com.leiwenjie.base.support.user.entity;

import java.util.Date;

import org.nutz.dao.entity.annotation.ColDefine;
import org.nutz.dao.entity.annotation.ColType;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Comment;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Index;
import org.nutz.dao.entity.annotation.Table;
import org.nutz.dao.entity.annotation.TableIndexes;

import com.leiwenjie.base.support.common.base.entity.StatefulEntity;

/**
 * 用户信息
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月11日 下午8:30:32
 */
@Table("t_user")
@TableIndexes({ @Index(unique = true, fields = { "id" }, name = "unique_t_user_id") })
public class User extends StatefulEntity {

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

    /**
     * 登录名
     */
    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 32, notNull = true)
    @Comment("登录名")
    private String loginName;

    /**
     * 登录密码(加盐SHA-512）
     */
    @Column
    @ColDefine(type = ColType.VARCHAR, width = 64, notNull = true)
    @Comment("登录密码(加盐SHA-512）")
    private String password;

    /**
     * 邮箱
     */
    @Column
    @ColDefine(type = ColType.VARCHAR, width = 256)
    @Comment("邮箱")
    private String email;

    /**
     * 电话号码
     */
    @Column
    @ColDefine(type = ColType.VARCHAR, width = 64)
    @Comment("电话号码")
    private String phone;

    /**
     * 性别：1、男；2、女
     */
    @Column
    @ColDefine(type = ColType.VARCHAR, width = 2)
    @Comment("性别：1、男；2、女")
    private String sex;

    /**
     * 用户昵称
     */
    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 32)
    @Comment("用户昵称")
    private String nickName;

    /**
     * 所属地市
     */
    @Column
    @ColDefine(type = ColType.VARCHAR, width = 32)
    @Comment("所属地市")
    private String city;

    /**
     * 所属省份
     */
    @Column
    @ColDefine(type = ColType.VARCHAR, width = 32)
    @Comment("所属省份")
    private String province;

    /**
     * 所属国家
     */
    @Column
    @ColDefine(type = ColType.VARCHAR, width = 32)
    @Comment("所属国家")
    private String country;

    /**
     * 头像URL
     */
    @Column
    @ColDefine(type = ColType.VARCHAR, width = 256)
    @Comment("头像URL")
    private String headimgurl;

    /**
     * 用户来源：1、系统注册；2、微信单点注册
     */
    @Column
    @ColDefine(type = ColType.VARCHAR, width = 2, notNull = true)
    @Comment("用户来源：1、系统注册；2、微信单点注册")
    private String type;

    /**
     * 注册时间
     */
    @Column(hump = true)
    @ColDefine(type = ColType.TIMESTAMP, notNull = true, update = false)
    @Comment("注册时间")
    private Date registerTime;

    /**
     * 最后登录时间
     */
    @Column(hump = true)
    @ColDefine(type = ColType.TIMESTAMP)
    @Comment("最后登录时间")
    private Date lastLoginTime;

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
