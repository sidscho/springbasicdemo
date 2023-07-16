package com.example.newsp;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

//autowired object can't directly
// be used in main because spring manages the objects and if you use new() to create object and
// then access autowired instance inside it, it would be invalid as spring
// has no idead about that new() object so no autowiring can be performed
@SpringBootApplication
public class NewspApplication {

@Autowired
     private Vehicle t1,t2;
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(NewspApplication.class, args);   //Creates Spring Bean, initializes etc is done here
        NewspApplication m = context.getBean(NewspApplication.class);
        m.t1.display();
        m.t2.display();
    }
//@PostConstruct annotation can be used to call a method just before finishing the SpringApplication.run() call

}


