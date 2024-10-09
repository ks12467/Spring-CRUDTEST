package com.sparta.crudtest.domain.board.dto.response;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UpdateBoardResponseDto {

    private final Long id;
    private final String title;
    private final String content;
    private final LocalDateTime modifiedAt;

    public UpdateBoardResponseDto(Long id, String title, String content, LocalDateTime modifiedAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.modifiedAt = modifiedAt;
    }
}
