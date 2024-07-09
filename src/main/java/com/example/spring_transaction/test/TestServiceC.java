package com.example.spring_transaction.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TestServiceC {

    private final TestServiceA testServiceA;
    private final TestServiceB testServiceB;

    @Transactional
    public void createData() {
        testServiceA.createUser();
        testServiceB.createFood();
    }

    @Transactional
    public void createDataWithException() {
        testServiceA.createUser();
        testServiceB.createFood();
        throw new RuntimeException("Exception occurred");
    }

    @Transactional
    public void createDataWithException2() {
        testServiceA.createUser();
        testServiceB.createFoodWithException();
    }

    @Transactional("chainedTransactionManager")
    public void createDataWithException3() {
        testServiceA.createUser();
        testServiceB.createFood();
        throw new RuntimeException("Exception occurred");
    }
}
