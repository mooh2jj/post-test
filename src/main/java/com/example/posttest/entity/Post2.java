package com.example.posttest.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "post2s")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post2_id")
    private Long id;

    private String title;
    private String content;

}
