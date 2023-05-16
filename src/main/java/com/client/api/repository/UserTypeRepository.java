package com.client.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.client.api.model.SubscriptionType;
import com.client.api.model.User;
import com.client.api.model.UserPaymentInfo;
import com.client.api.model.UserType;

@Repository
public interface UserTypeRepository extends JpaRepository<SubscriptionType, Long>{

}
