package com.springboot1.demo.xiangmubiao.service;

import com.springboot1.demo.xiangmubiao.dao.XiangmubiaoDao;
import com.springboot1.demo.xiangmubiao.entity.XiangmubiaoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class XiangmubiaoServiceImpl implements XiangmubiaoService{
    @Autowired
    XiangmubiaoDao xiangmubiaoDao;

    @Override
    public List<XiangmubiaoEntity> getAll(Map map) {
        return xiangmubiaoDao.getAll(map);
    }

    @Override
    public void delByXiangmuid(Integer xiangmuid) {
        xiangmubiaoDao.delByXiangmuid(xiangmuid);
    }

    @Override
    public void save(XiangmubiaoEntity xiangmubiaoEntity) {
        xiangmubiaoDao.save(xiangmubiaoEntity);
    }

    @Override
    public XiangmubiaoEntity getXiangmubiaoByXiangmuid(Integer xiangmuid) {
        return xiangmubiaoDao.getXiangmubiaoByXiangmuid(xiangmuid);
    }

    @Override
    public void updateXiangmubiaoByXiangmuid(XiangmubiaoEntity xiangmubiaoEntity) {
        xiangmubiaoDao.updateXiangmubiaoByXiangmuid(xiangmubiaoEntity);
    }


}
