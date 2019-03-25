package cn.dm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dm.mapper.DmLinkUserMapper;
import cn.dm.pojo.DmLinkUser;

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
public class RestDmLinkUserService {

     @Autowired
     private DmLinkUserMapper dmLinkUserMapper;

     @RequestMapping(value = "/getDmLinkUserById",method = RequestMethod.POST)
     public DmLinkUser getDmLinkUserById(@RequestParam("id") Long id)throws Exception{
        return dmLinkUserMapper.getDmLinkUserById(id);
     }

     @RequestMapping(value = "/getDmLinkUserListByMap",method = RequestMethod.POST)
     public List<DmLinkUser>	getDmLinkUserListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmLinkUserMapper.getDmLinkUserListByMap(param);
     }

     @RequestMapping(value = "/getDmLinkUserCountByMap",method = RequestMethod.POST)
     public Integer getDmLinkUserCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmLinkUserMapper.getDmLinkUserCountByMap(param);
     }

     @RequestMapping(value = "/qdtxAddDmLinkUser",method = RequestMethod.POST)
     public Integer qdtxAddDmLinkUser(@RequestBody DmLinkUser dmLinkUser)throws Exception{
        dmLinkUser.setCreatedTime(new Date());
        return dmLinkUserMapper.insertDmLinkUser(dmLinkUser);
     }

     @RequestMapping(value = "/qdtxModifyDmLinkUser",method = RequestMethod.POST)
     public Integer qdtxModifyDmLinkUser(@RequestBody DmLinkUser dmLinkUser)throws Exception{
        dmLinkUser.setUpdatedTime(new Date());
        return dmLinkUserMapper.updateDmLinkUser(dmLinkUser);
     }
}
