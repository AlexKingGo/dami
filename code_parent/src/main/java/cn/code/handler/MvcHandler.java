package cn.code.handler;

import cn.code.bean.Table;
import cn.code.constant.Constant;
import cn.code.util.FreeMarkerUtils;
import cn.code.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 北大课工场
 */
public class MvcHandler {

    String templateFile = Constant.template_path;

    public void executeModule(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "dm");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = table.getClassName() + ".java";
        String savePath = Constant.model_save_path;
        String templateName = "model";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeClient_dm_common(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "dm");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Client" + ".java";
        String savePath = Constant.client_dm_save_path + "//";
        String templateName = "client_dm_common";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeClientFallBack_dm(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "dm");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = table.getClassName() + "ClientFallBack" + ".java";
        String savePath = Constant.client_dm_fallback_save_path + "//";
        String templateName = "client_dm_fallback";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeClient_dm_item(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "dm");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Client" + ".java";
        String savePath = Constant.client_dm_save_path + "//";
        String templateName = "client_dm_item";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeClient_dm_order(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "dm");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Client" + ".java";
        String savePath = Constant.client_dm_save_path + "//";
        String templateName = "client_dm_order";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeClient_dm_pay(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "dm");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Client" + ".java";
        String savePath = Constant.client_dm_save_path + "//";
        String templateName = "client_dm_pay";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeClient_dm_scheduler(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "dm");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Client" + ".java";
        String savePath = Constant.client_dm_save_path + "//";
        String templateName = "client_dm_scheduler";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeClient_dm_user(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "dm");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Client" + ".java";
        String savePath = Constant.client_dm_save_path + "//";
        String templateName = "client_dm_user";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeService_dm_item(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "dm");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Service" + ".java";
        String savePath = Constant.service_dm_item_save_path + "//";
        String templateName = "service_dm";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeService_dm_order(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "dm");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Service" + ".java";
        String savePath = Constant.service_dm_order_save_path + "//";
        String templateName = "service_dm";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeService_dm_pay(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "dm");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Service" + ".java";
        String savePath = Constant.service_dm_pay_save_path + "//";
        String templateName = "service_dm";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeService_dm_scheduler(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "dm");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Service" + ".java";
        String savePath = Constant.service_dm_scheduler_save_path + "//";
        String templateName = "service_dm";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeService_dm_user(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "dm");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Service" + ".java";
        String savePath = Constant.service_dm_user_save_path + "//";
        String templateName = "service_dm";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeService_dm_common(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "dm");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = "Rest"+table.getClassName() + "Service" + ".java";
        String savePath = Constant.service_dm_common_save_path + "//";
        String templateName = "service_dm";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeMapper(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "dm");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = table.getClassName() + "Mapper" + ".xml";
        String savePath = Constant.mapper_save_path + "//";
        String templateName = "mapper";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

    public void executeClazzMapper(Table table) {
        Map input = new HashMap();
        input.put("table", table);
        input.put("package", "dm");
        input.put("lowerClassName", StringUtils.lowerName(table.getClassName()));
        String fileName = table.getClassName() + "Mapper" + ".java";
        String savePath = Constant.class_mapper_save_path +"//";
        String templateName = "clazzMapper";
        FreeMarkerUtils.genteratorFile(input, templateFile, templateName, savePath, fileName);
    }

}
