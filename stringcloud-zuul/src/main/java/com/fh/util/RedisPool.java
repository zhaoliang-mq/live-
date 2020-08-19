package com.fh.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisPool {

     private static JedisPool jedisPool =null;
    private static void initPool(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();//连接池配置
        jedisPoolConfig.setMaxTotal(2000);//设置最大连接数
        jedisPoolConfig.setMaxIdle(100);
        jedisPoolConfig.setMinIdle(100);
        jedisPoolConfig.setTestOnReturn(true);
        jedisPoolConfig.setTestOnBorrow(true);
        //使用jedis 连接redis（连接池配置，地址，端口号）
        jedisPool = new JedisPool(jedisPoolConfig, "192.168.124.130", 6379,10000);
    }
    //静态块 在加载类时只会执行一次
    static{
        initPool();
    }
    //公共方法 供其他类调用
    public static Jedis getJedis(){

        return jedisPool.getResource();
    }
}
