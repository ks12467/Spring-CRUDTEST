package com.sparta.crudtest.domain.board.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MemberSaveResponseDto {

    private final Long id;
    private final String name;
    private final String email;
    private final String country;
    private final LocalDateTime createdAt;

    public MemberSaveResponseDto(Long id, String name, String email, String country, LocalDateTime createdAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.country = country;
        this.createdAt = createdAt;
    }
}
