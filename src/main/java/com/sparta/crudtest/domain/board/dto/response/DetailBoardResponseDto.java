package com.sparta.crudtest.domain.board.dto.response;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class DetailBoardResponseDto {

    private final Long id;
    private final String title;
    private final String content;
    private final LocalDateTime createdAt;

    public DetailBoardResponseDto(Long id, String title, String content, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
    }
}
