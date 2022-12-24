package com.example.posttest.dto;

import com.example.posttest.entity.Post2;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Post2Response {

    private Long id;

    private String title;
    private String content;

    @Builder
    public Post2Response(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public static Post2Response toDto(Post2 post2) {
        return Post2Response.builder()
                .id(post2.getId())
                .title(post2.getTitle())
                .content(post2.getContent())
                .build();
    }
}
