package com.sparta.crudtest.domain.board.service;

import com.sparta.crudtest.domain.board.dto.request.BoardSaveRequestDto;
import com.sparta.crudtest.domain.board.dto.response.BoardSaveResponseDto;
import com.sparta.crudtest.domain.board.dto.response.SimpleBoardResponseDto;
import com.sparta.crudtest.domain.board.entity.Board;
import com.sparta.crudtest.domain.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public BoardSaveResponseDto saveBoard(BoardSaveRequestDto boardSaveRequestDto) {
        Board newBoard = new Board(boardSaveRequestDto.getTitle(), boardSaveRequestDto.getContent());
        Board savedBoard = boardRepository.save(newBoard);
        BoardSaveResponseDto dto = new BoardSaveResponseDto(savedBoard.getId(), savedBoard.getTitle(), savedBoard.getContent());

        return dto;
    }

    public List<SimpleBoardResponseDto> simpleBoard() {

        List<Board> boardList = boardRepository.findAll();

        List<SimpleBoardResponseDto> dtoList = new ArrayList<>();

        for (Board board : boardList) {
            dtoList.add(new SimpleBoardResponseDto(board.getTitle(), board.getContent()));
        }
        return dtoList;
    }
}
