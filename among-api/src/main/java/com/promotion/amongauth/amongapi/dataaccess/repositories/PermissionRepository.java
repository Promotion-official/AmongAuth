package com.promotion.amongauth.amongapi.dataaccess.repositories;

import com.promotion.amongauth.amongapi.dataaccess.entities.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Integer> {
}
