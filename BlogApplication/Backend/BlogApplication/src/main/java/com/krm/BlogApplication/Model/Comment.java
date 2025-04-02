package com.krm.BlogApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Comment {
    @Id
    private Long id;
    private String content;
    private Date createdAt;
    private String postBy;
    @ManyToOne
    @JoinColumn(name = "post_id",nullable = false)
    private Post post;
}
