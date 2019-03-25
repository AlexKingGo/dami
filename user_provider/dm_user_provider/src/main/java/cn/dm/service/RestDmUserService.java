package cn.dm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dm.mapper.DmUserMapper;
import cn.dm.pojo.DmUser;

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
public class RestDmUserService {

     @Autowired
     private DmUserMapper dmUserMapper;

     @RequestMapping(value = "/getDmUserById",method = RequestMethod.POST)
     public DmUser getDmUserById(@RequestParam("id") Long id)throws Exception{
        return dmUserMapper.getDmUserById(id);
     }

     @RequestMapping(value = "/getDmUserListByMap",method = RequestMethod.POST)
     public List<DmUser>	getDmUserListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmUserMapper.getDmUserListByMap(param);
     }

     @RequestMapping(value = "/getDmUserCountByMap",method = RequestMethod.POST)
     public Integer getDmUserCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmUserMapper.getDmUserCountByMap(param);
     }

     @RequestMapping(value = "/qdtxAddDmUser",method = RequestMethod.POST)
     public Integer qdtxAddDmUser(@RequestBody DmUser dmUser)throws Exception{
        dmUser.setCreatedTime(new Date());
        return dmUserMapper.insertDmUser(dmUser);
     }

     @RequestMapping(value = "/qdtxModifyDmUser",method = RequestMethod.POST)
     public Integer qdtxModifyDmUser(@RequestBody DmUser dmUser)throws Exception{
        dmUser.setUpdatedTime(new Date());
        return dmUserMapper.updateDmUser(dmUser);
     }
}
