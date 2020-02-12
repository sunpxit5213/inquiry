package com.ds.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 医生表

 * </p>
 *
 * @author dps
 * @since 2020-02-13
 */
public class InqUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名名称
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 加密盐
     */
    private String userSalt;

    /**
     * 性别1.男2.女
     */
    private Integer userSex;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 用户类型1.普通用户，2医生，3管理员
     */
    private Integer userType;

    /**
     * 注册时间
     */
    private LocalDateTime userDate;

    /**
     * 状态1在线2,未登陆
     */
    private Integer student;

    /**
     * 手机号
     */
    private String number;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public LocalDateTime getUserDate() {
        return userDate;
    }

    public void setUserDate(LocalDateTime userDate) {
        this.userDate = userDate;
    }

    public Integer getStudent() {
        return student;
    }

    public void setStudent(Integer student) {
        this.student = student;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "InqUser{" +
        "id=" + id +
        ", userName=" + userName +
        ", password=" + password +
        ", userSalt=" + userSalt +
        ", userSex=" + userSex +
        ", imgUrl=" + imgUrl +
        ", userType=" + userType +
        ", userDate=" + userDate +
        ", student=" + student +
        ", number=" + number +
        "}";
    }
}
