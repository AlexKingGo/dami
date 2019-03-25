package cn.dm.client;
import cn.dm.pojo.DmItemType;

import cn.dm.fallback.DmItemTypeClientFallBack;
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
@FeignClient(name = "dm-item-provider", configuration = DmConfiguration.class, fallback = DmItemTypeClientFallBack.class)
public interface RestDmItemTypeClient {

@RequestMapping(value = "/getDmItemTypeById",method = RequestMethod.POST)
public DmItemType getDmItemTypeById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getDmItemTypeListByMap",method = RequestMethod.POST)
public List<DmItemType>	getDmItemTypeListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDmItemTypeCountByMap",method = RequestMethod.POST)
public Integer getDmItemTypeCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDmItemType",method = RequestMethod.POST)
public Integer qdtxAddDmItemType(@RequestBody DmItemType dmItemType)throws Exception;

@RequestMapping(value = "/qdtxModifyDmItemType",method = RequestMethod.POST)
public Integer qdtxModifyDmItemType(@RequestBody DmItemType dmItemType)throws Exception;
}
