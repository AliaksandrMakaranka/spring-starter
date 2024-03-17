package com.skynet.spring.database.pool;

import java.util.List;
import java.util.Map;

public class ConnectionPoll {

    private final String username;
    private final Integer pollSize;
    private final List<Object> args;
    private final Map<String, Object> properties;

    public ConnectionPoll(String username,
                          Integer pollSize,
                          List<Object> args,
                          Map<String, Object> properties) {
        this.username = username;
        this.pollSize = pollSize;
        this.args = args;
        this.properties = properties;
    }
}
