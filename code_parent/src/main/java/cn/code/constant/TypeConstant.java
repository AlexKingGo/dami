package cn.code.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 北大课工场
 */
public class TypeConstant {
    /***
     * ����ת����Map
     */
    private static Map<String, String> typeMap = new HashMap<String, String>();

    static {
        typeMap.put("BIGINT", "Long");
        typeMap.put("INT", "Integer");
        typeMap.put("VARCHAR", "String");
        typeMap.put("TEXT", "String");
        typeMap.put("DATETIME", "Date");
        typeMap.put("DECIMAL", "Double");
    }

    public static void addType(String columnType, String javaType) {
        typeMap.put(columnType, javaType);
    }

    public static String getJavaType(String columnType) {
        return typeMap.get(columnType);
    }
}
