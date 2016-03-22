package com.robin.demo.boot;

/**
 * Created by Administrator on 2016/3/10.
 */
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Arrays;

@SpringBootApplication
public class DemoBootApplication{

    public static void main(String[] args) {
        SpringApplication.run(DemoBootApplication.class, args);
    }
}
