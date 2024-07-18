package com.blogSphere.service;

import com.blogSphere.entity.BlogDetails;
import com.blogSphere.respository.BlogDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService{

    @Autowired
    private BlogDetailsRepository blogDetailsRepository;

    @Override
    public List<BlogDetails> getAllBlogs() {
        return blogDetailsRepository.findAll();
    }

    @Override
    public BlogDetails getBlogById(int blogId) {
        Optional<BlogDetails> blogDetailsOpt = blogDetailsRepository.findById(blogId);
        if(blogDetailsOpt.isPresent())
            return blogDetailsOpt.get();
        else
            throw new RuntimeException("Blog details not found.");
    }
}
