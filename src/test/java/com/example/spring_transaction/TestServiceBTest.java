package com.example.spring_transaction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestServiceBTest {

    @Autowired
    private TestServiceB testServiceB;

    @Test
    void createFood() {
        testServiceB.createFood();
    }
}