package com.ds.common.util;

import cn.hutool.json.JSONUtil;
import com.ds.model.InqUser;

/**
 * @ClassName: Userinfo
 * @Author: sunpxit
 * @Description: 用户信息
 * @Date: 2020/2/9 0:26
 */

public class UserInfo {
    /**
     * 将用户数据初始化进对象
     */
    public UserInfo() {
        String userInfo = (String) ServletUtil.getRequest().getSession().getAttribute("userInfo");
        InqUser inqUser = JSONUtil.toBean(userInfo, InqUser.class);
        id = inqUser.getId();
        name = inqUser.getUserName();
        sex = inqUser.getUserSex();
        type = inqUser.getUserType();
    }

    private Integer id;
    /**
     * 用户名称
     */
    private String name;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 用户类型
     */
    private Integer type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", type=" + type +
                '}';
    }
}
