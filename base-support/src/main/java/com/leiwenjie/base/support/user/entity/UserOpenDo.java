package com.leiwenjie.base.support.user.entity;

import java.util.Date;

import com.leiwenjie.base.support.common.base.entity.BaseEntity;

/**
 * 单点用户信息
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月11日 下午8:38:23
 */
public class UserOpenDo extends BaseEntity {

    /**
     * 单点登录类型：1、微信
     */
    public static final String OPEN_TYPE_WEBCHAT = "1";

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private int id;

    private String openId;

    private String openToken;

    /**
     * 外键，关联userId
     */
    private int userId;

    /**
     * 单点登录类型
     */
    private String type;

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
        builder.append(", type=");
        builder.append(type);
        builder.append(", creationTime=");
        builder.append(creationTime);
        builder.append("]");
        return builder.toString();
    }

}
