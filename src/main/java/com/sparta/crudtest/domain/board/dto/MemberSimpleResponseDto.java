package com.sparta.crudtest.domain.board.dto;

import lombok.Getter;

@Getter
public class MemberSimpleResponseDto {

    private final String name;
    private final String email;

    public MemberSimpleResponseDto(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
