package com.promotion.amongauth.amongapi.dataaccess.repositories;

import com.promotion.amongauth.amongapi.dataaccess.entities.AuthorizeKey;
import com.promotion.amongauth.amongapi.dataaccess.entities.Permission;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorizeKeyRepository extends JpaRepository<AuthorizeKey, Long> {
    AuthorizeKey findByAuthKey(String authKey);
    Page<AuthorizeKey> findByPermission(Permission permission, Pageable pageable);

    int countByPermission(Permission permission);
}
