package cn.dm.client;
import cn.dm.pojo.DmUser;

import cn.dm.fallback.DmUserClientFallBack;
import java.util.List;
import java.util.Map;

import cn.dm.config.DmConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
/**
* Created by shang-pc on 2018/5/15.
*/
@FeignClient(name = "dm-user-provider", configuration = DmConfiguration.class, fallback = DmUserClientFallBack.class)
public interface RestDmUserClient {
@RequestMapping(value = "/getDmUserById",method = RequestMethod.POST)
public DmUser getDmUserById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getDmUserListByMap",method = RequestMethod.POST)
public List<DmUser>	getDmUserListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDmUserCountByMap",method = RequestMethod.POST)
public Integer getDmUserCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDmUser",method = RequestMethod.POST)
public Integer qdtxAddDmUser(@RequestBody DmUser dmUser)throws Exception;

@RequestMapping(value = "/qdtxModifyDmUser",method = RequestMethod.POST)
public Integer qdtxModifyDmUser(@RequestBody DmUser dmUser)throws Exception;
}

