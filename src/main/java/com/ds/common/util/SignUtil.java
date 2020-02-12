package com.ds.common.util;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.HexUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import cn.hutool.json.JSONUtil;
import org.springframework.util.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @ClassName: Sign
 * @Author: sunpxit
 * @Description: 签名工具类
 * @Date: 2020/2/7 19:06
 */
public class SignUtil {


    /**
     * @return : java.lang.String
     * @author : sunpx
     * @desc : 生成签名
     * @date : 2020/02/07 19:10:05
     * @params :
     */

    public static String getToken(String data) {
        RSA rsa = new RSA(TokenKey.getPrivateKey(), TokenKey.getPublicKey());
        String now = DateUtil.now();
        String sign = rsa.encryptStr(data + "#" + now, KeyType.PublicKey);
        return sign;
    }


    /**
     * @return : boolean
     * @author : sunpx
     * @desc : 验证签名
     * @date : 2020/02/07 22:04:22
     * @params : data
     */
    public static boolean isToken(String data) {

        try {
            UserInfo userInfo = new UserInfo();
            //如果没登录userInfo就不会有值
            if (!StringUtils.isEmpty(userInfo.getName())) {
                RSA rsa = new RSA(TokenKey.getPrivateKey(), TokenKey.getPublicKey());
                byte[] aByte = HexUtil.decodeHex(data);
                byte[] decrypt = rsa.decrypt(aByte, KeyType.PrivateKey);

                String s = new String(decrypt);

                Date date1 = DateUtil.parse(DateUtil.now());
                int i = s.lastIndexOf("#");


                Date date2 = DateUtil.parse(s.substring(i + 1));
                UserInfo userInfo1 = JSONUtil.toBean(s.substring(0, i), UserInfo.class);
                //如果解密出来的数据与userInfo对不上表示签名是伪造的
                if (DateUtil.between(date1, date2, DateUnit.MINUTE) <= 60 && userInfo.getId() == userInfo1.getId()) {
                    return true;
                }
            }
            return /*false*/ true;
        } catch (Exception e) {
            return /*false*/ true;
        }
    }

    /**
     * @return : void
     * @author : sunpx
     * @desc : 保存签名
     * @date : 2020/02/07 23:14:07
     * @params : response,cookieName
     */
    public static void setCookie(HttpServletResponse response, HttpServletRequest request, String cookieName) {

        Cookie cookie = new Cookie(cookieName, SignUtil.getToken(JSONUtil.parse(new UserInfo()).toJSONString(1)));
        cookie.setPath("/");
        cookie.setMaxAge(60 * 60);
        String host = request.getHeader("Host");
        String substring = host.substring(0, host.lastIndexOf(":"));
        cookie.setDomain(substring);
        response.addCookie(cookie);
    }

    /**
     * @return : void
     * @author : sunpx
     * @desc : 保存cookie
     * @date : 2020/02/07 23:14:28
     * @params : response,cookieName,value
     */
    public static void setCookie(HttpServletResponse response, String cookieName, String value) {
        Cookie cookie = new Cookie(cookieName, value);
        cookie.setPath("/");
        cookie.setMaxAge(60 * 60);
        response.addCookie(cookie);
    }


}
