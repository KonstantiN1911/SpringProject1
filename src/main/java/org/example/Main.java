package org.example;

import org.example.model.FirstBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
// Загружаем контекст из XML-файла
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

// Получаем бин из контекста
        FirstBean firstBean = (FirstBean) context.getBean("firstBean");

    }
}

