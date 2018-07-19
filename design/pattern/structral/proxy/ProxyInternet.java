package com.company.design.pattern.structral.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vishal on 09-Apr-18.
 */
public class ProxyInternet implements Internet {

    private static List<String> bannedServers;

    static {
        bannedServers = new ArrayList<>();
        bannedServers.add("danger.com");
        bannedServers.add("bolly.com");
    }

    @Override
    public void connect(String server) {
        if (bannedServers.contains(server)) {
            throw new RuntimeException("Access Denied");
        }
        System.out.println("Connected to " + server);
    }
}
