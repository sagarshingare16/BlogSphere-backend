package com.blogSphere.service;

import com.blogSphere.entity.BlogDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BlogService {
    List<BlogDetails> getAllBlogs();
    BlogDetails getBlogById(int blogId);
}
