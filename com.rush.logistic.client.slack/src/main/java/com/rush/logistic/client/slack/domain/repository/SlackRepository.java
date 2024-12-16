package com.rush.logistic.client.slack.domain.repository;

import com.rush.logistic.client.slack.domain.entity.SlackEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SlackRepository extends JpaRepository<SlackEntity, UUID> ,SlackRepositoryCustom{

}
