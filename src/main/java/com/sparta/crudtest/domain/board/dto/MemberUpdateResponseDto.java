package com.sparta.crudtest.domain.board.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class MemberUpdateResponseDto {

    private final Long id;
    private final String name;
    private final String email;
    private final String country;
    private final LocalDateTime modifiedAt;

    public MemberUpdateResponseDto(Long id, String name, String email, String country, LocalDateTime modifiedAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.country = country;
        this.modifiedAt = modifiedAt;
    }
}
