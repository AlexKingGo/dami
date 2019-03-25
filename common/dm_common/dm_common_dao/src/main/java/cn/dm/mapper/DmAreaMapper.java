package cn.dm.mapper;
import cn.dm.pojo.DmArea;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DmAreaMapper {

	public DmArea getDmAreaById(@Param(value = "id") Long id)throws Exception;

	public List<DmArea>	getDmAreaListByMap(Map<String,Object> param)throws Exception;

	public Integer getDmAreaCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertDmArea(DmArea dmArea)throws Exception;

	public Integer updateDmArea(DmArea dmArea)throws Exception;

	public Integer deleteDmAreaById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteDmArea(Map<String,List<String>> params);

}
