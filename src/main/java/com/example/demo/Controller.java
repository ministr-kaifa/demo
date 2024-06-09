package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

  private final PostRepository repository;

  public Controller(PostRepository repository) {
    this.repository = repository;
  }
  
  @GetMapping("/posts")
  public List<Post> getPosts() {
    return repository.findAll();
  }
}
