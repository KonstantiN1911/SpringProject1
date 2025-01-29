package org.example.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope()
public class RequestScopeBean {

    public RequestScopeBean(){
        System.out.println("Hello from the request scope bean!");
    }

}
