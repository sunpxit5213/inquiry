package com.ds.common.util;

import cn.hutool.crypto.SecureUtil;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;

import java.io.InputStream;
import java.util.Arrays;

/**
 * @ClassName: OSSUtil
 * @Author: sunpxit
 * @Description: oss存储工具类
 * @Date: 2020/2/13 13:53
 */
public class OSSUtil {
    private String endpoint = "http://oss-cn-shenzhen.aliyuncs.com";
    private String accessKeyId = "LTAI4FmxsLL2DYcuAS9euHaT";
    private String accessKeySecret = "f4Q90tID8JDW84QNmOxuwnNFsVaYAq";
    private String inquiryName = "inq2019";
    private OSS ossClient;

    private String[] mrImg = {"moren.png", "moren1.png", "moren2.png", "moren3.png", "moren4.png"};


    /**
     * @return : java.lang.String
     * @author : sunpx
     * @desc : 图片上传
     * @date : 2020/02/13 14:13:49
     * @params : fileName 后缀名,imgInput
     */
    public String upload(String fileName, InputStream imgInput) {
        UserInfo userInfo = new UserInfo();
        ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
        fileName = userInfo.getName() + SecureUtil.simpleUUID() + fileName;
        ossClient.putObject(inquiryName, "userIng/" + fileName, imgInput);
        ossClient.shutdown();
        return "https://inq2019.oss-cn-shenzhen.aliyuncs.com/userIng/" + fileName;
    }


    /**
     * @return : void
     * @author : sunpx
     * @desc : 删除图片
     * @date : 2020/02/13 18:19:27
     * @params : fileName
     */
    public void delLoad(String fileName) {

        String substring = fileName.substring(fileName.lastIndexOf("/") + 1);

        if (!Arrays.asList(mrImg).contains(substring)) {
            ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
            ossClient.deleteObject(inquiryName, "userIng/" + substring);
            // 关闭OSSClient。
            ossClient.shutdown();
        }


    }
}
