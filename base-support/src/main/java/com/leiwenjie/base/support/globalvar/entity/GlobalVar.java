package com.leiwenjie.base.support.globalvar.entity;

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
 * 全局变量表
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月11日 下午8:55:26
 */
@Table("t_global_var")
@TableIndexes({ @Index(unique = true, fields = { "id" }, name = "unique_t_global_var_id") })
public class GlobalVar extends BaseEntity {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 32, notNull = true)
    private String varCode;

    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 32)
    private String varName;

    @Column
    @ColDefine(type = ColType.VARCHAR, width = 128, notNull = true)
    private String value;

    @Column
    @ColDefine(type = ColType.VARCHAR, width = 2, notNull = true)
    private String status;

    @Column(hump = true)
    @ColDefine(type = ColType.TIMESTAMP, notNull = true, update = false)
    private Date creationTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVarCode() {
        return varCode;
    }

    public void setVarCode(String varCode) {
        this.varCode = varCode;
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        builder.append("GlobalVar [id=");
        builder.append(id);
        builder.append(", varCode=");
        builder.append(varCode);
        builder.append(", varName=");
        builder.append(varName);
        builder.append(", value=");
        builder.append(value);
        builder.append(", status=");
        builder.append(status);
        builder.append(", creationTime=");
        builder.append(creationTime);
        builder.append("]");
        return builder.toString();
    }

}
