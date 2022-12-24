package com.example.posttest.service;


import com.example.posttest.dto.Post2Response;
import com.example.posttest.entity.Post2;

import java.util.List;

public interface Post2Service {

    List<Post2Response> getAll();

    Post2 getById(Long post2Id);
}
