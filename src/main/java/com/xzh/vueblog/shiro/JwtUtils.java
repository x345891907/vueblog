package com.xzh.vueblog.shiro;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Classname JwtUtils
 * @Description TODO
 * @Date 2020/6/22 22:55
 * @Created by xzh
 */
@Component
@ConfigurationProperties(prefix = "markerhub.jwt")
@Slf4j
public class JwtUtils {
    private String secret;
    private long expire;
    private String header;
    /**
     * 生成jwt token
     */
    public String generateToken(long userId) {
        Date newDate = new Date();
        //过期时间
        Date expireData = new Date(newDate.getTime() + expire * 1000);
        return Jwts.builder()
                    .setHeaderParam("type","JWT")
                    .setSubject(userId+"")
                    .setIssuedAt(newDate)
                    .setExpiration(expireData)
                    .signWith(SignatureAlgorithm.HS512,secret)
                    .compact();
    }

    // 获取jwt的信息
    public Claims getClaimByToken(String token) {
        try{
            return Jwts.parser()
                        .setSigningKey(secret)
                        .parseClaimsJws(token)
                        .getBody();
        }catch (Exception e){
            log.debug("验证令牌错误",e);
            return  null;
        }
    }

    /**
     * token是否过期
     * @return  true：过期
     */
    public boolean isTokenExpired(Date expiration) {
        return expiration.before(new Date());
    }
}

