package com.example.spring_transaction;

import com.example.spring_transaction.test.TestServiceC;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

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
        assertThrows(RuntimeException.class, () -> testServiceC.createDataWithException());
//        testServiceC.createDataWithException();
    }

    @Test
    void createDataWithException2() {
        assertThrows(RuntimeException.class, () -> testServiceC.createDataWithException2());
    }

    @Test
    void createDataWithException3() {
        assertThrows(RuntimeException.class, () -> testServiceC.createDataWithException3());
    }

}