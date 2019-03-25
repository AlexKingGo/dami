package cn.dm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dm.mapper.DmSchedulerMapper;
import cn.dm.pojo.DmScheduler;

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
public class RestDmSchedulerService {

     @Autowired
     private DmSchedulerMapper dmSchedulerMapper;

     @RequestMapping(value = "/getDmSchedulerById",method = RequestMethod.POST)
     public DmScheduler getDmSchedulerById(@RequestParam("id") Long id)throws Exception{
        return dmSchedulerMapper.getDmSchedulerById(id);
     }

     @RequestMapping(value = "/getDmSchedulerListByMap",method = RequestMethod.POST)
     public List<DmScheduler>	getDmSchedulerListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmSchedulerMapper.getDmSchedulerListByMap(param);
     }

     @RequestMapping(value = "/getDmSchedulerCountByMap",method = RequestMethod.POST)
     public Integer getDmSchedulerCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmSchedulerMapper.getDmSchedulerCountByMap(param);
     }

     @RequestMapping(value = "/qdtxAddDmScheduler",method = RequestMethod.POST)
     public Integer qdtxAddDmScheduler(@RequestBody DmScheduler dmScheduler)throws Exception{
        dmScheduler.setCreatedTime(new Date());
        return dmSchedulerMapper.insertDmScheduler(dmScheduler);
     }

     @RequestMapping(value = "/qdtxModifyDmScheduler",method = RequestMethod.POST)
     public Integer qdtxModifyDmScheduler(@RequestBody DmScheduler dmScheduler)throws Exception{
        dmScheduler.setUpdatedTime(new Date());
        return dmSchedulerMapper.updateDmScheduler(dmScheduler);
     }
}
