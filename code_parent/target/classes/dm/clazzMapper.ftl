package cn.${package}.mapper;
import cn.${package}.pojo.${table.className};
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ${table.className}Mapper {

	public ${table.className} get${table.className}ById(@Param(value = "id") Long id)throws Exception;

	public List<${table.className}>	get${table.className}ListByMap(Map<String,Object> param)throws Exception;

	public Integer get${table.className}CountByMap(Map<String,Object> param)throws Exception;

	public Integer insert${table.className}(${table.className} ${lowerClassName})throws Exception;

	public Integer update${table.className}(${table.className} ${lowerClassName})throws Exception;

	public Integer delete${table.className}ById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDelete${table.className}(Map<String,List<String>> params);

}
