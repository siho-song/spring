package com.example.bookmanager2.repository;

import com.example.bookmanager2.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;


    @Test
    void crud(){
        memberRepository.save(new Member());
        memberRepository.findAll().forEach(s-> System.out.println(s));
    }

}