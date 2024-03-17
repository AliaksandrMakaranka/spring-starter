package com.skynet.spring;

import com.skynet.spring.database.pool.ConnectionPoll;
import com.skynet.spring.database.repository.CompanyRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        var connectionPoll = context.getBean("p1", ConnectionPoll.class);
        System.out.println("ConnectionPoll: ==========> " +  connectionPoll);
        CompanyRepository companyRepository = context.getBean("companyRepository", CompanyRepository.class);
        System.out.println("companyRepository: =======> " + companyRepository);
    }
}
