package com.promotion.amongauth.amongapi.dataaccess.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "developer")
public class Developer {
    @Id
    private int id;
    @ManyToOne
    private User user;
    @ManyToOne
    @JoinColumn(name = "authorize_key")
    private AuthorizeKey authorizeKey;
}
