package cn.dm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dm.mapper.DmCinemaSeatMapper;
import cn.dm.pojo.DmCinemaSeat;

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
public class RestDmCinemaSeatService {

     @Autowired
     private DmCinemaSeatMapper dmCinemaSeatMapper;

     @RequestMapping(value = "/getDmCinemaSeatById",method = RequestMethod.POST)
     public DmCinemaSeat getDmCinemaSeatById(@RequestParam("id") Long id)throws Exception{
        return dmCinemaSeatMapper.getDmCinemaSeatById(id);
     }

     @RequestMapping(value = "/getDmCinemaSeatListByMap",method = RequestMethod.POST)
     public List<DmCinemaSeat>	getDmCinemaSeatListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmCinemaSeatMapper.getDmCinemaSeatListByMap(param);
     }

     @RequestMapping(value = "/getDmCinemaSeatCountByMap",method = RequestMethod.POST)
     public Integer getDmCinemaSeatCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmCinemaSeatMapper.getDmCinemaSeatCountByMap(param);
     }

     @RequestMapping(value = "/qdtxAddDmCinemaSeat",method = RequestMethod.POST)
     public Integer qdtxAddDmCinemaSeat(@RequestBody DmCinemaSeat dmCinemaSeat)throws Exception{
        dmCinemaSeat.setCreatedTime(new Date());
        return dmCinemaSeatMapper.insertDmCinemaSeat(dmCinemaSeat);
     }

     @RequestMapping(value = "/qdtxModifyDmCinemaSeat",method = RequestMethod.POST)
     public Integer qdtxModifyDmCinemaSeat(@RequestBody DmCinemaSeat dmCinemaSeat)throws Exception{
        dmCinemaSeat.setUpdatedTime(new Date());
        return dmCinemaSeatMapper.updateDmCinemaSeat(dmCinemaSeat);
     }
}
