package com.krm.BlogApplication.Repo;

import com.krm.BlogApplication.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public  interface CommentRepo extends JpaRepository<Comment,Long> {
    List<Comment>findByPostId(Long postId);
}
