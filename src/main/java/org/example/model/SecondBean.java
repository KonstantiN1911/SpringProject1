package org.example.model;
import org.springframework.stereotype.Component;

@Component
public class SecondBean {

    public SecondBean(PrototypeBean prototypeBean){
        System.out.println("Second bean created!");
        System.out.println("Prototype bean second " + prototypeBean.toString());
    }
}
