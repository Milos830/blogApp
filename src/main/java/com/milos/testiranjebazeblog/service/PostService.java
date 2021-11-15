package com.milos.testiranjebazeblog.service;

import com.milos.testiranjebazeblog.entity.Post;
import com.milos.testiranjebazeblog.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public List<Post> listAllPosts() {

        return postRepository.findAll();
    }

    public Optional<Post> findPostById(Long id) {
        return postRepository.findById(id);
    }

    public Post savePost(Post post) {
        return postRepository.saveAndFlush(post);
    }

    public void deletePost(Post post) {
        postRepository.delete(post);
    }
}


//    public List<Post> getAllPosts() {
//        List<Post> postList = postRepository.findAll();
//        List<Post> activePostList = new ArrayList<>();
//
//        for (Post post :postList) {
//            if(post.getIsActive()){
//                activePostList.add(post);
//            }
//        }
//        return activePostList;
//    }
