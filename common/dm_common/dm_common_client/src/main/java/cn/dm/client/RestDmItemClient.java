package cn.dm.client;
import cn.dm.pojo.DmItem;

import cn.dm.fallback.DmItemClientFallBack;
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
@FeignClient(name = "dm-item-provider", configuration = DmConfiguration.class, fallback = DmItemClientFallBack.class)
public interface RestDmItemClient {

@RequestMapping(value = "/getDmItemById",method = RequestMethod.POST)
public DmItem getDmItemById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getDmItemListByMap",method = RequestMethod.POST)
public List<DmItem>	getDmItemListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDmItemCountByMap",method = RequestMethod.POST)
public Integer getDmItemCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDmItem",method = RequestMethod.POST)
public Integer qdtxAddDmItem(@RequestBody DmItem dmItem)throws Exception;

@RequestMapping(value = "/qdtxModifyDmItem",method = RequestMethod.POST)
public Integer qdtxModifyDmItem(@RequestBody DmItem dmItem)throws Exception;
}
