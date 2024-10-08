package com.sparta.crudtest.domain.board.repository;


import com.sparta.crudtest.domain.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
