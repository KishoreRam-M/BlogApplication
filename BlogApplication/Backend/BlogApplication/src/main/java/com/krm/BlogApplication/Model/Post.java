package com.krm.BlogApplication.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Post {
    @Id
    private Long id;
    private String name;
    @Column(length = 50000)
    private  String content;
    private String img;
    private Date date;
    private  int likeCount;
    private  int veiwCount;
    private List<String> tags;



}
