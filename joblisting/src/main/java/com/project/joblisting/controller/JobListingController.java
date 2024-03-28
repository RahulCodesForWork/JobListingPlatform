package com.project.joblisting.controller;

import com.project.joblisting.model.Post;
import com.project.joblisting.repository.PostRepository;
import com.project.joblisting.repository.impl.SearchRepoImpl;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class JobListingController {

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepoImpl srepo;

    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/allPosts")
    public List<Post> getAllPosts(){

        return repo.findAll();
    }


    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){

        return repo.save(post);
    }



    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){

        return srepo.findByText(text);
    }
}
