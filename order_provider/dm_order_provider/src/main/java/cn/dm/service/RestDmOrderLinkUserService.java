package cn.dm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dm.mapper.DmOrderLinkUserMapper;
import cn.dm.pojo.DmOrderLinkUser;

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
public class RestDmOrderLinkUserService {

     @Autowired
     private DmOrderLinkUserMapper dmOrderLinkUserMapper;

     @RequestMapping(value = "/getDmOrderLinkUserById",method = RequestMethod.POST)
     public DmOrderLinkUser getDmOrderLinkUserById(@RequestParam("id") Long id)throws Exception{
        return dmOrderLinkUserMapper.getDmOrderLinkUserById(id);
     }

     @RequestMapping(value = "/getDmOrderLinkUserListByMap",method = RequestMethod.POST)
     public List<DmOrderLinkUser>	getDmOrderLinkUserListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmOrderLinkUserMapper.getDmOrderLinkUserListByMap(param);
     }

     @RequestMapping(value = "/getDmOrderLinkUserCountByMap",method = RequestMethod.POST)
     public Integer getDmOrderLinkUserCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmOrderLinkUserMapper.getDmOrderLinkUserCountByMap(param);
     }

     @RequestMapping(value = "/qdtxAddDmOrderLinkUser",method = RequestMethod.POST)
     public Integer qdtxAddDmOrderLinkUser(@RequestBody DmOrderLinkUser dmOrderLinkUser)throws Exception{
        dmOrderLinkUser.setCreatedTime(new Date());
        return dmOrderLinkUserMapper.insertDmOrderLinkUser(dmOrderLinkUser);
     }

     @RequestMapping(value = "/qdtxModifyDmOrderLinkUser",method = RequestMethod.POST)
     public Integer qdtxModifyDmOrderLinkUser(@RequestBody DmOrderLinkUser dmOrderLinkUser)throws Exception{
        dmOrderLinkUser.setUpdatedTime(new Date());
        return dmOrderLinkUserMapper.updateDmOrderLinkUser(dmOrderLinkUser);
     }
}
