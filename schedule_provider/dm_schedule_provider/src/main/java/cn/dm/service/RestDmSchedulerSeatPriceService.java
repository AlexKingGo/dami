package cn.dm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dm.mapper.DmSchedulerSeatPriceMapper;
import cn.dm.pojo.DmSchedulerSeatPrice;

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
public class RestDmSchedulerSeatPriceService {

     @Autowired
     private DmSchedulerSeatPriceMapper dmSchedulerSeatPriceMapper;

     @RequestMapping(value = "/getDmSchedulerSeatPriceById",method = RequestMethod.POST)
     public DmSchedulerSeatPrice getDmSchedulerSeatPriceById(@RequestParam("id") Long id)throws Exception{
        return dmSchedulerSeatPriceMapper.getDmSchedulerSeatPriceById(id);
     }

     @RequestMapping(value = "/getDmSchedulerSeatPriceListByMap",method = RequestMethod.POST)
     public List<DmSchedulerSeatPrice>	getDmSchedulerSeatPriceListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmSchedulerSeatPriceMapper.getDmSchedulerSeatPriceListByMap(param);
     }

     @RequestMapping(value = "/getDmSchedulerSeatPriceCountByMap",method = RequestMethod.POST)
     public Integer getDmSchedulerSeatPriceCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmSchedulerSeatPriceMapper.getDmSchedulerSeatPriceCountByMap(param);
     }

     @RequestMapping(value = "/qdtxAddDmSchedulerSeatPrice",method = RequestMethod.POST)
     public Integer qdtxAddDmSchedulerSeatPrice(@RequestBody DmSchedulerSeatPrice dmSchedulerSeatPrice)throws Exception{
        dmSchedulerSeatPrice.setCreatedTime(new Date());
        return dmSchedulerSeatPriceMapper.insertDmSchedulerSeatPrice(dmSchedulerSeatPrice);
     }

     @RequestMapping(value = "/qdtxModifyDmSchedulerSeatPrice",method = RequestMethod.POST)
     public Integer qdtxModifyDmSchedulerSeatPrice(@RequestBody DmSchedulerSeatPrice dmSchedulerSeatPrice)throws Exception{
        dmSchedulerSeatPrice.setUpdatedTime(new Date());
        return dmSchedulerSeatPriceMapper.updateDmSchedulerSeatPrice(dmSchedulerSeatPrice);
     }
}
