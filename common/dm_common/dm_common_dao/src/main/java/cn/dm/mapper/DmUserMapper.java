package cn.dm.mapper;
import cn.dm.pojo.DmUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DmUserMapper {

	public DmUser getDmUserById(@Param(value = "id") Long id)throws Exception;

	public List<DmUser>	getDmUserListByMap(Map<String,Object> param)throws Exception;

	public Integer getDmUserCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertDmUser(DmUser dmUser)throws Exception;

	public Integer updateDmUser(DmUser dmUser)throws Exception;

	public Integer deleteDmUserById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteDmUser(Map<String,List<String>> params);

}
