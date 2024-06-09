package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String author;
  private String content;

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

}
