import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld1 = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld helloWorld2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println("HelloWorld beans are the same: " + (helloWorld1 == helloWorld2));

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println("Cat beans are the same: " + (cat1 == cat2));
    }
}