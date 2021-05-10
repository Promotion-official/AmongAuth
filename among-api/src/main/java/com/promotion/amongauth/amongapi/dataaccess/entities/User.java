package com.promotion.amongauth.amongapi.dataaccess.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(length = 50)
    private String email;
    @Column(length = 20)
    private String name;
    @Column(length = 50)
    private String password;
    private int grade;
    @Column(name = "class")
    private int clazz;
    private int generation;
    private int number;
}
