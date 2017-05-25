package com.leiwenjie.base.support.operalog.entity;

import java.util.Date;

import org.nutz.dao.entity.annotation.ColDefine;
import org.nutz.dao.entity.annotation.ColType;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Comment;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Index;
import org.nutz.dao.entity.annotation.One;
import org.nutz.dao.entity.annotation.Table;
import org.nutz.dao.entity.annotation.TableIndexes;

import com.leiwenjie.base.support.common.base.entity.BaseEntity;
import com.leiwenjie.base.support.user.entity.User;

/**
 * 操作日志表
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月11日 下午8:58:45
 */
@Table("t_operator_log")
@TableIndexes({ @Index(unique = true, fields = { "id" }, name = "unique_t_operator_log_id"),
        @Index(fields = { "moduleCode" }, name = "idx_t_opera_log_module_code"),
        @Index(fields = { "userId" }, name = "idx_t_opera_log_user_id") })
public class OperatorLog extends BaseEntity {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    /**
     * 操作模块名
     */
    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 32, notNull = true)
    @Comment("模块标识")
    private String moduleCode;

    /**
     * 操作类型
     */
    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 32, notNull = true)
    @Comment("操作类型")
    private String operaType;

    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 32, notNull = true)
    @Comment("操作名称")
    private String operaName;

    /**
     * 操作时间
     */
    @Column(hump = true)
    @ColDefine(type = ColType.TIMESTAMP, notNull = true, update = false)
    @Comment("操作时间")
    private Date operaTime;

    /**
     * 操作IP
     */
    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 32)
    @Comment("操作IP地址")
    private String operaIp;

    /**
     * 操作用户ID，外键
     */
    @Column(hump = true)
    @Comment("关联用户ID")
    private int userId;

    @One(field = "userId")
    private User userDo;

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
