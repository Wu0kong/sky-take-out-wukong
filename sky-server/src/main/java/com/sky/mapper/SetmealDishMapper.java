package com.sky.mapper;

import com.sky.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

        List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

}
