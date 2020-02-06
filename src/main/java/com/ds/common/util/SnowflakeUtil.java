package com.ds.common.util;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;

/**
 * @desc: 雪花算法工具类
 * @auth: zhangsy
 * @data: 2019/10/8 11:42
 */
public class SnowflakeUtil {

    private SnowflakeUtil(){}
    /**
     * @desc: 雪花算法生唯一数据
     * @auth: zhangsy
     * @param workerId 终端ID
     * @param datacenterId 数据中心ID
     * @data: 2019/10/8 11:42
     * @return: {@link Snowflake}
     */
    public static Long randomLong(Long workerId,Long datacenterId){
        Snowflake snowflake = IdUtil.createSnowflake(workerId, datacenterId);
        return snowflake.nextId();
    }
    /**
     * @desc: 雪花算法生唯一数据
     * @auth: zhangsy
     * @data: 2019/10/8 11:42
     * @return: {@link Snowflake}
     */
    public static Long randomLong(){
        return randomLong(Long.valueOf(RandomUtil.randomInt(31)),Long.valueOf(RandomUtil.randomInt(31)));
    }
}
