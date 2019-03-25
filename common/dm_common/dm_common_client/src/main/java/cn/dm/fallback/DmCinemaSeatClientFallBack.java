package cn.dm.fallback;

import cn.dm.pojo.DmCinemaSeat;

import cn.dm.client.RestDmCinemaSeatClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class DmCinemaSeatClientFallBack implements RestDmCinemaSeatClient {


    @Override
    public DmCinemaSeat getDmCinemaSeatById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<DmCinemaSeat>	getDmCinemaSeatListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getDmCinemaSeatCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddDmCinemaSeat(DmCinemaSeat dmCinemaSeat)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyDmCinemaSeat(DmCinemaSeat dmCinemaSeat)throws Exception{
        return null;
    }
}
