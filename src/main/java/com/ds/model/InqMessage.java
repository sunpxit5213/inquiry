package com.ds.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 交流表
 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
public class InqMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 内容
     */
    private String msgContent;

    /**
     * 创建时间
     */
    private LocalDateTime msgDate;

    /**
     * 订单id
     */
    private Integer orderId;

    /**
     * 排序
     */
    private Integer msgSort;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public LocalDateTime getMsgDate() {
        return msgDate;
    }

    public void setMsgDate(LocalDateTime msgDate) {
        this.msgDate = msgDate;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getMsgSort() {
        return msgSort;
    }

    public void setMsgSort(Integer msgSort) {
        this.msgSort = msgSort;
    }

    @Override
    public String toString() {
        return "InqMessage{" +
        "id=" + id +
        ", msgContent=" + msgContent +
        ", msgDate=" + msgDate +
        ", orderId=" + orderId +
        ", msgSort=" + msgSort +
        "}";
    }
}
