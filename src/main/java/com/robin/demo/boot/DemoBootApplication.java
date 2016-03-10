package com.robin.demo.boot;

/**
 * Created by Administrator on 2016/3/10.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Arrays;

@SpringBootApplication
public class DemoBootApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DemoBootApplication.class, args);

        System.out.println("通过SpringBoot来注入依赖:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

}
