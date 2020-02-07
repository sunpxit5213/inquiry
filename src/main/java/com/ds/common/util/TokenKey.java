package com.ds.common.util;

/**
 * @ClassName: TokenKey
 * @Author: sunpxit
 * @Description: 签名秘钥
 * @Date: 2020/2/7 20:25
 */
public class TokenKey {


    /**
     * 获取公钥
     * @return
     */
    public static String getPublicKey(){
        return "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCpZ1MxJNtuC/5o4q8FYm1Jrcubl9DPPjPtx/7VpcEZfbovRR1DLzXfmZRPPgdPPdiw2XI2bGW4hjHbS2TbtEQ97zBMjjeOi8xQEylzxDNat0fk7n2aMzHBaBHWVI7BTS4H+HRHMjLAa2IXmJhN+RdNyA6uTkdoexBDtiMn2ivDdwIDAQAB";
    }

    /**
     * 获取私钥
     * @return
     */
    public static String getPrivateKey() {
        return "MIICdQIBADANBgkqhkiG9w0BAQEFAASCAl8wggJbAgEAAoGBAKlnUzEk224L/mjirwVibUmty5uX0M8+M+3H/tWlwRl9ui9FHUMvNd+ZlE8+B0892LDZcjZsZbiGMdtLZNu0RD3vMEyON46LzFATKXPEM1q3R+TufZozMcFoEdZUjsFNLgf4dEcyMsBrYheYmE35F03IDq5OR2h7EEO2IyfaK8N3AgMBAAECgYB2OzMI3Zx4Vc6eDXfx3hxAjBfK5E5MFjHQBwGIw0LeM626SBaASXbkNCAankQjvhp6c4kPCuCDxMUPNLOT02C8Y79IM2Yd3ZTiGMAKYdCq5NTfM+pdytnCrbLFao26cxB5O50FA39RGg/Qe1LLMIU6b//dpCp0sR6uu2/Wny6ZIQJBAO7wy7/MemDQeouMWgqZaDZtPQZFFe+2y6YSO0mvfCM0tH0YzB8qZXsI6/gnOdMwWv5axmzmugcY04iYzJoZWg0CQQC1f5OB1yK+aWwZKiVg4qhZDPXPlfl6LN05Z59bF0zcXOGYvUmvUTkPGn5rkRQhJ1ckzn4qt+AnySRRR1yfE8aTAkBKnPTzCrY4X0G1K/m+D5OEU25X8+Davzkuvci3xM297Kpj2gd7v/B6kBmnnxAmi5YOkWge/5mdt7nukNBrWnlNAkAtUB6ZqgaIl3VfiwAuAiiZovyzyPOyJwVMUaydZ2HPGnlQUuHUnWirdqfdXykxZcsB63PgYmvaQwOIL1LWfG91AkBJuwGqMwVw9D+DLdhj9DSwO2sVynUAN7BHGkm8VTha19Aq1JqGkQNMT8JlXB2qAhk7udfICnNgxVG+wXugoM/A";
    }
}
