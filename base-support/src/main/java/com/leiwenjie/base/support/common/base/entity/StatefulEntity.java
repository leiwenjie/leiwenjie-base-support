package com.leiwenjie.base.support.common.base.entity;

import org.nutz.dao.entity.annotation.ColDefine;
import org.nutz.dao.entity.annotation.ColType;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Comment;

/**
 * 继承该实体的对象皆可实现逻辑删除
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月27日 上午9:31:49
 */
@SuppressWarnings("serial")
public class StatefulEntity extends BaseEntity {

    @Column
    @ColDefine(type = ColType.INT, width = 2, notNull = true)
    @Comment("状态值：0、禁用；1、启用")
    protected Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
