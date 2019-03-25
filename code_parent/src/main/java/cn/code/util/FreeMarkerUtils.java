package cn.code.util;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;
import java.io.*;
import java.util.Map;

/**
 * Created by 北大课工场
 */
public class FreeMarkerUtils {

    private static Template getTemplate(String template_path,String templateFileName){
        Configuration configuration = new Configuration();
        Template template =null;
        try {
            configuration.setDirectoryForTemplateLoading(new File(template_path));
            configuration.setObjectWrapper(new DefaultObjectWrapper());
            configuration.setDefaultEncoding("UTF-8");   //设置编码
            //模板文件
            template=configuration.getTemplate(templateFileName + ".ftl");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return template;
    }

    public static void genteratorFile(Map<String,String> input,String template_path,String templateFileName,String savePath,String fileName){
        Template template=getTemplate(template_path,templateFileName);
        File file = new File(savePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        Writer writer = null;
        try {
            writer=new OutputStreamWriter(new FileOutputStream(savePath+"\\"+fileName), "UTF-8");
            template.process(input, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void appendgenteratorFile(Map<String,String> input,String template_path,String templateFileName,String savePath,String fileName){
        Template template=getTemplate(template_path,templateFileName);
        File file = new File(savePath);
        if (!file.exists()) {
            file.mkdirs();
        }
        Writer writer = null;
        try {
            writer=new OutputStreamWriter(new FileOutputStream(savePath+"\\"+fileName,true), "UTF-8");
            template.process(input, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
