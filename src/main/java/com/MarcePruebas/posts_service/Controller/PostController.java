package com.MarcePruebas.posts_service.Controller;


import com.MarcePruebas.posts_service.Model.Posts;
import com.MarcePruebas.posts_service.Service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {


    @Autowired
    private IPostService postServ;


    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/{user_id}")
    public List<Posts> getPostsByUserId(@PathVariable Long user_id){
        System.out.println("------ este es el puerto...:"+serverPort);

        return postServ.getPostByUser(user_id);
    }
}
