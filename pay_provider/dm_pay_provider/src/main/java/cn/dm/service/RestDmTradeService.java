package cn.dm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dm.mapper.DmTradeMapper;
import cn.dm.pojo.DmTrade;

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
public class RestDmTradeService {

     @Autowired
     private DmTradeMapper dmTradeMapper;

     @RequestMapping(value = "/getDmTradeById",method = RequestMethod.POST)
     public DmTrade getDmTradeById(@RequestParam("id") Long id)throws Exception{
        return dmTradeMapper.getDmTradeById(id);
     }

     @RequestMapping(value = "/getDmTradeListByMap",method = RequestMethod.POST)
     public List<DmTrade>	getDmTradeListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmTradeMapper.getDmTradeListByMap(param);
     }

     @RequestMapping(value = "/getDmTradeCountByMap",method = RequestMethod.POST)
     public Integer getDmTradeCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmTradeMapper.getDmTradeCountByMap(param);
     }

     @RequestMapping(value = "/qdtxAddDmTrade",method = RequestMethod.POST)
     public Integer qdtxAddDmTrade(@RequestBody DmTrade dmTrade)throws Exception{
        dmTrade.setCreatedTime(new Date());
        return dmTradeMapper.insertDmTrade(dmTrade);
     }

     @RequestMapping(value = "/qdtxModifyDmTrade",method = RequestMethod.POST)
     public Integer qdtxModifyDmTrade(@RequestBody DmTrade dmTrade)throws Exception{
        dmTrade.setUpdatedTime(new Date());
        return dmTradeMapper.updateDmTrade(dmTrade);
     }
}
