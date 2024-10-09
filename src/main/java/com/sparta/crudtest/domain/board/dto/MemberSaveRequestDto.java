package com.sparta.crudtest.domain.board.dto;

import lombok.Getter;

@Getter
public class MemberSaveRequestDto {

    private String name;
    private String email;
    private String country;
}
