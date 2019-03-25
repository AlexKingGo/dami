package cn.dm.mapper;
import cn.dm.pojo.DmItemComment;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DmItemCommentMapper {

	public DmItemComment getDmItemCommentById(@Param(value = "id") Long id)throws Exception;

	public List<DmItemComment>	getDmItemCommentListByMap(Map<String,Object> param)throws Exception;

	public Integer getDmItemCommentCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertDmItemComment(DmItemComment dmItemComment)throws Exception;

	public Integer updateDmItemComment(DmItemComment dmItemComment)throws Exception;

	public Integer deleteDmItemCommentById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteDmItemComment(Map<String,List<String>> params);

}
