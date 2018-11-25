package cn.hy.utiles;

import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;
import java.util.UUID;


public class CommonUtils {

    public static String uuid() {
        return UUID.randomUUID().toString().replace("-","").toUpperCase();
    }

    /**
     * 将一个map中的数据拷贝TUser的JavaBean对象
     * @param map
     * @return
     */
    public static <T> T toBean(Map<String, String[]> map, Class<T> clazz) {
        try {
            T t = clazz.newInstance();
            BeanUtils.populate(t, map);
            return t;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
