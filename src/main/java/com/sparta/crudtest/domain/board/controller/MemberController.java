package com.sparta.crudtest.domain.board.controller;

import com.sparta.crudtest.domain.board.dto.*;
import com.sparta.crudtest.domain.board.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<MemberSaveResponseDto> memberSave(@RequestBody MemberSaveRequestDto memberSaveRequestDto){
        return ResponseEntity.ok(memberService.saveMember(memberSaveRequestDto));
    }

    @GetMapping
    public ResponseEntity<List<MemberSimpleResponseDto>> simpleMember(){
        return ResponseEntity.ok(memberService.simpleMember());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemberDetailResponseDto> detailMember(@PathVariable Long id){
        return ResponseEntity.ok(memberService.detailMember(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<MemberUpdateResponseDto> updateMember(@PathVariable Long id, @RequestBody MemberUpdateRequestDto memberUpdateRequestDto){
        return ResponseEntity.ok(memberService.updateMember(id, memberUpdateRequestDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMember(@PathVariable Long id){
        return ResponseEntity.ok(memberService.deleteMember(id));
    }
}
