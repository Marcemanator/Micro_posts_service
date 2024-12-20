package com.MarcePruebas.posts_service.Service;

import com.MarcePruebas.posts_service.Model.Posts;
import com.MarcePruebas.posts_service.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements IPostService {

    @Autowired
    private PostRepository PostRepo;


    @Override
    public List<Posts> getPostByUser(Long user_id) {
        return PostRepo.findPostByUserId(user_id);
    }
}
