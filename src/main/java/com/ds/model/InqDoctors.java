package com.ds.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
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
    private Integer docPractise;

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


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDocSubject() {
        return docSubject;
    }

    public void setDocSubject(Integer docSubject) {
        this.docSubject = docSubject;
    }

    public Integer getDocUser() {
        return docUser;
    }

    public void setDocUser(Integer docUser) {
        this.docUser = docUser;
    }

    public String getDocEducation() {
        return docEducation;
    }

    public void setDocEducation(String docEducation) {
        this.docEducation = docEducation;
    }

    public String getDocResume() {
        return docResume;
    }

    public void setDocResume(String docResume) {
        this.docResume = docResume;
    }

    public Integer getDocPractise() {
        return docPractise;
    }

    public void setDocPractise(Integer docPractise) {
        this.docPractise = docPractise;
    }

    public Integer getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(Integer docStatus) {
        this.docStatus = docStatus;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public Integer getDocAge() {
        return docAge;
    }

    public void setDocAge(Integer docAge) {
        this.docAge = docAge;
    }

    @Override
    public String toString() {
        return "InqDoctors{" +
        "id=" + id +
        ", docSubject=" + docSubject +
        ", docUser=" + docUser +
        ", docEducation=" + docEducation +
        ", docResume=" + docResume +
        ", docPractise=" + docPractise +
        ", docStatus=" + docStatus +
        ", docName=" + docName +
        ", docAge=" + docAge +
        "}";
    }
}
