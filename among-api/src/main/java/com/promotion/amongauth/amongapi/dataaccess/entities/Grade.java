package com.promotion.amongauth.amongapi.dataaccess.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "grade")
public class Grade {
    @Id
    private int id;
    private int grade;
}
