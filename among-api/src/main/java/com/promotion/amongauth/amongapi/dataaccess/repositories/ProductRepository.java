package com.promotion.amongauth.amongapi.dataaccess.repositories;

import com.promotion.amongauth.amongapi.dataaccess.entities.AuthorizeKey;
import com.promotion.amongauth.amongapi.dataaccess.entities.Developer;
import com.promotion.amongauth.amongapi.dataaccess.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByDeveloper(Developer developer, Pageable pageable);
    Product findByName(String name);
    Product findByAuthorizeKey(AuthorizeKey authorizeKey);
}
