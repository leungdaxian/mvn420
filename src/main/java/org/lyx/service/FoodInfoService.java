package org.lyx.service;

import com.github.pagehelper.PageInfo;
import org.lyx.pojo.FoodInfo;
import org.lyx.pojo.Parames;

import java.util.List;

public interface FoodInfoService {
    public List<FoodInfo> all();

    public int insert(FoodInfo foodInfo);

    public int update(FoodInfo foodInfo);

    public int delete(int id);

    public FoodInfo findById(int id);

    public PageInfo<FoodInfo> getPageInfo(Parames parames);

    public PageInfo<FoodInfo> findByName(FoodInfo foodInfo, Parames parames);
}
