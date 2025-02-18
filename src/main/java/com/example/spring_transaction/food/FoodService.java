package com.example.spring_transaction.food;

import com.example.spring_transaction.food.entity.Food;
import com.example.spring_transaction.food.mapper.FoodMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodMapper foodMapper;

    public void saveAndNotRollback() {

        Food food = Food.builder().name("Pizza").build();

        foodMapper.insert(food);

        throw new RuntimeException("Throwing exception");
    }

    @Transactional()
    public void saveAndCommit() {

        Food food = Food.builder().name("Pizza").build();

        foodMapper.insert(food);
    }
}
