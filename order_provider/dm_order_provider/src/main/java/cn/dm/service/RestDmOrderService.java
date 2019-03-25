package cn.dm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dm.mapper.DmOrderMapper;
import cn.dm.pojo.DmOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
/**
 * Created by 北大课工场
 */
@RestController
public class RestDmOrderService {

     @Autowired
     private DmOrderMapper dmOrderMapper;

     @RequestMapping(value = "/getDmOrderById",method = RequestMethod.POST)
     public DmOrder getDmOrderById(@RequestParam("id") Long id)throws Exception{
        return dmOrderMapper.getDmOrderById(id);
     }

     @RequestMapping(value = "/getDmOrderListByMap",method = RequestMethod.POST)
     public List<DmOrder>	getDmOrderListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmOrderMapper.getDmOrderListByMap(param);
     }

     @RequestMapping(value = "/getDmOrderCountByMap",method = RequestMethod.POST)
     public Integer getDmOrderCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmOrderMapper.getDmOrderCountByMap(param);
     }

     @RequestMapping(value = "/qdtxAddDmOrder",method = RequestMethod.POST)
     public Integer qdtxAddDmOrder(@RequestBody DmOrder dmOrder)throws Exception{
        dmOrder.setCreatedTime(new Date());
        return dmOrderMapper.insertDmOrder(dmOrder);
     }

     @RequestMapping(value = "/qdtxModifyDmOrder",method = RequestMethod.POST)
     public Integer qdtxModifyDmOrder(@RequestBody DmOrder dmOrder)throws Exception{
        dmOrder.setUpdatedTime(new Date());
        return dmOrderMapper.updateDmOrder(dmOrder);
     }
}
