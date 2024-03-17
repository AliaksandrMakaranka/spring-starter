package com.skynet.spring;

import com.skynet.spring.database.pool.ConnectionPoll;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        var connectionPoll = context.getBean("poll2", ConnectionPoll.class);
        System.out.println("ConnectionPoll: ==========> " +  connectionPoll);
    }
}
