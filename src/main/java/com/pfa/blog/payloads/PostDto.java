package com.pfa.blog.payloads;

import com.pfa.blog.entity.Category;
import com.pfa.blog.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {
    private Integer id;

    private String title;

    private String content;

    private String imageName;

    private Date createdAt;

    private CategoryDto category;

    private UserDto user;

}
