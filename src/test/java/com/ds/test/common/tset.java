package com.ds.test.common;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.core.util.HexUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;
import com.ds.common.util.TokenKey;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.File;
import java.util.Date;

/**
 * @ClassName: tset
 * @Author: sunpxit
 * @Description:
 * @Date: 2020/2/7 19:17
 */
@Slf4j
public class tset {
    FileWriter writer = new FileWriter(new File("D:\\IDE\\Publickey.txt"));

    RSA rsa = new RSA();
    @Test
    public void s(){
        String dateStr1 = "2017-04-01 22:00:00";
        Date date1 = DateUtil.parse(dateStr1);

        String dateStr2 = "2017-04-01 23:00:00";
        Date date2 = DateUtil.parse(dateStr2);

//相差一个月，31天
        long betweenDay = DateUtil.between(date1, date2, DateUnit.MINUTE);
        System.out.println(betweenDay);
    }

    @Test
    /**
     * 生成私钥
     */
    public void privateK(){

//        String privateKeyBase64 = rsa.getPrivateKeyBase64();
//        log.info(privateKeyBase64);
//        writer.write(privateKeyBase64);

    }

    @Test
    /**
     * 生成公钥
     */
    public void puKey(){
//        String publicKeyBase64 = rsa.getPublicKeyBase64();
//        log.info(publicKeyBase64);
//
//        writer.write(publicKeyBase64);
    }


    public String a= "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC+Z7F4iAicn3JxNbtPu1wFYIPUYIgVV2Yngksl78UrIGkg89ekqzKFaUZYXViwLVcaXTBa7Eazej1evIB7IYejwx0AkoZgJQuazbieUjzocKi6/gTpOPQMF6V2x1teG0IEi5kjX8lgAQ3btythkgFmW/JFzzGx/BIwWJnfgYv0aQIDAQAB";
    public String b="MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAL5nsXiICJyfcnE1u0+7XAVgg9RgiBVXZieCSyXvxSsgaSDz16SrMoVpRlhdWLAtVxpdMFrsRrN6PV68gHshh6PDHQCShmAlC5rNuJ5SPOhwqLr+BOk49AwXpXbHW14bQgSLmSNfyWABDdu3K2GSAWZb8kXPMbH8EjBYmd+Bi/RpAgMBAAECgYB2SKKWdyOqcN8+dxvC/2i+KmQbJlDDuUTL3IRkr9wz23GTuAfJ01SSToEV2f+DitcmmKe2hDuzuYewd7f1RjIlNnsoDv5PCNe7rnK0u9ONnSuVcMZo+U1a4OBcRfk8UB/ZQWWXy8/Z25Wo2WSqZ4uDLJFLPsAN/V8GCPot5pOV9QJBAN35dWdsY7Qjd10oNbYcEu0yA9Z/of43WvsY5ddy+tBwzxNY85vVyfphj8TgBzfSD+iYTjLhvt2xTj5GHl1bMqcCQQDbl2n606ynF1t+z2GIWdgEkoKvjE9JPCWUx2OBPLnUooGQh4JcaRv7K09UO1Hs1qrQqUPtQTmaghZPuQp/bNJvAkEAsM1JXh9PKuQ05tZoMa0axiLYO7ldZgbhSK8EIx9J90xjI53uK2mVfwDGaqGmHigK09C8OHrmc94N3DwtY16IcQJAVty6K2H39dCjfLID3q/LZ2OdFlvmMQ39v7Bvh/vBdn8hyU4RHwTk8KHdK3Cbo5f20btjB0K5yoiS0s5bfLRLOQJALdfsTY4lCdewnpujR69K9QpLqxyNMeAY4WcEad+6ztMVGeBn2w2MUhWBhLr8dryVE3SApWbCwk4NMb+Dp5mv/g==";
    @Test
    public void s4(){
//        String privateKeyBase64 = rsa.getPrivateKeyBase64();
//        String publicKeyBase64 = rsa.getPublicKeyBase64();
        RSA rsa1 = new RSA(TokenKey.getPrivateKey(), TokenKey.getPublicKey());
        String now = DateUtil.now();
        String s = rsa1.encryptStr(now, KeyType.PublicKey);
        byte[] aByte = HexUtil.decodeHex(s);
        byte[] decrypt = rsa.decrypt(aByte, KeyType.PrivateKey);
        System.out.println(new String(decrypt));
    }




    @Test
    public void test2(){
        /*String id="{\"id\":123}";
        InqUser inqUser = JSONUtil.toBean(id, InqUser.class);
        System.out.println(inqUser);*/
        String a="12345#abcdefg";
        int i = a.lastIndexOf("#");
        System.out.println( a .substring(i+1));

    }
}
