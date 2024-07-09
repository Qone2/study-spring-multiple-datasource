package com.example.spring_transaction.food.mapper;

import com.example.spring_transaction.food.entity.Food;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FoodMapper {
    int insert(@Param("food") Food food);
}
