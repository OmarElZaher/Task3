package com.example.Task_3.services;

import com.example.Task_3.models.Comment;
import com.example.Task_3.models.Post;
import com.example.Task_3.models.User;
import com.example.Task_3.repositories.PostRepository;
import com.example.Task_3.repositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;

    public PostService(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    public Post savePost(Post post) {
        return postRepository.save(post);
    }
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Optional<Post> getPostById(String id) {
        return postRepository.findById(id);
    }

    public void deletePost(String id) {
        postRepository.deleteById(id);
    }

    //Get Posts By Author ID
    public List<Post> getPostsByAuthorId(String authorId) {
        User user = userRepository.findById(authorId).orElse(null);

        if (user == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        }

        return postRepository.getPostsByAuthorId(authorId);
    }

    //Add Comment to Post
    public Post addCommentToPost(String postId, Comment newComment) {
        Post post = postRepository.findById(postId).orElse(null);

        if (post == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Post not found");
        }

        post.getComments().add(newComment);
        return postRepository.save(post);
    }

}
