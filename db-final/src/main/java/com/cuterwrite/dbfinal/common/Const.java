package com.cuterwrite.dbfinal.common;

/**
 * 
 * @author Pang S.Z.
 * @create 2020-09-27 16:35:44
 */
public class Const {
    public static final long EXPIRATION_TIME = 432_000_000;     // 5天(以毫秒ms计)
    public static final String SECRET = "Vy7_TF3_uB4BwRYQ";      // JWT密钥
    public static final String TOKEN_PREFIX = "Bearer";         // Token前缀
    public static final String HEADER_STRING = "Authorization"; // 存放Token的Header Key
}