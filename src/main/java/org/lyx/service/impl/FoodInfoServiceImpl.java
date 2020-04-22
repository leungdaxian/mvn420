package org.lyx.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.lyx.dao.FoodInfoDao;
import org.lyx.pojo.FoodInfo;
import org.lyx.pojo.Parames;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class FoodInfoServiceImpl implements org.lyx.service.FoodInfoService {

    @Resource
    private FoodInfoDao foodInfoDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<FoodInfo> all() {
        return foodInfoDao.all();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int insert(FoodInfo foodInfo) {
        return foodInfoDao.insert(foodInfo);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int update(FoodInfo foodInfo) {
        return foodInfoDao.update(foodInfo);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int delete(int id) {
        return foodInfoDao.delete(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public FoodInfo findById(int id) {
        return foodInfoDao.findById(id);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public PageInfo<FoodInfo> getPageInfo(Parames parames) {
        PageHelper.startPage(parames.getPageCurrent(),parames.getPageSize());

        List<FoodInfo> list=foodInfoDao.all();

        PageInfo<FoodInfo> pageInfo=new PageInfo<>(list);

        return pageInfo;
    }

    @Override
    public PageInfo<FoodInfo> findByName(FoodInfo foodInfo, Parames parames) {

        PageHelper.startPage(parames.getPageCurrent(),parames.getPageSize());

        List<FoodInfo> list=foodInfoDao.findByName(foodInfo);

        PageInfo<FoodInfo> pageInfo=new PageInfo<>(list);

        return pageInfo;
    }
}
