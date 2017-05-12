package com.leiwenjie.base.support.operalog.entity;

import java.util.Date;

import com.leiwenjie.base.support.common.base.entity.BaseEntity;

/**
 * 操作日志表
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月11日 下午8:58:45
 */
public class OperatorLog extends BaseEntity {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private int id;

    /**
     * 操作模块名
     */
    private String moduleCode;

    /**
     * 操作类型
     */
    private String operaType;

    private String operaName;

    /**
     * 操作时间
     */
    private Date operaTime;

    /**
     * 操作IP
     */
    private String operaIp;

    /**
     * 操作用户ID，外键
     */
    private String userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getOperaType() {
        return operaType;
    }

    public void setOperaType(String operaType) {
        this.operaType = operaType;
    }

    public String getOperaName() {
        return operaName;
    }

    public void setOperaName(String operaName) {
        this.operaName = operaName;
    }

    public Date getOperaTime() {
        return operaTime;
    }

    public void setOperaTime(Date operaTime) {
        this.operaTime = operaTime;
    }

    public String getOperaIp() {
        return operaIp;
    }

    public void setOperaIp(String operaIp) {
        this.operaIp = operaIp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("OperatorLog [id=");
        builder.append(id);
        builder.append(", moduleCode=");
        builder.append(moduleCode);
        builder.append(", operaType=");
        builder.append(operaType);
        builder.append(", operaName=");
        builder.append(operaName);
        builder.append(", operaTime=");
        builder.append(operaTime);
        builder.append(", operaIp=");
        builder.append(operaIp);
        builder.append(", userId=");
        builder.append(userId);
        builder.append("]");
        return builder.toString();
    }

}
