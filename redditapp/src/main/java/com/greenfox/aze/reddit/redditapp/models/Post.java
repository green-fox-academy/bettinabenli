package com.greenfox.aze.reddit.redditapp.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    private String title;
    private String url;
    private LocalDateTime timestamp;
    private Long score = 0L;
    private String owner;
    private int vote;


    public Post() {
        this.timestamp = LocalDateTime.now();
    }

    public Post(String title, String url) {
        this.title = title;
        this.url = url;
        this.timestamp = LocalDateTime.now();
        this.score = score;
        this.vote = vote;
    }

    public Post(String title, String url, LocalDateTime timestamp, Long score, String owner, int vote) {
        this.title = title;
        this.url = url;
        this.timestamp = LocalDateTime.now();
        this.score = score;
        this.owner = owner;
        this.vote = vote;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }
}


