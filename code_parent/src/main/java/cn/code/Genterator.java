package cn.code;

import cn.code.bean.Table;
import cn.code.handler.MvcHandler;
import cn.code.handler.TableHandler;

import java.util.List;

/**
 * Created by 北大课工场
 */
public class Genterator {

    public static void main(String args[]) throws Exception {
        TableHandler tableHandler = new TableHandler();
        MvcHandler mvcHandler = new MvcHandler();
        List<Table> tableList = tableHandler.getTables();
        for (Table table : tableList) {
    //        mvcHandler.executeModule(table);//0k
//              mvcHandler.executeMapper(table);//ok
//                mvcHandler.executeClazzMapper(table);//ok

//              common模块对应的client接口
//              mvcHandler.executeClient_dm_common(table);//ok
//              mvcHandler.executeClientFallBack_dm(table);//ok

//            item模块对应的client接口
//             mvcHandler.executeClient_dm_item(table);//ok
//             mvcHandler.executeClientFallBack_dm(table);//ok

//             order模块对应的client接口
//             mvcHandler.executeClient_dm_order(table);//ok
//             mvcHandler.executeClientFallBack_dm(table);//ok
//
//             pay模块对应的client接口
//            mvcHandler.executeClient_dm_pay(table);//ok
//            mvcHandler.executeClientFallBack_dm(table);//ok

//             scheduler模块对应的client接口
//            mvcHandler.executeClient_dm_scheduler(table);//ok
//            mvcHandler.executeClientFallBack_dm(table);//ok

//             user模块对应的client接口
//            mvcHandler.executeClient_dm_user(table);//ok
//            mvcHandler.executeClientFallBack_dm(table);//ok

//             item模块对应的provider实现
//            mvcHandler.executeService_dm_item(table);//ok

//             order模块对应的provider实现
//            mvcHandler.executeService_dm_order(table);//ok

//             pay模块对应的provider实现
//            mvcHandler.executeService_dm_pay(table);//ok

//             shceduler模块对应的provider实现
//               mvcHandler.executeService_dm_scheduler(table);//ok

//             user模块对应的provider实现
//            mvcHandler.executeService_dm_user(table);//ok

//             common模块对应的provider实现
              mvcHandler.executeService_dm_common(table);//ok

        }
    }
}