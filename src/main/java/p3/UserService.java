package p3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private CommentRepository commentRepository;

    /*public UserService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }*/

    public CommentRepository getCommentRepository(){
        return commentRepository;
    }

}
