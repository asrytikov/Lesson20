package p4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var commentService = context.getBean(CommentService.class);

        commentService.sendComment(new Comment());
        commentService.sendComment(new Comment());
    }

}
