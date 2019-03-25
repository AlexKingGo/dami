package cn.dm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dm.mapper.DmItemTypeMapper;
import cn.dm.pojo.DmItemType;

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
public class RestDmItemTypeService {

     @Autowired
     private DmItemTypeMapper dmItemTypeMapper;

     @RequestMapping(value = "/getDmItemTypeById",method = RequestMethod.POST)
     public DmItemType getDmItemTypeById(@RequestParam("id") Long id)throws Exception{
        return dmItemTypeMapper.getDmItemTypeById(id);
     }

     @RequestMapping(value = "/getDmItemTypeListByMap",method = RequestMethod.POST)
     public List<DmItemType>	getDmItemTypeListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmItemTypeMapper.getDmItemTypeListByMap(param);
     }

     @RequestMapping(value = "/getDmItemTypeCountByMap",method = RequestMethod.POST)
     public Integer getDmItemTypeCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmItemTypeMapper.getDmItemTypeCountByMap(param);
     }

     @RequestMapping(value = "/qdtxAddDmItemType",method = RequestMethod.POST)
     public Integer qdtxAddDmItemType(@RequestBody DmItemType dmItemType)throws Exception{
        dmItemType.setCreatedTime(new Date());
        return dmItemTypeMapper.insertDmItemType(dmItemType);
     }

     @RequestMapping(value = "/qdtxModifyDmItemType",method = RequestMethod.POST)
     public Integer qdtxModifyDmItemType(@RequestBody DmItemType dmItemType)throws Exception{
        dmItemType.setUpdatedTime(new Date());
        return dmItemTypeMapper.updateDmItemType(dmItemType);
     }
}
