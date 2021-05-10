package com.promotion.amongauth.amongapi.dataaccess.repositories;

import com.promotion.amongauth.amongapi.dataaccess.entities.AuthorizeKey;
import com.promotion.amongauth.amongapi.dataaccess.entities.Developer;
import com.promotion.amongauth.amongapi.dataaccess.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Integer> {
    Developer findByAuthorizeKey(AuthorizeKey authorizeKey);
    Developer findByUser(User user);
}
