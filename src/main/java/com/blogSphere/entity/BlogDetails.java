package com.blogSphere.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "blog_details")
public class BlogDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int    blogId;
    private String blogTitle;
    private String blogContent;
    private String blogAuthor;
    private String blogCategory;
}
