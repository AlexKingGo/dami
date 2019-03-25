package cn.dm.mapper;
import cn.dm.pojo.DmSchedulerSeatPrice;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DmSchedulerSeatPriceMapper {

	public DmSchedulerSeatPrice getDmSchedulerSeatPriceById(@Param(value = "id") Long id)throws Exception;

	public List<DmSchedulerSeatPrice>	getDmSchedulerSeatPriceListByMap(Map<String,Object> param)throws Exception;

	public Integer getDmSchedulerSeatPriceCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertDmSchedulerSeatPrice(DmSchedulerSeatPrice dmSchedulerSeatPrice)throws Exception;

	public Integer updateDmSchedulerSeatPrice(DmSchedulerSeatPrice dmSchedulerSeatPrice)throws Exception;

	public Integer deleteDmSchedulerSeatPriceById(@Param(value = "id") Long id)throws Exception;

	public Integer batchDeleteDmSchedulerSeatPrice(Map<String,List<String>> params);

}
