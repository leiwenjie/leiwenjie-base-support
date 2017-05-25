package com.leiwenjie.base.support.dictionary.entity;

import java.util.Date;

import org.nutz.dao.entity.annotation.ColDefine;
import org.nutz.dao.entity.annotation.ColType;
import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Comment;
import org.nutz.dao.entity.annotation.Id;
import org.nutz.dao.entity.annotation.Index;
import org.nutz.dao.entity.annotation.Table;
import org.nutz.dao.entity.annotation.TableIndexes;

import com.leiwenjie.base.support.common.base.entity.BaseEntity;

/**
 * 字典类型
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月11日 下午8:46:43
 */
@Table("t_dictionary")
@TableIndexes({ @Index(unique = true, fields = { "id" }, name = "unique_t_dictionary_id") })
public class Dictionary extends BaseEntity {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 32, notNull = true)
    @Comment("字典名称")
    private String dictName;

    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 32, notNull = true)
    @Comment("字典标识")
    private String dictKey;

    /**
     * 是否不可删除
     */
    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 2)
    @Comment("是否常规项，1：不可删除；0：可以删除")
    private String fixedTag;

    /**
     * 创建时间
     */
    @Column(hump = true)
    @ColDefine(type = ColType.TIMESTAMP, notNull = true, update = false)
    @Comment("创建时间")
    private Date creationTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictKey() {
        return dictKey;
    }

    public void setDictKey(String dictKey) {
        this.dictKey = dictKey;
    }

    public String getFixedTag() {
        return fixedTag;
    }

    public void setFixedTag(String fixedTag) {
        this.fixedTag = fixedTag;
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
        builder.append("DictionaryDo [id=");
        builder.append(id);
        builder.append(", dictName=");
        builder.append(dictName);
        builder.append(", dictKey=");
        builder.append(dictKey);
        builder.append(", fixedTag=");
        builder.append(fixedTag);
        builder.append(", creationTime=");
        builder.append(creationTime);
        builder.append("]");
        return builder.toString();
    }

}
