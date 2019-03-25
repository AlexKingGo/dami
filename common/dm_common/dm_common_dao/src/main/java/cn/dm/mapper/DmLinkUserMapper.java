package cn.dm.mapper;
import cn.dm.pojo.DmLinkUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DmLinkUserMapper {

	public DmLinkUser getDmLinkUserById(@Param(value = "id") Long id)throws Exception;

	public List<DmLinkUser>	getDmLinkUserListByMap(Map<String,Object> param)throws Exception;

	public Integer getDmLinkUserCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertDmLinkUser(DmLinkUser dmLinkUser)throws Exception;

	public Integer updateDmLinkUser(DmLinkUser dmLinkUser)throws Exception;

	public Integer deleteDmLinkUserById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteDmLinkUser(Map<String,List<String>> params);

}
