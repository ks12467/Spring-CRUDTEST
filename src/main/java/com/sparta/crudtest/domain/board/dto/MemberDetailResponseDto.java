package com.sparta.crudtest.domain.board.dto;

public class MemberDetailResponseDto {

    private final Long id;
    private final String name;
    private final String email;
    private final String country;

    public MemberDetailResponseDto(Long id, String name, String email, String country) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.country = country;
    }
}
