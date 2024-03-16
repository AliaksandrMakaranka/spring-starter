package com.skynet.spring.database.repository;

import com.skynet.spring.database.pool.ConnectionPoll;

public class CompanyRepository {
    private final ConnectionPoll connectionPoll;

    public CompanyRepository(ConnectionPoll connectionPoll) {
        this.connectionPoll = connectionPoll;
    }
}
