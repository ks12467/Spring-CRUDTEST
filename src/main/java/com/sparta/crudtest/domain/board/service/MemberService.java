package com.sparta.crudtest.domain.board.service;

import com.sparta.crudtest.domain.board.dto.*;
import com.sparta.crudtest.domain.board.entity.Member;
import com.sparta.crudtest.domain.board.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberSaveResponseDto saveMember(MemberSaveRequestDto memberSaveRequestDto) {

        Member member = new Member(
                memberSaveRequestDto.getName(),
                memberSaveRequestDto.getEmail(),
                memberSaveRequestDto.getCountry()
        );
        Member savedMember = memberRepository.save(member);
        return new MemberSaveResponseDto(
                savedMember.getId(),
                savedMember.getName(),
                savedMember.getEmail(),
                savedMember.getCountry(),
                savedMember.getCreateAt()
        );
    }

    public List<MemberSimpleResponseDto> simpleMember() {

        List<Member> memberList = memberRepository.findAll();
        List<MemberSimpleResponseDto> dtoList = new ArrayList<>();
        for (Member member : memberList) {
            dtoList.add(new MemberSimpleResponseDto(member.getName(),member.getEmail()));
        }
        return dtoList;
    }

    public MemberDetailResponseDto detailMember(Long id) {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("해당 아이디를 찾을 수 없습니다."));

        return new MemberDetailResponseDto(
                member.getId(),
                member.getName(),
                member.getEmail(),
                member.getCountry()
        );
    }

    public MemberUpdateResponseDto updateMember(Long id, MemberUpdateRequestDto memberUpdateRequestDto) {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("해당 아이디를 찾을 수 없습니다."));

        member.update(
                memberUpdateRequestDto.getName(),
                memberUpdateRequestDto.getEmail(),
                memberUpdateRequestDto.getCountry()
        );

        return new MemberUpdateResponseDto(
                member.getId(),
                member.getName(),
                member.getEmail(),
                member.getCountry(),
                member.getModifiedAt()
        );
    }

    public Void deleteMember(Long id) {
        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("아이디를 찾을 수 없습니다."));

        memberRepository.delete(member);
        return null;
    }
}
