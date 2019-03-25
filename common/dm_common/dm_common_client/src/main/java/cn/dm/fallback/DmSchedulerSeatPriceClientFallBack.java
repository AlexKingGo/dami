package cn.dm.fallback;

import cn.dm.pojo.DmSchedulerSeatPrice;

import cn.dm.client.RestDmSchedulerSeatPriceClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class DmSchedulerSeatPriceClientFallBack implements RestDmSchedulerSeatPriceClient {


    @Override
    public DmSchedulerSeatPrice getDmSchedulerSeatPriceById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<DmSchedulerSeatPrice>	getDmSchedulerSeatPriceListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getDmSchedulerSeatPriceCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddDmSchedulerSeatPrice(DmSchedulerSeatPrice dmSchedulerSeatPrice)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyDmSchedulerSeatPrice(DmSchedulerSeatPrice dmSchedulerSeatPrice)throws Exception{
        return null;
    }
}
