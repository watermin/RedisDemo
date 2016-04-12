package com.coinvs.redis.util2;
import com.coinvs.entity.TotalNote;

import redis.clients.jedis.Jedis;

public class Test {

      /**
      * Administrator
      * @param args
     * @throws Exception 
      */
      public static void main(String[] args) throws Exception {
           
            // 操作单独的文本串
           Jedis redis= new Jedis( "192.168.2.66", 6379);
           
           redis.set( "key", "value");
           System. out.println(redis.get( "key"));
           System. out.println(redis.del( "key"));
           
            // 操作实体类对象
           TotalNote note = new TotalNote("1","这是真的!","嘿嘿"); 
           
           redis.set( "note".getBytes(), SerializeUtil. serialize(note));
            byte[] value = redis.get( "note".getBytes());
           Object object = SerializeUtil. unserialize(value);           
            if(object!= null){
                note = (TotalNote)object;
                System. out.println(note.getError_code());
                System. out.println(note.getError_message());
                System. out.println(note.getData());
           }
           System. out.println(redis.del( "note".getBytes()));
           
            // 操作实体类对象2（实际上和上面是一样的）
           String key= "note2";
           TotalNote note2 = new TotalNote("1","这是真的!","嘿嘿");
           String temp=RedisClinet. getInstance().set(note2, key);
           System. out.println(temp);
           
           Object o=RedisClinet. getInstance().get(key);
            if(o!= null)
           {
                TotalNote g1=(TotalNote)o;
                System. out.println(g1.getError_code());
                System. out.println(g1.getError_message());
           }
          System. out.println(RedisClinet. getInstance().del(key));
          
           
     }
}