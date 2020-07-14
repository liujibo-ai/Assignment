package com.springboot1.demo.xiangmubiao.dao;

import com.springboot1.demo.xiangmubiao.entity.XiangmubiaoEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@Mapper
public interface XiangmubiaoDao {


    List<XiangmubiaoEntity> getAll(@Param("content") Map map);

    void delByXiangmuid(Integer xiangmuid);
    public void save(XiangmubiaoEntity xiangmubiaoEntity);
    public XiangmubiaoEntity getXiangmubiaoByXiangmuid(Integer xiangmuid);
    public void updateXiangmubiaoByXiangmuid(XiangmubiaoEntity xiangmubiaoEntity);

}
