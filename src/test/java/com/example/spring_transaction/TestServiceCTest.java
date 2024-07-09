package com.example.spring_transaction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestServiceCTest {

    @Autowired
    private TestServiceC testServiceC;

    @Test
    void createData() {
        testServiceC.createData();
    }

    @Test
    void createDataWithException() {
//        assertThrows(RuntimeException.class, () -> testServiceC.createDataWithException());
        testServiceC.createDataWithException();
    }
}