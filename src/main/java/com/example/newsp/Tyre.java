package com.example.newsp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


interface Vehicle{
    public void display();
}
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
