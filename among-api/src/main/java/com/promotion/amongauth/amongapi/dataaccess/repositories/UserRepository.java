package com.promotion.amongauth.amongapi.dataaccess.repositories;

import com.promotion.amongauth.amongapi.dataaccess.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
    int findByGradeAndClazzAndNumber(int grade, int clazz, int number);

    int countByGeneration(int generation);
    int countByGrade(int grade);
    int countByClazz(int clazz);
}
