package com.krm.BlogApplication.Controller;

import com.krm.BlogApplication.Model.Comment;
import com.krm.BlogApplication.Repo.CommentRepo;
import com.krm.BlogApplication.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
@CrossOrigin
public class CommentController {
    @Autowired
    private CommentService commentService;
    @Autowired
    private CommentRepo commentRepo;

    @PostMapping ("/comment/create")
    public ResponseEntity<?> createComment(@RequestParam Long id, @RequestParam String postby, @RequestParam String content) {
        try {
            return ResponseEntity.ok(commentService.createComment(id, postby, content));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

@GetMapping("/comment/{id}")
    public ResponseEntity<?>getCommentByPostId(@PathVariable Long id)
    {
        return ResponseEntity.ok(commentRepo.findByPostId(id));
    }
}
