package com.example.spring.SocialMedia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    List<Post> getAllAccounts() {
        return postRepository.findAll();
    }

    void addAccount(Post post) {
        postRepository.save(post);
    }

    void deleteAccount(String ID) {
        postRepository.deleteById(ID);
    }
}
