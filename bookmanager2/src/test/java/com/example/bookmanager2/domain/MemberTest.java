package com.example.bookmanager2.domain;

import org.junit.jupiter.api.Test;

class MemberTest {

    @Test
    void test(){
        Member member = new Member();
        member.setEmail("aaa@aaa.com");
        member.setName("aaa");

        System.out.println(">>>>"+ member);

    }

}