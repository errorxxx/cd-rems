package com.cd.rems.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cd.rems.api.CarparkApi;
import com.cd.rems.entity.TCarpark;
import com.cd.rems.model.CarparkVo;
import com.cd.rems.utils.RetCode;
import com.cd.rems.utils.RetResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liufuqiang
 * @description 停车场信息controller
 * @date 2019/11/29 16:07
 */
@RestController
@RequestMapping("/carpark")
public class CarparkController {
    @Reference
    CarparkApi carparkApi;

    /**
     * 后台停车场基本信息首页分页显示
     * @param carparkVo
     * @param currentPage
     * @param pageSize
     * @return
     */
    @RequestMapping("/getAllCarparkByPage")
    public RetResult getAllCarparkByPage(
            CarparkVo carparkVo,
            @RequestParam(value="currentPage")int currentPage,
            @RequestParam(value="pageSize")int pageSize) {
        int currentPageIndex = (currentPage-1)*pageSize;
        int total = 0;
        List<CarparkVo>  carparkVos = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        if((carparkVo.getCarparkname() == null || carparkVo.getCarparkname() == "") &&
                carparkVo.getCarparkrank() == null  &&
                (carparkVo.getCarparkaddress() == null || carparkVo.getCarparkaddress() == "") &&
                (carparkVo.getMinDate() == null || carparkVo.getMinDate() == "") &&
                (carparkVo.getMaxDate() == null ||  carparkVo.getMaxDate() == "")){//没有查询条件
            total = carparkApi.selectCountAll();
            carparkVos = carparkApi.selectAllByPage(currentPageIndex,pageSize);
            map.put("list",carparkVos);
            map.put("total",total);
            return new RetResult(RetCode.SUCCESS.getCode(),"success",map);//成功
        }else{//有查询条件
            if(carparkVo.getCarparkrank() == null ){
                carparkVo.setCarparkrank(-1);
            }
            if(carparkVo.getMinDate() == null || carparkVo.getMinDate() == ""){
                carparkVo.setMinDate("1900-01-01");
                carparkVo.setMaxDate("2999-01-01");
            }
            total = carparkApi.selectCountAllByCondition(carparkVo);
            carparkVos = carparkApi.selectAllByConditionAndPage(carparkVo,currentPageIndex,pageSize);
            map.put("list",carparkVos);
            map.put("total",total);
            return new RetResult(RetCode.SUCCESS.getCode(),"success",map);//成功
        }
    }
}
