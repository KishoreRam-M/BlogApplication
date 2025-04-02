package com.krm.BlogApplication.Service;

import com.krm.BlogApplication.Model.Comment;
import com.krm.BlogApplication.Model.Post;
import com.krm.BlogApplication.Repo.CommentRepo;
import com.krm.BlogApplication.Repo.PostRepo;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    private CommentRepo repo;
    @Autowired
    private PostRepo postRepo;


    public Comment createComment(Long id, String postby, String content) {
        Optional<Post> post = postRepo.findById(id);
        if (post != null) {
            Comment comment = new Comment();
            comment.setPost(post.get());
            comment.setPostBy(postby);
            comment.setContent(content);
            comment.setId(id);
            return repo.save(comment);
        }
        else {
            throw new EntityNotFoundException("Post is Not Found");
        }
    }


}
