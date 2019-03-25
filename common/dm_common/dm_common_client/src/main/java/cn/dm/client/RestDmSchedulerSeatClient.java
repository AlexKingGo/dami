package cn.dm.client;
import cn.dm.pojo.DmSchedulerSeat;

import cn.dm.fallback.DmSchedulerSeatClientFallBack;
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
@FeignClient(name = "dm-scheduler-provider", configuration = DmConfiguration.class, fallback = DmSchedulerSeatClientFallBack.class)
public interface RestDmSchedulerSeatClient {
@RequestMapping(value = "/getDmSchedulerSeatById",method = RequestMethod.POST)
public DmSchedulerSeat getDmSchedulerSeatById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getDmSchedulerSeatListByMap",method = RequestMethod.POST)
public List<DmSchedulerSeat>	getDmSchedulerSeatListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDmSchedulerSeatCountByMap",method = RequestMethod.POST)
public Integer getDmSchedulerSeatCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDmSchedulerSeat",method = RequestMethod.POST)
public Integer qdtxAddDmSchedulerSeat(@RequestBody DmSchedulerSeat dmSchedulerSeat)throws Exception;

@RequestMapping(value = "/qdtxModifyDmSchedulerSeat",method = RequestMethod.POST)
public Integer qdtxModifyDmSchedulerSeat(@RequestBody DmSchedulerSeat dmSchedulerSeat)throws Exception;
}

