package cn.code.util;

/**
 * Created by 北大课工场
 */
public class StringUtils {
    /**
     * ĳλ����ĸ��д
     *
     * @param name
     * @param indx
     * @return
     */
    public static String captureName(String name, int indx) {
        name = name.substring(0, indx) + name.substring(indx, indx + 1).toUpperCase() + name.substring(indx + 1);
        return name;
    }

    /**
     * ����ĸ��д
     *
     * @param name
     * @return
     */
    public static String captureName(String name) {
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        return name;
    }

    /***
     * ����ĸСд
     *
     * @param name
     * @return
     */
    public static String lowerName(String name) {
        name = name.substring(0, 1).toLowerCase() + name.substring(1);
        return name;
    }

    /***
     * ȥ���»��� �����շ�ԭ�����ת��
     *
     * @return
     */
    public static String putOffUnderline(String columnName) {
        StringBuffer fieldNameBuffer = null;
        String tempNameArray[] = columnName.split("_");
        for (int i = 0; i < tempNameArray.length; i++) {
            if (i == 0) {
                fieldNameBuffer = new StringBuffer(tempNameArray[i]);
            } else {
                fieldNameBuffer.append(captureName(tempNameArray[i]));
            }
        }
        return fieldNameBuffer.toString();
    }

    public static void main(String[] args) {
        String a = putOffUnderline("a_bccc_d");
        System.out.println(a);
    }
}
