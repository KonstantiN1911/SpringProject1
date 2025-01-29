package org.example.model;
import org.springframework.stereotype.Component;

@Component
public class FirstBean {
    private FirstBean firstBean;

    public FirstBean(PrototypeBean prototypeBean){
        System.out.println("First bean created!");
        System.out.println("Prototype bean first " + prototypeBean.toString());
    }
    public void setFirstBean(FirstBean firstBean){
        this.firstBean = firstBean;
    }
}

