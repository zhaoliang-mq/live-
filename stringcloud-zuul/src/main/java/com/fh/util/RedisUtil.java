package com.fh.util;

import redis.clients.jedis.Jedis;

import java.util.List;

public class RedisUtil {

    //设置
    public static void set(String key,String value){
        Jedis jedis =null;
        try {
            jedis = RedisPool.getJedis();
            //jedis.set(key, value, nxxx, "EX", time);
            jedis.set(key, value);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
    };
    //获取
    public static String get(String key){
        Jedis jedis =null;
        String s =null;
        try {
            jedis = RedisPool.getJedis();
            s = jedis.get(key);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return s;
    };
    //删除
    public static void del(String key){
        Jedis jedis =null;
        try {
            jedis = RedisPool.getJedis();
            jedis.del(key);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
    };
    //设置+失效时间
    public static void set(String key,String value,int seconds){
        Jedis jedis =null;
        try {
            jedis = RedisPool.getJedis();
            jedis.set(key,value);
            jedis.expire(key,seconds);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
    }
    //设置 hash
    public static void hset(String key,String value,String field){
        Jedis jedis =null;
        try {
            jedis = RedisPool.getJedis();
            //jedis.set(key, value, nxxx, "EX", time);
            jedis.hset(key,value,field);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
    };
    //获取 hash
    public static String hget(String key,String field){
        Jedis jedis =null;
        String s =null;
        try {
            jedis = RedisPool.getJedis();
            s = jedis.hget(key,field);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return s;
    };
    //判断key是否存在
    public static Boolean exists(String key,String id){
        Jedis jedis =null;
        Boolean s =null;
        try {
            jedis = RedisPool.getJedis();
            s = jedis.hexists(key,id);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return s;
    };
    //是否存在
    public static Boolean exists1(String key){
        Jedis jedis =null;
        Boolean exists =null;
        try {
            jedis = RedisPool.getJedis();
            exists = jedis.exists(key);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return exists;
    }
    public static List<String> hget(String key){
        Jedis jedis =null;
        List<String> s =null;
        try {
            jedis = RedisPool.getJedis();
            s = jedis.hvals(key);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
        return s;
    };
    //删除
    public static Long hdel(String key,String field){
        Jedis jedis =null;
        try {
            jedis = RedisPool.getJedis();
            Long res = jedis.hdel(key, field);
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (null != jedis){
                jedis.close();
            }
        }
    }

    // 删除
    public static Long del1(String key){
        Jedis jedis =null;
        try {
            jedis = RedisPool.getJedis();
            Long res = jedis.hdel(key);
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            if (null != jedis){
                jedis.close();
            }
        }
    }


}
