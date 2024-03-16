package com.skynet.spring.database.repository;


import com.skynet.spring.database.pool.ConnectionPoll;

public class UserRepository {
    private final ConnectionPoll connectionPoll;

    public UserRepository(ConnectionPoll connectionPoll) {
        this.connectionPoll = connectionPoll;
    }
}
