package com.example.spring_transaction.test;

import com.example.spring_transaction.food.entity.Food;
import com.example.spring_transaction.food.mapper.FoodMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TestServiceB {

    private final FoodMapper foodMapper;

    @Transactional("transactionManager2")
    public void createFood() {
        Food food = Food.builder()
                .name("Test Food")
                .build();

        foodMapper.insert(food);
    }

    @Transactional("transactionManager2")
    public void createFoodWithException() {
        Food food = Food.builder()
                .name("Test Food")
                .build();

        foodMapper.insert(food);
        throw new RuntimeException("Exception occurred");
    }
}
