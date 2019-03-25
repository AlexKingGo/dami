package cn.dm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dm.mapper.DmAreaMapper;
import cn.dm.pojo.DmArea;

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
public class RestDmAreaService {

     @Autowired
     private DmAreaMapper dmAreaMapper;

     @RequestMapping(value = "/getDmAreaById",method = RequestMethod.POST)
     public DmArea getDmAreaById(@RequestParam("id") Long id)throws Exception{
        return dmAreaMapper.getDmAreaById(id);
     }

     @RequestMapping(value = "/getDmAreaListByMap",method = RequestMethod.POST)
     public List<DmArea>	getDmAreaListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmAreaMapper.getDmAreaListByMap(param);
     }

     @RequestMapping(value = "/getDmAreaCountByMap",method = RequestMethod.POST)
     public Integer getDmAreaCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmAreaMapper.getDmAreaCountByMap(param);
     }

     @RequestMapping(value = "/qdtxAddDmArea",method = RequestMethod.POST)
     public Integer qdtxAddDmArea(@RequestBody DmArea dmArea)throws Exception{
        dmArea.setCreatedTime(new Date());
        return dmAreaMapper.insertDmArea(dmArea);
     }

     @RequestMapping(value = "/qdtxModifyDmArea",method = RequestMethod.POST)
     public Integer qdtxModifyDmArea(@RequestBody DmArea dmArea)throws Exception{
        dmArea.setUpdatedTime(new Date());
        return dmAreaMapper.updateDmArea(dmArea);
     }
}
