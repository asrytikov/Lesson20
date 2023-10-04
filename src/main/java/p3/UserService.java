package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //@Autowired
    private final CommentRepository commentRepository;

    public UserService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository(){
        return commentRepository;
    }

}
