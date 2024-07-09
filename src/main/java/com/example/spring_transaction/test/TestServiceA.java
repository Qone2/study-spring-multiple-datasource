package com.example.spring_transaction.test;

import com.example.spring_transaction.user.entity.User;
import com.example.spring_transaction.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TestServiceA {

    private final UserMapper userMapper;

    @Transactional("transactionManager1")
    public void createUser() {
        User user = User.builder()
                .name("Test User")
                .build();
        userMapper.insert(user);
    }
}
