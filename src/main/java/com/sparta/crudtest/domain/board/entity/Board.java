package com.sparta.crudtest.domain.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Board extends TimeStamped{

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;


    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public void updateBoard(String title, String content){
        this.title = title;
        this.content = content;
    }
}
