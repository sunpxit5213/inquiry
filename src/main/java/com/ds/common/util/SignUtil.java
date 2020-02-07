package com.ds.common.util;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.HexUtil;
import cn.hutool.crypto.CryptoException;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;

import java.util.Date;

/**
 * @ClassName: Sign
 * @Author: sunpxit
 * @Description: 签名工具类
 * @Date: 2020/2/7 19:06
 */
public class SignUtil {


    /**
    * @author  : sunpx
    * @desc    : 生成签名
    * @date    : 2020/02/07 19:10:05
    * @params  :
    * @return  : java.lang.String
    */

   public static String getToken(){
       RSA rsa = new RSA(TokenKey.getPrivateKey(), TokenKey.getPublicKey());
       String now = DateUtil.now();
       String sign = rsa.encryptStr(now, KeyType.PublicKey);
       return sign;
   }


   /**
   * @author  : sunpx
   * @desc    : 验证签名
   * @date    : 2020/02/07 22:04:22
   * @params  : data
   * @return  : boolean
   */
    public static boolean isToken(String data){
       try {
           RSA rsa = new RSA(TokenKey.getPrivateKey(), TokenKey.getPublicKey());
           byte[] aByte = HexUtil.decodeHex(data);
           byte[] decrypt = rsa.decrypt(aByte, KeyType.PrivateKey);
           Date date1 = DateUtil.parse( DateUtil.now());

           Date date2 = DateUtil.parse(new String(decrypt));
           if (DateUtil.between(date1, date2, DateUnit.MINUTE)<=60){
               return true;
           }
           return false;
       }catch (CryptoException e){
           return false;
       }
    }
}
