package com.sparta.crudtest.domain.board.repository;


import com.sparta.crudtest.domain.board.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
