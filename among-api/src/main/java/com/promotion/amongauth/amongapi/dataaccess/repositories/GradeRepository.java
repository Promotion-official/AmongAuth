package com.promotion.amongauth.amongapi.dataaccess.repositories;

import com.promotion.amongauth.amongapi.dataaccess.entities.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GradeRepository extends JpaRepository<Grade, Integer> {
}
