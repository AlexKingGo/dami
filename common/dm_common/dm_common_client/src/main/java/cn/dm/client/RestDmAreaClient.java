package cn.dm.client;
import cn.dm.pojo.DmArea;

import cn.dm.fallback.DmAreaClientFallBack;
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
@FeignClient(name = "dm-common-provider", configuration = DmConfiguration.class, fallback = DmAreaClientFallBack.class)
public interface RestDmAreaClient {

    @RequestMapping(value = "/getDmAreaById",method = RequestMethod.POST)
    public DmArea getDmAreaById(@RequestParam("id") Long id)throws Exception;

    @RequestMapping(value = "/getDmAreaListByMap",method = RequestMethod.POST)
    public List<DmArea>	getDmAreaListByMap(@RequestParam Map<String,Object> param)throws Exception;

    @RequestMapping(value = "/getDmAreaCountByMap",method = RequestMethod.POST)
    public Integer getDmAreaCountByMap(@RequestParam Map<String,Object> param)throws Exception;

    @RequestMapping(value = "/qdtxAddDmArea",method = RequestMethod.POST)
    public Integer qdtxAddDmArea(@RequestBody DmArea dmArea)throws Exception;

    @RequestMapping(value = "/qdtxModifyDmArea",method = RequestMethod.POST)
    public Integer qdtxModifyDmArea(@RequestBody DmArea dmArea)throws Exception;
}
