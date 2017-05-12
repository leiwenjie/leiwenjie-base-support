package com.leiwenjie.base.support.dictionary.entity;

import java.util.Date;

import com.leiwenjie.base.support.common.base.entity.BaseEntity;

/**
 * 字典类型
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月11日 下午8:46:43
 */
public class DictionaryDo extends BaseEntity {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private int id;

    private String dictName;

    private String dictKey;

    /**
     * 是否不可删除
     */
    private String fixedTag;

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
