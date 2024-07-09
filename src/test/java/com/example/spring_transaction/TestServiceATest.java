package com.example.spring_transaction;

import com.example.spring_transaction.test.TestServiceA;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestServiceATest {

    @Autowired
    private TestServiceA testServiceA;

    @Test
    void createUser() {
        testServiceA.createUser();
    }
}