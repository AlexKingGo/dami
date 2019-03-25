package cn.dm.fallback;

import cn.dm.pojo.DmScheduler;

import cn.dm.client.RestDmSchedulerClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class DmSchedulerClientFallBack implements RestDmSchedulerClient {


    @Override
    public DmScheduler getDmSchedulerById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<DmScheduler>	getDmSchedulerListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getDmSchedulerCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddDmScheduler(DmScheduler dmScheduler)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyDmScheduler(DmScheduler dmScheduler)throws Exception{
        return null;
    }
}
