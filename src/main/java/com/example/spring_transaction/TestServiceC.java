package com.example.spring_transaction;

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
}
