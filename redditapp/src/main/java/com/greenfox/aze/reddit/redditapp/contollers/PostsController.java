package com.greenfox.aze.reddit.redditapp.contollers;

import com.greenfox.aze.reddit.redditapp.models.*;
import com.greenfox.aze.reddit.redditapp.services.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin("*")
@RestController
public class PostsController {

    private final PostServiceImpl postService;

    @Autowired
    public PostsController(PostServiceImpl postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> listingAllPosts() {
        return postService.getAllPost();
    }

    @PostMapping("/posts")
    public List<Post> addNewPost(@RequestBody Post newPost) {
        postService.addPost(newPost);
        return postService.getAllPost();
    }

    @PutMapping("/posts/{id}/upvote")
    public List<Post> upVotePost(@PathVariable Long id) {
        postService.increaseScoreOfPost(id);
        return postService.getAllPost();
    }

    @PutMapping("/posts/{id}/downvote")
    public List<Post> downVotePost(@PathVariable Long id) {
        postService.decreaseScoreOfPost(id);
        return postService.getAllPost();
    }

    @DeleteMapping("/posts/{id}")
    public List<Post> deletePost(@PathVariable Long id) {
        postService.deletePost(id);
        return postService.getAllPost();
    }

    @PutMapping("/posts/{id}")
    public List<Post> updatePost(@PathVariable Long id, @RequestBody Post postToUpdate) {
        postService.updatePost(id, postToUpdate);
        return postService.getAllPost();
    }
}

