package com.promotion.amongauth.amongapi.dataaccess.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "permission")
public class Permission {
    @Id
    private int id;
    @Column(length = 20)
    private String name;
}
