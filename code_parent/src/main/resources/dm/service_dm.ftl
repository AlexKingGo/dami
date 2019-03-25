package cn.dm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.dm.mapper.${table.className}Mapper;
import cn.dm.pojo.${table.className};

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
public class Rest${table.className}Service {

     @Autowired
     private ${table.className}Mapper ${lowerClassName}Mapper;

     @RequestMapping(value = "/get${table.className}ById",method = RequestMethod.POST)
     public ${table.className} get${table.className}ById(@RequestParam("id") Long id)throws Exception{
        return ${lowerClassName}Mapper.get${table.className}ById(id);
     }

     @RequestMapping(value = "/get${table.className}ListByMap",method = RequestMethod.POST)
     public List<${table.className}>	get${table.className}ListByMap(@RequestParam Map<String,Object> param)throws Exception{
        return ${lowerClassName}Mapper.get${table.className}ListByMap(param);
     }

     @RequestMapping(value = "/get${table.className}CountByMap",method = RequestMethod.POST)
     public Integer get${table.className}CountByMap(@RequestParam Map<String,Object> param)throws Exception{
        return ${lowerClassName}Mapper.get${table.className}CountByMap(param);
     }

     @RequestMapping(value = "/qdtxAdd${table.className}",method = RequestMethod.POST)
     public Integer qdtxAdd${table.className}(@RequestBody ${table.className} ${lowerClassName})throws Exception{
        ${lowerClassName}.setCreatedTime(new Date());
        return ${lowerClassName}Mapper.insert${table.className}(${lowerClassName});
     }

     @RequestMapping(value = "/qdtxModify${table.className}",method = RequestMethod.POST)
     public Integer qdtxModify${table.className}(@RequestBody ${table.className} ${lowerClassName})throws Exception{
        ${lowerClassName}.setUpdatedTime(new Date());
        return ${lowerClassName}Mapper.update${table.className}(${lowerClassName});
     }
}
