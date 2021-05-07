package com.promotion.amongauth.amongapi.dataaccess.repositories;

import com.promotion.amongauth.amongapi.dataaccess.entities.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, Integer> {
}
