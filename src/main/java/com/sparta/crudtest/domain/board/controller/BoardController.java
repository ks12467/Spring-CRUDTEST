package com.sparta.crudtest.domain.board.controller;


import com.sparta.crudtest.domain.board.dto.request.BoardSaveRequestDto;
import com.sparta.crudtest.domain.board.dto.response.BoardSaveResponseDto;
import com.sparta.crudtest.domain.board.dto.response.SimpleBoardResponseDto;
import com.sparta.crudtest.domain.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/boards")
public class BoardController {

    private final BoardService boardService;

    @PostMapping
    public ResponseEntity<BoardSaveResponseDto> saveBoard(@RequestBody BoardSaveRequestDto boardSaveRequestDto){
    return ResponseEntity.ok(boardService.saveBoard(boardSaveRequestDto));
    }

    @GetMapping
    public ResponseEntity<List<SimpleBoardResponseDto>> simpleBoard(){
        return ResponseEntity.ok(boardService.simpleBoard());
    }
}
