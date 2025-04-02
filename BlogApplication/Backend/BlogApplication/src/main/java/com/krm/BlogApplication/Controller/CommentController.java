package com.krm.BlogApplication.Controller;

import com.krm.BlogApplication.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
@CrossOrigin
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping ("/comment/create")
    public ResponseEntity<?> createComment(@RequestParam Long id, @RequestParam String postby, @RequestParam String content) {
        try {
            return ResponseEntity.ok(commentService.createComment(id, postby, content));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
