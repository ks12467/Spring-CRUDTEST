package com.sparta.crudtest.domain.board.dto;

import lombok.Getter;

@Getter
public class MemberUpdateRequestDto {

    private String name;
    private String email;
    private String country;
}
