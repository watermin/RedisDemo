package com.coinvs.redis.util2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Administrator
 *
 */
public class SerializeUtil {
      public static byte[] serialize(Object object) throws Exception {
           ObjectOutputStream oos = null;
            ByteArrayOutputStream baos = null;
            try {
                 // 序列化
                baos = new ByteArrayOutputStream();
                oos = new ObjectOutputStream(baos);
                oos.writeObject(object);
                 byte[] bytes = baos.toByteArray();
                 return bytes;
           } catch (Exception e) {
        	   throw e;
           }
     }

      public static Object unserialize( byte[] bytes) throws Exception {
           ByteArrayInputStream bais = null;
            try {
                 // 反序列化
                bais = new ByteArrayInputStream(bytes);
                ObjectInputStream ois = new ObjectInputStream(bais);
                 return ois.readObject();
           } catch (Exception e) {
        	   throw e;
           }
     }
}

