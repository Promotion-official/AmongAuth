package com.promotion.amongauth.amongapi.dataaccess.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "product")
public class Product {
    @Id
    private long id;
    @Column(length = 20)
    private String name;
    @ManyToOne()
    private Developer developer;
    @ManyToOne()
    @JoinColumn(name = "authorize_key")
    private AuthorizeKey authorizeKey;
}
