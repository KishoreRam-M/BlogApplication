package com.krm.BlogApplication.Service;

import com.krm.BlogApplication.Model.Post;
import com.krm.BlogApplication.Repo.PostRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepo repo;

    @Transactional

    public Post savePost(Post post) {
        post.setDate(new Date());
        post.setLikeCount(0);
        return repo.save(post);
    }

    public List<Post> getAllPost() {
        return repo.findAll();
    }

    public Optional<Post> getPostById(Long id) {
        return repo.findById(id);
    }
    public List<Post> searchByName(String name)
    {
        return repo.findAllByNameContaining(name);
    }
}
