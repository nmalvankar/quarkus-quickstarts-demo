package org.acme.getting.started;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greeting(String name) {
        //Comment for testing git commit
        return "hello " + name;
    }

}
