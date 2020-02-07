package com.ds.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 科室表 
 * </p>
 *
 * @author dps
 * @since 2020-02-07
 */
public class InqDepartment implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 科室名称
     */
    private String depName;

    /**
     * 科室类型字典表中
     */
    private Integer depType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Integer getDepType() {
        return depType;
    }

    public void setDepType(Integer depType) {
        this.depType = depType;
    }

    @Override
    public String toString() {
        return "InqDepartment{" +
        "id=" + id +
        ", depName=" + depName +
        ", depType=" + depType +
        "}";
    }
}
