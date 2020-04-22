package org.lyx.dao;

import org.lyx.pojo.FoodInfo;

import java.util.List;

public interface FoodInfoDao {
    public List<FoodInfo> all();

    public int insert(FoodInfo foodInfo);

    public int update(FoodInfo foodInfo);

    public int delete(int id);

    public FoodInfo findById(int id);

    public List<FoodInfo> findByName(FoodInfo foodInfo);
}
