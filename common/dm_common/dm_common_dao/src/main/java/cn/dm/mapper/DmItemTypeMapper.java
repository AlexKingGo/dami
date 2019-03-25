package cn.dm.mapper;
import cn.dm.pojo.DmItemType;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DmItemTypeMapper {

	public DmItemType getDmItemTypeById(@Param(value = "id") Long id)throws Exception;

	public List<DmItemType>	getDmItemTypeListByMap(Map<String,Object> param)throws Exception;

	public Integer getDmItemTypeCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertDmItemType(DmItemType dmItemType)throws Exception;

	public Integer updateDmItemType(DmItemType dmItemType)throws Exception;

	public Integer deleteDmItemTypeById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteDmItemType(Map<String,List<String>> params);

}
