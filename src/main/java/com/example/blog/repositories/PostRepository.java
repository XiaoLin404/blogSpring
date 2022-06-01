package com.example.blog.repositories;

import com.example.blog.entities.Comment;
import com.example.blog.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,Long>{

    List<Post> findByCreatorId(Long id);

}
