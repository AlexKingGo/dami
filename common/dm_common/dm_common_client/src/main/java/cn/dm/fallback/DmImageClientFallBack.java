package cn.dm.fallback;

import cn.dm.pojo.DmImage;

import cn.dm.client.RestDmImageClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class DmImageClientFallBack implements RestDmImageClient {


    @Override
    public DmImage getDmImageById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<DmImage>	getDmImageListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getDmImageCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddDmImage(DmImage dmImage)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyDmImage(DmImage dmImage)throws Exception{
        return null;
    }
}
