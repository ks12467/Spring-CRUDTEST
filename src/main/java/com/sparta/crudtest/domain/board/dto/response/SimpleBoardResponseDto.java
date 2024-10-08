package com.sparta.crudtest.domain.board.dto.response;

import lombok.Getter;

@Getter
public class SimpleBoardResponseDto {

    private final String title;
    private final String content;

    public SimpleBoardResponseDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
