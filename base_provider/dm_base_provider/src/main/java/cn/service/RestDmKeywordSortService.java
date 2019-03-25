package cn.dm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dm.mapper.DmKeywordSortMapper;
import cn.dm.pojo.DmKeywordSort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
/**
 * Created by 北大课工场
 */
@RestController
public class RestDmKeywordSortService {

     @Autowired
     private DmKeywordSortMapper dmKeywordSortMapper;

     @RequestMapping(value = "/getDmKeywordSortById",method = RequestMethod.POST)
     public DmKeywordSort getDmKeywordSortById(@RequestParam("id") Long id)throws Exception{
        return dmKeywordSortMapper.getDmKeywordSortById(id);
     }

     @RequestMapping(value = "/getDmKeywordSortListByMap",method = RequestMethod.POST)
     public List<DmKeywordSort>	getDmKeywordSortListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmKeywordSortMapper.getDmKeywordSortListByMap(param);
     }

     @RequestMapping(value = "/getDmKeywordSortCountByMap",method = RequestMethod.POST)
     public Integer getDmKeywordSortCountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return dmKeywordSortMapper.getDmKeywordSortCountByMap(param);
     }

     @RequestMapping(value = "/qdtxAddDmKeywordSort",method = RequestMethod.POST)
     public Integer qdtxAddDmKeywordSort(@RequestBody DmKeywordSort dmKeywordSort)throws Exception{
        dmKeywordSort.setCreatedTime(new Date());
        return dmKeywordSortMapper.insertDmKeywordSort(dmKeywordSort);
     }

     @RequestMapping(value = "/qdtxModifyDmKeywordSort",method = RequestMethod.POST)
     public Integer qdtxModifyDmKeywordSort(@RequestBody DmKeywordSort dmKeywordSort)throws Exception{
        dmKeywordSort.setUpdatedTime(new Date());
        return dmKeywordSortMapper.updateDmKeywordSort(dmKeywordSort);
     }
}
