package com.krm.BlogApplication.Service;

import com.krm.BlogApplication.Model.Post;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public  interface PostService  {


    public Post savePost(Post post);
    public List<Post> getAllPost();
    public Optional<Post> getPostById(Long id);


}
