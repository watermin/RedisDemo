package com.coinvs.redis.util2;
import redis.clients.jedis.Jedis;
/**
 *
 * @author ajun
 *
 */
public class RedisClinet {
      private static final String ip= "10.2.31.38";
      private static final int port=6379;
      protected static RedisClinet redis = new RedisClinet ();
      protected static Jedis jedis = new Jedis( ip, port);;
      static {
           
     }
    protected RedisClinet(){
       System. out.println( " init Redis ");
    }
    public static RedisClinet getInstance()
    {
        return redis;
    }
   
    /**set Object
     * @throws Exception */
      public String set(Object object,String key) throws Exception
     {
            return jedis.set(key.getBytes(), SerializeUtil.serialize(object));
     }
     
      /**get Object
     * @throws Exception */
      public Object get(String key) throws Exception
     {
            byte[] value = jedis.get(key.getBytes());
            return SerializeUtil. unserialize(value);
     }
     
      /**delete a key**/
      public boolean del(String key)
     {
            return jedis.del(key.getBytes())>0;
     }

}