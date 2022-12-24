package com.example.posttest.service;

import com.example.posttest.dto.Post2Response;
import com.example.posttest.entity.Post2;
import com.example.posttest.repository.Post2Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class Post2ServiceImpl implements Post2Service{

    final private Post2Repository post2Repository;

    @Transactional(readOnly = true)
    @Override
    public List<Post2Response> getAll() {
//        List<Post2> post2List = post2Repository.findAll();
        List<Post2Response> post2Responses = post2Repository.findAll().stream()
                .map(Post2Response::toDto)
                .collect(Collectors.toList());

        return post2Responses;
    }

    @Transactional(readOnly = true)
    @Override
    public Post2 getById(Long post2Id) {

        Post2 post2 = post2Repository.findById(post2Id).orElseThrow();

        return post2;
    }
}
