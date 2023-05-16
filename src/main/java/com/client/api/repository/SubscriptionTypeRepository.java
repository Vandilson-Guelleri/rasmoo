package com.client.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.api.model.SubscriptionType;
import com.client.api.model.User;

@Repository
public interface SubscriptionTypeRepository extends JpaRepository<SubscriptionType, Long>{

}
