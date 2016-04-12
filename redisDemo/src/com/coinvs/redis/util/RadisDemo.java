package com.coinvs.redis.util;

import redis.clients.jedis.Jedis;

//import redis.clients.jedis.Jedis;
public class RadisDemo {
	
	   public static void main(String[] args) {
	      //连接本地的 Redis 服务
	      Jedis jedis = new Jedis("192.168.1.66",6379);
	      System.out.println("Connection to server sucessfully");
	      //查看服务是否运行
	      System.out.println("Server is running: "+jedis.ping());
	}

}
