package com.javarush.task.task37.task3709.connectors;

/*public class SimpleConnector implements Connector {
    private String resourceString;

    public SimpleConnector(String resourceString) {
        this.resourceString = resourceString;
    }

    @Override
    public void connect() {
        System.out.println("Successfully connected to " + resourceString);
    }
}*/

import com.javarush.task.task37.task3709.security.SecurityChecker;

public class SecurityProxyConnector implements Connector {
    private SimpleConnector connector;
    private SecurityChecker checker;

    public SecurityProxyConnector(String resourceString) {
        this.connector = new SimpleConnector(resourceString);
    }

    @Override
    public void connect() {
        if (checker.performSecurityCheck()) connector.connect();
    }
}
