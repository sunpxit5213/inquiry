package com.ds.common.util;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.HexUtil;
import cn.hutool.crypto.CryptoException;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import cn.hutool.json.JSONUtil;

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
        String sign = rsa.encryptStr(data+"#"+now, KeyType.PublicKey);
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
            RSA rsa = new RSA(TokenKey.getPrivateKey(), TokenKey.getPublicKey());
            byte[] aByte = HexUtil.decodeHex(data);
            byte[] decrypt = rsa.decrypt(aByte, KeyType.PrivateKey);

            String s = new String(decrypt);

            Date date1 = DateUtil.parse(DateUtil.now());
            int i = s.lastIndexOf("#");


            Date date2 = DateUtil.parse(s.substring(i+1));
            if (DateUtil.between(date1, date2, DateUnit.MINUTE) <= 60) {
                return true;
            }
            return false;
        } catch (CryptoException e) {
            return false;
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
