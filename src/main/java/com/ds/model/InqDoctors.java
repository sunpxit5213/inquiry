package com.ds.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
@Data
public class InqDoctors implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 科室id
     */
    private Integer docSubject;

    /**
     * 用户id
     */
    private Integer docUser;

    /**
     * 学历
     */
    private String docEducation;

    /**
     * 简历
     */
    private String docResume;

    /**
     * 从业经历
     */
    private String docPractise;

    /**
     * 状态(1,空闲,2休息,3,就诊)
     */
    private Integer docStatus;

    /**
     * 医生姓名
     */
    private String docName;

    /**
     * 年龄
     */
    private Integer docAge;



}
