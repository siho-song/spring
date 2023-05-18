package com.example.jpa.bookmanager.domain;

import com.example.jpa.bookmanager.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;


@SpringBootTest
class UserTest {
    @Autowired
    private UserRepository UserRepository;

    @Test
    void test(){
        User user = new User();
        user.setEmail("martin@fastcampus.com");
        user.setName("martin");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

//        User user1 = new User("martin","martin@fastcampus.com",LocalDateTime.now(),LocalDateTime.now());
        User user2 = new User("martin","martin@fastcampus.com");
        User user3 = User.builder()
                .name("martin")
                .email("martin@fastcampus.com")
                .build();

        System.out.println(">>> "+ user.toString());
    }

}