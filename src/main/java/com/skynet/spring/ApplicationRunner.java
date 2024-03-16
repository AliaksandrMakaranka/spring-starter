package com.skynet.spring;

import com.skynet.spring.database.repository.CompanyRepository;
import com.skynet.spring.database.repository.UserRepository;
import com.skynet.spring.database.pool.ConnectionPoll;
import com.skynet.spring.ioc.Container;
import com.skynet.spring.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {
        var container = new Container();

//        var connectionPoll = new ConnectionPoll();
//        var userRepository = new UserRepository(connectionPoll);
//        var companyRepository = new CompanyRepository(connectionPoll);
//        var userService = new UserService(userRepository, companyRepository);
//
//        var connectionPoll = container.get(ConnectionPoll.class);
//        var userRepository = container.get(UserRepository.class);
//        var companyRepository = container.get(CompanyRepository.class);

        var userService = container.get(UserService.class);
    }
}
