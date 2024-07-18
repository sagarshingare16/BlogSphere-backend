package com.blogSphere.restController;

import com.blogSphere.entity.BlogDetails;
import com.blogSphere.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/blogs")
public class BlogRestController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/all-blogs")
    public ResponseEntity<List<BlogDetails>> getAllBlogs(){
        List<BlogDetails> blogDetailsList = blogService.getAllBlogs();
        return ResponseEntity.ok(blogDetailsList);
    }

    @GetMapping("/get-blogById/{blogId}")
    public ResponseEntity<BlogDetails> getBlogById(@PathVariable int blogId){
        return new ResponseEntity<>(blogService.getBlogById(blogId), HttpStatus.OK);
    }

}
