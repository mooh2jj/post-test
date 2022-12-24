package com.example.posttest.controller;

import com.example.posttest.dto.Post2Response;
import com.example.posttest.entity.Post2;
import com.example.posttest.service.Post2Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class PostController {

    final private Post2Service post2Service;

    @GetMapping("/post2")
    public List<Post2Response> getAll() {

        List<Post2Response> responseList = post2Service.getAll();
        return responseList;
    }

    @GetMapping("/post2/{post2Id}")
    public Post2 getById(@PathVariable("post2Id") Long post2Id) {
        Post2 post2= post2Service.getById(post2Id);

        return post2;
    }

}
