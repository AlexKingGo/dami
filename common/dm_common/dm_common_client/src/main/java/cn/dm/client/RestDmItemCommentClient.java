package cn.dm.client;
import cn.dm.pojo.DmItemComment;

import cn.dm.fallback.DmItemCommentClientFallBack;
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
@FeignClient(name = "dm-item-provider", configuration = DmConfiguration.class, fallback = DmItemCommentClientFallBack.class)
public interface RestDmItemCommentClient {

@RequestMapping(value = "/getDmItemCommentById",method = RequestMethod.POST)
public DmItemComment getDmItemCommentById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getDmItemCommentListByMap",method = RequestMethod.POST)
public List<DmItemComment>	getDmItemCommentListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDmItemCommentCountByMap",method = RequestMethod.POST)
public Integer getDmItemCommentCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDmItemComment",method = RequestMethod.POST)
public Integer qdtxAddDmItemComment(@RequestBody DmItemComment dmItemComment)throws Exception;

@RequestMapping(value = "/qdtxModifyDmItemComment",method = RequestMethod.POST)
public Integer qdtxModifyDmItemComment(@RequestBody DmItemComment dmItemComment)throws Exception;
}
