package com.MarcePruebas.posts_service.Repository;


import com.MarcePruebas.posts_service.Model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface PostRepository  extends JpaRepository<Posts,Long> {
    @Query("SELECT p FROM Posts p WHERE p.user_id = :user_id")
    List<Posts> findPostByUserId(@Param("user_id")Long user_id);


}
