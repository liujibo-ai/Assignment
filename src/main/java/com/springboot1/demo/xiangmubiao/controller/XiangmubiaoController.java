package com.springboot1.demo.xiangmubiao.controller;

import com.springboot1.demo.xiangmubiao.dao.XiangmubiaoDao;
import com.springboot1.demo.xiangmubiao.entity.XiangmubiaoEntity;
import com.springboot1.demo.xiangmubiao.service.XiangmubiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.List;
import java.util.Map;

import static java.lang.System.*;

@Controller
@RequestMapping("xiangmubiao")


public class XiangmubiaoController {

    @Autowired
    XiangmubiaoService xiangmubiaoService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<XiangmubiaoEntity> getAll(Map map){
        return xiangmubiaoService.getAll(map);

    }
    @RequestMapping("/delByXiangmuid")
    public String delByXiangmuid(Integer xiangmuid){
        xiangmubiaoService.delByXiangmuid(xiangmuid);
        return "redirect:/index.html";
    }

    //添加项目
    @RequestMapping("/save")
    @ResponseBody//json数据
    public String save(@RequestBody  XiangmubiaoEntity xiangmubiaoEntity){
        xiangmubiaoService.save(xiangmubiaoEntity);
        return "success";
    }

    //根据编号查询数据
    @RequestMapping("/getXiangmubiaoByXiangmuid")
    @ResponseBody
    public XiangmubiaoEntity getXiangmubiaoByXiangmuid(Integer xiangmuid){
        return xiangmubiaoService.getXiangmubiaoByXiangmuid(xiangmuid);
    }
    //根据编号修改数据
    @RequestMapping("/updateXiangmubiaoByXiangmuid")
    @ResponseBody
    public String updateXiangmubiaoByXiangmuid(@RequestBody  XiangmubiaoEntity xiangmubiaoEntity){
        xiangmubiaoService.updateXiangmubiaoByXiangmuid(xiangmubiaoEntity);
        return "success";
    }
}
