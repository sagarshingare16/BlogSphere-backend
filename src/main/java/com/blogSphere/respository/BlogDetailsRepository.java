package com.blogSphere.respository;

import com.blogSphere.entity.BlogDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogDetailsRepository extends JpaRepository<BlogDetails,Integer> {

}
