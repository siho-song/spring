package com.example.jpa.bookmanager.domain;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class UserHistory extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name="user_id", insertable = false,updatable = false)
//    private Long userId;

    private String name;

    private String email;

    @ManyToOne
    private User user;

}
