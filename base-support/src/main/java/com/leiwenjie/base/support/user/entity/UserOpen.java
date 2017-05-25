package com.leiwenjie.base.support.user.entity;

import java.util.Date;

import org.nutz.dao.entity.annotation.ColDefine;
import org.nutz.dao.entity.annotation.ColType;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Index;
import org.nutz.dao.entity.annotation.One;
import org.nutz.dao.entity.annotation.Table;
import org.nutz.dao.entity.annotation.TableIndexes;

import com.leiwenjie.base.support.common.base.entity.BaseEntity;

/**
 * 单点用户信息
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月11日 下午8:38:23
 */
@Table("t_user_open")
@TableIndexes({ @Index(unique = true, fields = { "id" }, name = "unique_t_user_open_id") })
public class UserOpen extends BaseEntity {

    /**
     * 单点登录类型：1、微信
     */
    public static final String OPEN_TYPE_WEBCHAT = "1";

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 64, notNull = true)
    private String openId;

    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 128, notNull = true)
    private String openToken;

    /**
     * 外键，关联userId
     */
    @Column(hump = true)
    private int userId;

    @One(field = "userId")
    private User userDo;

    /**
     * 单点登录类型
     */
    @Column
    @ColDefine(type = ColType.VARCHAR, width = 2, notNull = true)
    private String type;

    @Column(hump = true)
    @ColDefine(type = ColType.TIMESTAMP, notNull = true, update = false)
    private Date creationTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOpenToken() {
        return openToken;
    }

    public void setOpenToken(String openToken) {
        this.openToken = openToken;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public User getUserDo() {
        return userDo;
    }

    public void setUserDo(User userDo) {
        this.userDo = userDo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UserOpenDo [id=");
        builder.append(id);
        builder.append(", openId=");
        builder.append(openId);
        builder.append(", openToken=");
        builder.append(openToken);
        builder.append(", userId=");
        builder.append(userId);
        builder.append(", userDo=");
        builder.append(userDo);
        builder.append(", type=");
        builder.append(type);
        builder.append(", creationTime=");
        builder.append(creationTime);
        builder.append("]");
        return builder.toString();
    }

}
