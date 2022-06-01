package com.example.blog.service;

import com.example.blog.entities.Post;
import com.example.blog.entities.User;
import com.example.blog.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public void insert(Post post) {
        postRepository.save(post);
    }

    public List<Post> findByUser(User user){
        return postRepository.findByCreatorId(user.getId());
    }


//    public boolean deletePost(Long postId){
//        Post thePost = postRepository.getOne(postId);
//        if(thePost == null)
//            return false;
//        postRepository.delete(postId);
//        return true;
//    }

    public Post getPost(Long id) {
        return postRepository.getOne(id);
    }

    public Post find(Long postId) {
        return postRepository.getOne(postId);
    }
}
