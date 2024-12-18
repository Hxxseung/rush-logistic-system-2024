package com.rush.logistic.client.hub.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class QueryDslConfig {

    private final EntityManager entityManager;

    @Bean
    public JPAQueryFactory jpaQueryFactory(){   //데이터베이스 쿼리를 작성할 수 있도록 제공,JPAQueryFactory를 Bean으로 등록
                                                //QueryDSL을 통해 안전한 쿼리를 작성할 수 있도록 제공.
        return new JPAQueryFactory(entityManager);
    }
}
