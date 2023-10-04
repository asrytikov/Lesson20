package p1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before create");
        var service = c.getBean(CommentService.class);
        System.out.println("After create");

    }
}
