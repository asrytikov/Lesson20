package p2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var cs1 = context.getBean("commentService", CommentService.class);
        var cs2 = context.getBean("commentService", CommentService.class);

        System.out.println(cs1);
        System.out.println(cs2);

        boolean b1 = cs1 == cs2;
        System.out.println(b1);
    }

}
