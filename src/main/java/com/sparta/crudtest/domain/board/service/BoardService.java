package com.sparta.crudtest.domain.board.service;

import com.sparta.crudtest.domain.board.dto.request.BoardSaveRequestDto;
import com.sparta.crudtest.domain.board.dto.response.BoardSaveResponseDto;
import com.sparta.crudtest.domain.board.dto.response.DetailBoardResponseDto;
import com.sparta.crudtest.domain.board.dto.response.SimpleBoardResponseDto;
import com.sparta.crudtest.domain.board.dto.response.UpdateBoardResponseDto;
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

    public DetailBoardResponseDto detailBoard(Long id) {
        Board board = boardRepository.findById(id)
                .orElseThrow(() -> new NullPointerException("해당 아이디가 존재하지 않습니다."));

        return new DetailBoardResponseDto(
                board.getId(), board.getTitle(), board.getTitle(), board.getCreateAt()
        );
    }

    public UpdateBoardResponseDto updatgeBoard(Long id) {
        Board board = boardRepository.findById(id).orElseThrow(()-> new NullPointerException("없어"));

        Board updateBoard = new Board(board.getTitle(), board.getContent());

        return new UpdateBoardResponseDto(updateBoard.getId(), updateBoard.getTitle(), updateBoard.getContent(), updateBoard.getModifiedAt());

    }

    public void deleteBoard(Long id) {
        Board board = boardRepository.findById(id).orElseThrow(() -> new NullPointerException("dㅓㅂ성"));
        boardRepository.delete(board);
    }
}
