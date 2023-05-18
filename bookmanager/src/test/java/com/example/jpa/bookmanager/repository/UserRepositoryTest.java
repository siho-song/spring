package com.example.jpa.bookmanager.repository;

import com.example.jpa.bookmanager.domain.Gender;
import com.example.jpa.bookmanager.domain.User;
import com.example.jpa.bookmanager.domain.UserHistory;
import jakarta.transaction.Transactional;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;


@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserHistoryRepository userHistoryRepository;


    @Test
    void crud(){
//        User user = userRepository.getOne(1L); //lazy fetch
//        User user = userRepository.findById(1L).orElse(null); //eager fetch

//        userRepository.save(new User("new martin","newmartin@fastcanpus.com"));
//        userRepository.flush();
//        userRepository.saveAndFlush(new User("new martin","newmartin@fastcanpus.com"));
//        long count = userRepository.count();
//        System.out.println(count);
//        boolean exists = userRepository.existsById(1L);
//

//        DELETE

//        userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));
//        userRepository.deleteById(1L);
//        userRepository.deleteAll();
//        userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(1L,3L)));
//        userRepository.deleteInBatch(userRepository.findAllById(Lists.newArrayList(1L,3L)));
//        userRepository.deleteAllInBatch();
//
//        userRepository.findAll().forEach(System.out::println);

//zero-based index
////size 만큼 page는 elements를 가짐
//        Page<User> users = userRepository.findAll(PageRequest.of(1,3));
//
//        System.out.println("page: "+ users);
//        System.out.println("totalElements: "+users.getTotalElements());
//        System.out.println("totalPages: "+users.getTotalPages());
//        System.out.println("numberOfElements: "+users.getNumberOfElements());
//        System.out.println("sort: "+users.getSort());
//        System.out.println("size: "+ users.getSize());
//
//        users.getContent().forEach(System.out::println);

//        UserRepository.save(new User());
//        System.out.println(">>>"+ UserRepository.findAll());
//        System.out.println(user);

//        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
//                .withIgnorePaths("name")
//                .withMatcher("email",endsWith());
//
//        Example<User> example = Example.of(new User("ma","fastcampus.com"),exampleMatcher);
//        userRepository.findAll(example).forEach(System.out::println);


        userRepository.save(new User("david","david@fastcampus.com"));
        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user.setEmail("martin-updated@fastcampus.com");
        userRepository.save(user);

    }

    @Test
    void select(){
//        System.out.println(userRepository.findByName("martin"));
//        System.out.println(userRepository.findByName("dennis"));
//        System.out.println("findByEmail : "+userRepository.findByEmail("martin@fastcampus.com"));
//        System.out.println("getByEmail : "+userRepository.getByEmail("martin@fastcampus.com"));
//        System.out.println("readByEmail : "+userRepository.readByEmail("martin@fastcampus.com"));
//        System.out.println("queryByEmail : "+userRepository.queryByEmail("martin@fastcampus.com"));
//        System.out.println("searchByEmail : "+userRepository.searchByEmail("martin@fastcampus.com"));
//        System.out.println("streamByEmail : "+userRepository.streamByEmail("martin@fastcampus.com"));
//        System.out.println("findUserByEmail : "+userRepository.findUserByEmail("martin@fastcampus.com"));
//
//        System.out.println("findSomethingByEmail : "+userRepository.findSomethingByEmail("martin@fastcampus.com"));
//
//        System.out.println("findFisrt1ByName : "+userRepository.findFirst1ByName("martin"));
//        System.out.println("findTop1ByName : "+userRepository.findTop1ByName("martin"));
//
//        System.out.println("findFisrt2ByName : "+userRepository.findFirst2ByName("martin"));
//        System.out.println("findTop2ByName : "+userRepository.findTop2ByName("martin"));

//        System.out.println("findByEmailAndName : "+userRepository.findByEmailAndName("martin@fastcampus.com","dennis"));
//        System.out.println("findByEmailOrName : "+userRepository.findByEmailOrName("martin@fastcampus.com","dennis"));
//
//        System.out.println("findByCreatedAtAfter : "+userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1L)));
//        System.out.println("findByCreatedAtBefore : "+userRepository.findByCreatedAtAfter(LocalDateTime.now()));
//        System.out.println("findByIdAfter: "+userRepository.findByIdAfter(1L));

//        System.out.println("findByCreatedAtGreaterThan: "+userRepository.findByCreatedAtGreaterThan(LocalDateTime.now().minusDays(1L)));
//        System.out.println("findByCreatedAtGreaterThanEqual: "+userRepository.findByCreatedAtGreaterThanEqual(LocalDateTime.now().minusDays(1L)));
//
//        System.out.println("findByCreatedAtBetween: "+userRepository.findByCreatedAtBetween(LocalDateTime.now().minusDays(1L),LocalDateTime.now().plusDays(1L)));
//        System.out.println("findByIdBetween: "+userRepository.findByIdBetween(1L,3L)); //1이상 3이하
//        System.out.println("findByIdGreaterThanEqualAndIdLessThanEqual: "+userRepository.findByIdGreaterThanEqualAndIdLessThanEqual(1L,3L)); //1이상 3이하
//
//
//
//        System.out.println("findByIdIsNotNull: "+userRepository.findByIdIsNotNull());
////        System.out.println("findByAddressIsNotEmpty: "+userRepository.findByAddressIsNotEmpty());
//
//        System.out.println("findByNameIn: "+userRepository.findByNameIn(Lists.newArrayList("martin","dennis")));
//
        System.out.println("findByNameStartingWith: "+userRepository.findByNameStartingWith("mar"));
        System.out.println("findByNameEndingWith: "+userRepository.findByNameEndingWith("tin"));
        System.out.println("findByNameContains: "+userRepository.findByNameContains("art"));


        System.out.println("findByNameLike: "+userRepository.findByNameLike("%art%")); //양방향 탐색 --> contains와 동일한 로직
//        System.out.println("findByNameLike: "+userRepository.findByNameLike("%tin"));
//        System.out.println("findByNameLike: "+userRepository.findByNameLike("mar%"));



    }

    @Test
    void pagingAndSortingTest(){
        System.out.println("findTop1ByName : " + userRepository.findTop1ByName("martin"));
//        System.out.println("findLast1ByName : " + userRepository.findLast1ByName("martin")); //        last keyword 무시되는 것을 알 수 있다. ==> findLast1ByName = findByName
        System.out.println("findTop1ByNameOrderByIdDesc : " + userRepository.findTop1ByNameOrderByIdDesc("martin"));
        System.out.println("findFirstByNameOrderByIdDescEmailAsc : " + userRepository.findFirstByNameOrderByIdDescEmailAsc("martin"));
        System.out.println("findFirstByNameWithSortParams : " + userRepository.findFirstByName("martin", Sort.by(Sort.Order.desc("id"), Sort.Order.asc("email"))));
        System.out.println("findByNameWithPaging : " + userRepository.findByName("martin", PageRequest.of(1,1,Sort.by(Sort.Order.desc("id")))).getContent());

    }

    @Test
    void insertAndUpdateTest(){
        User user = new User();
        user.setName("martin");
        user.setEmail("martin2@fastcampus.com");
        userRepository.save(user);

        User user2 = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user2.setName("marrrrrtin");
        userRepository.save(user2);


    }

    @Test
    void enumTest(){
        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user.setGender(Gender.MALE);
        userRepository.save(user);

        userRepository.findAll().forEach(System.out::println);
        System.out.println(userRepository.findRawRecord().get("gender"));
    }

    @Test
    void listenerTest(){
        User user = new User();
        user.setEmail("martin2@fastcampus.com");
        user.setName("martin");
        //persist
        userRepository.save(user);

        User user2 = new User();
        userRepository.findById(1L).orElseThrow(RuntimeException::new);
        user2.setName("marrrrrrrtin");
        //update
        userRepository.save(user2);

        userRepository.deleteById(4L);
        //delete
    }

    @Test
    void prePersistTest(){
        User user = new User();
        user.setName("martin");
        user.setEmail("martin2@fastcampus.com");
//        user.setCreatedAt(LocalDateTime.now());
//        user.setUpdatedAt(LocalDateTime.now());

        userRepository.save(user);
        System.out.println(userRepository.findByEmail("martin2@fastcampus.com"));

    }

    @Test
    void preUpdateTest(){
        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);
        System.out.println("as-is : "+ user);

        user.setName("martin22");
        userRepository.save(user);
        System.out.println("to-be : "+ userRepository.findAll().get(0));

    }

    @Test
    void userHistoryTest(){
        User user = new User();
        user.setEmail("martin-new@fastcampus.com");
        user.setName("martin-new");
        userRepository.save(user);

        user.setName("martin-new-new");
        userRepository.save(user);

        userHistoryRepository.findAll().forEach(System.out::println);
    }

    @Test
    void userRelationTest(){
        User user = new User();
        user.setName("david");
        user.setEmail("david@fastcampus.com");
        user.setGender(Gender.MALE);
        userRepository.save(user);
        user.setName("daniel");
        userRepository.save(user);
        user.setEmail("daniel@fastcampus.com");
        userRepository.save(user);

        userHistoryRepository.findAll().forEach(System.out::println);
//        List<UserHistory> result = userHistoryRepository.findByUserId(
//                userRepository.findByEmail("daniel@fastcampus.com").getId()
//        );

        List<UserHistory> result = userRepository.findByEmail("daniel@fastcampus.com").getUserHistories();
        result.forEach((System.out::println));

        System.out.println("UserHistory.getUser(): "+userHistoryRepository.findAll().get(0).getUser());
    }
}