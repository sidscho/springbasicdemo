package com.example.newsp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


interface Vehicle{
    public void display();
}
/*Spring Important Concepts :
1. IOC / DI : IOC is instead of managing objects/dependencies by user, it is given to spring container to manage it.
DI : Dependency injection  is injecting dependencies into objects eg : @Autowired
2. AOP : Aspect object programming helps with cross cutting concerns such as logging,caching,transaction management.
 ex: instead of creating object/writing code in all classes for logs. we can create aspect that is in different file
we can mention when to call log function before any function in other classes. this helps to keep business logic seperate.
3.Spring MVC : Model is where Database model is defined, Controlled is used to get requests to server, View is for JSP pages.
4.Spring Data : is higher level abstraction where it can use hibernate or any other implementation of JPA. JPA is set of instruction
 which are used to access database. It internally uses JDBC. JPA/Hibernate is used to avoid boilerplate code.
5.Spring Security : Authentication, Authorization, User Management, Web Security,
6. Testing :
*/

//Spring uses singleton objects by default. if you need new instances each time you autowire then use @Scope("prototype")
@Component
@Scope("prototype")
class Tyre implements Vehicle{
    private int a =3;
    public void display(){
        System.out.println("In Tyre" +a);
        a++;
    }
}


class Horn implements Vehicle{
    public void display(){
        System.out.println("In Horn");
    }
}
