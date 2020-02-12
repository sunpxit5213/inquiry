package com.ds.model;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 挂号表
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
public class InqReservation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 医生id
     */
    private Integer docId;

    /**
     * 开始时间
     */
    private LocalDateTime startDate;

    /**
     * 结束时间
     */
    private LocalDateTime stopDate;

    /**
     * 标题
     */
    private String resTitle;

    /**
     * 手机号
     */
    private String resContact;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 状态以完成1,未开始2,3爽约
     */
    private Integer resStatus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getStopDate() {
        return stopDate;
    }

    public void setStopDate(LocalDateTime stopDate) {
        this.stopDate = stopDate;
    }

    public String getResTitle() {
        return resTitle;
    }

    public void setResTitle(String resTitle) {
        this.resTitle = resTitle;
    }

    public String getResContact() {
        return resContact;
    }

    public void setResContact(String resContact) {
        this.resContact = resContact;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getResStatus() {
        return resStatus;
    }

    public void setResStatus(Integer resStatus) {
        this.resStatus = resStatus;
    }

    @Override
    public String toString() {
        return "InqReservation{" +
        "id=" + id +
        ", userId=" + userId +
        ", docId=" + docId +
        ", startDate=" + startDate +
        ", stopDate=" + stopDate +
        ", resTitle=" + resTitle +
        ", resContact=" + resContact +
        ", idCard=" + idCard +
        ", resStatus=" + resStatus +
        "}";
    }
}
