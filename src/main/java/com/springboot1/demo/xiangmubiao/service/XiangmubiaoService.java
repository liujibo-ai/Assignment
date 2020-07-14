package com.springboot1.demo.xiangmubiao.service;

import com.springboot1.demo.xiangmubiao.entity.XiangmubiaoEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface XiangmubiaoService {
    List<XiangmubiaoEntity> getAll(Map map);

    void delByXiangmuid(Integer xiangmuid);

    public void save(XiangmubiaoEntity xiangmubiaoEntity);
    public XiangmubiaoEntity getXiangmubiaoByXiangmuid(Integer xiangmuid);
    public void updateXiangmubiaoByXiangmuid(XiangmubiaoEntity xiangmubiaoEntity);
}
