package com.promotion.amongauth.amongapi.dataaccess.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "authorize_key")
public class AuthorizeKey {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long id;
    @Column(name = "auth_key", length = 100, unique = true)
    private String authKey;
    @Column(name = "creation_time") @Temporal(TemporalType.DATE)
    private Date creationTime;
    @Column(name = "expiration_time") @Temporal(TemporalType.DATE)
    private Date expirationTime;
    @ManyToOne
    private Permission permission;
}
