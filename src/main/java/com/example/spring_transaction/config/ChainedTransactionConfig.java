package com.example.spring_transaction.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.transaction.ChainedTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class ChainedTransactionConfig {

    @Bean("chainedTransactionManager")
    public PlatformTransactionManager chainedTransactionManager(
            @Qualifier("transactionManager1") PlatformTransactionManager transactionManager,
            @Qualifier("transactionManager2") PlatformTransactionManager riderTransactionManager) {
        return new ChainedTransactionManager(transactionManager, riderTransactionManager);
    }

}
