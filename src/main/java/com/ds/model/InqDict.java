package com.ds.model;

import java.io.Serializable;

/**
 * <p>
 * 字典表
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
public class InqDict implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 字典名称
     */
    private String dictName;

    /**
     * 字典类型
     */
    private String dictType;

    /**
     * 字典值
     */
    private String dictValue;

    /**
     * 附加
     */
    private String dictAttach;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    public String getDictAttach() {
        return dictAttach;
    }

    public void setDictAttach(String dictAttach) {
        this.dictAttach = dictAttach;
    }

    @Override
    public String toString() {
        return "InqDict{" +
        "id=" + id +
        ", dictName=" + dictName +
        ", dictType=" + dictType +
        ", dictValue=" + dictValue +
        ", dictAttach=" + dictAttach +
        "}";
    }
}
