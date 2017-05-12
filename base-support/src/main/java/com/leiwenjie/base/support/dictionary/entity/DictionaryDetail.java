package com.leiwenjie.base.support.dictionary.entity;

import com.leiwenjie.base.support.common.base.entity.BaseEntity;

/**
 * 字典明细
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月11日 下午8:50:17
 */
public class DictionaryDetail extends BaseEntity {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private int id;

    /**
     * 外键，关联字典类型ID
     */
    private int dictId;

    private String dictText;

    private String dictValue;

    /**
     * 是否默认标识，1：默认，0：不默认
     */
    private String defaultTag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDictId() {
        return dictId;
    }

    public void setDictId(int dictId) {
        this.dictId = dictId;
    }

    public String getDictText() {
        return dictText;
    }

    public void setDictText(String dictText) {
        this.dictText = dictText;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public String getDefaultTag() {
        return defaultTag;
    }

    public void setDefaultTag(String defaultTag) {
        this.defaultTag = defaultTag;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DictionaryDetail [id=");
        builder.append(id);
        builder.append(", dictId=");
        builder.append(dictId);
        builder.append(", dictText=");
        builder.append(dictText);
        builder.append(", dictValue=");
        builder.append(dictValue);
        builder.append(", defaultTag=");
        builder.append(defaultTag);
        builder.append("]");
        return builder.toString();
    }

}
