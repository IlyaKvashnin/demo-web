package com.example.demoweb;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        return Arrays.asList(
                new Post("Пост первый"),
                new Post("Пост второй"),
                new Post("Пост третий")
        );
    }
}
