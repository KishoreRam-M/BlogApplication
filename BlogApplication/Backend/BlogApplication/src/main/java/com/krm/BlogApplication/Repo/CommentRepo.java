package com.krm.BlogApplication.Repo;

import com.krm.BlogApplication.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface CommentRepo extends JpaRepository<Comment,Long> {
}
