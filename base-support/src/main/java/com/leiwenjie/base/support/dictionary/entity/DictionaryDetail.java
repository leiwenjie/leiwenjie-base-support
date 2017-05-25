package com.leiwenjie.base.support.dictionary.entity;

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
 * 字典明细
 *
 * @author leiwenjie leiwenjie.cn@gmail.com
 * @version 1.0
 * @date 2017年5月11日 下午8:50:17
 */
@Table("t_dictionary_detail")
@TableIndexes({ @Index(unique = true, fields = { "id" }, name = "unique_t_dictionary_detail_id") })
public class DictionaryDetail extends BaseEntity {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    @Id
    private int id;

    /**
     * 外键，关联字典类型ID
     */
    @Column(hump = true)
    private int dictId;

    @One(field = "dictId")
    private Dictionary dictionaryDo;

    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 32, notNull = true)
    private String dictText;

    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 32, notNull = true)
    private String dictValue;

    /**
     * 是否默认标识，1：默认，0：不默认
     */
    @Column(hump = true)
    @ColDefine(type = ColType.VARCHAR, width = 2)
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

    public Dictionary getDictionaryDo() {
        return dictionaryDo;
    }

    public void setDictionaryDo(Dictionary dictionaryDo) {
        this.dictionaryDo = dictionaryDo;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DictionaryDetail [id=");
        builder.append(id);
        builder.append(", dictId=");
        builder.append(dictId);
        builder.append(", dictionaryDo=");
        builder.append(dictionaryDo);
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
