package cn.dm.fallback;

import cn.dm.pojo.DmLinkUser;

import cn.dm.client.RestDmLinkUserClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class DmLinkUserClientFallBack implements RestDmLinkUserClient {


    @Override
    public DmLinkUser getDmLinkUserById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<DmLinkUser>	getDmLinkUserListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getDmLinkUserCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddDmLinkUser(DmLinkUser dmLinkUser)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyDmLinkUser(DmLinkUser dmLinkUser)throws Exception{
        return null;
    }
}
