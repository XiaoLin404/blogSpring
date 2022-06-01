package com.example.blog.service;

import com.example.blog.entities.Comment;
import com.example.blog.pojos.CommentPojo;
import com.example.blog.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getComments(Long postId) {
        return commentRepository.findByPostId(postId);
    }

    public void comment(Comment comment) {
        commentRepository.save(comment);
    }

//    public boolean deletePost(Long id) {
//        commentRepository.delete(id);
//        return true;
//    }
}
