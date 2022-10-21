package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.model.JpaMember;
import com.example.demo.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	private final MemberRepository memberRepository;
	//추가
	public void save(JpaMember member) {
		memberRepository.save(member);
		
	}
	//전체보기
	public List<JpaMember> list() {
		return memberRepository.findAll();
	}
	//전체보기 페이징
	public Page<JpaMember> list(Pageable pageable) {
		return memberRepository.findAll(pageable);
	}
	//상세보기(Optional)
	public JpaMember detail(Long id) {
		
		return memberRepository.findById(id).get();
	}
	//삭제하기
	public void delete (Long id) {
		memberRepository.deleteById(id);
	}
	//수정하기(더티체킹)
	@Transactional
	public void update(JpaMember member) {
		JpaMember m=memberRepository.findById(member.getId()).get();
		m.setAddr(member.getAddr());
		m.setName(member.getName());
		m.setPassword(member.getPassword());
		m.setEmail(member.getEmail());
		m.setMemo(member.getMemo());
		
		
	}
}
