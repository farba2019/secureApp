package com.groupeisi.secureapp_spring.dao;

import com.groupeisi.secureapp_spring.entities.AccountUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<AccountUserEntity, Long> {
}