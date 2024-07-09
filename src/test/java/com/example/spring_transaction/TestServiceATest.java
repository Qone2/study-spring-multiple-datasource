package com.example.spring_transaction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestServiceATest {

    @Autowired
    private TestServiceA testServiceA;

    @Test
    void createUser() {
        testServiceA.createUser();
    }
}