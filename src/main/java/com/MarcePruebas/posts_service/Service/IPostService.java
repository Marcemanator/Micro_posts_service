package com.MarcePruebas.posts_service.Service;

import com.MarcePruebas.posts_service.Model.Posts;

import java.util.List;

public interface IPostService {


    public List<Posts> getPostByUser(Long userId);
}


