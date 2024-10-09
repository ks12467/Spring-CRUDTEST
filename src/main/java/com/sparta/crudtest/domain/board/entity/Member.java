package com.sparta.crudtest.domain.board.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Member extends TimeStamped{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String email;
    private String country;

    public Member(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }

    public void update(String name, String email, String country) {
        this.name = name;
        this.email = email;
        this.country = country;
    }
}
