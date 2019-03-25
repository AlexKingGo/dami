package cn.dm.fallback;

import cn.dm.pojo.DmTrade;

import cn.dm.client.RestDmTradeClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class DmTradeClientFallBack implements RestDmTradeClient {


    @Override
    public DmTrade getDmTradeById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<DmTrade>	getDmTradeListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getDmTradeCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddDmTrade(DmTrade dmTrade)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyDmTrade(DmTrade dmTrade)throws Exception{
        return null;
    }
}
