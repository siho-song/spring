package com.example.bookmanager2.repository;


import com.example.bookmanager2.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
