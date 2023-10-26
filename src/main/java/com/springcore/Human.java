package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

//    In Spring Framework, a qualifier annotation is used to disambiguate between multiple beans of the same type when autowiring.
//    When you have multiple beans that match the type required for autowiring (for example, multiple implementations of an interface),
//    you can use the @Qualifier annotation to specify which exact bean should be injected.
    @Autowired
    @Qualifier("octopusHeart")
    private Heart heart;


    // No need to write setters if you are writing the @Autowired before the dependency
    // Qualifier resolves the ByName conflict for multiple same objs
//    @Autowired
//    @Qualifier("octopusHeart")
//    public void setHeart(Heart heart) {
//        this.heart = heart;
//        System.out.println("Setter method is called..");
//    }

    public void startPumping(){
        if(heart != null){
            heart.pump();
            System.out.println("Animal name is: "+heart.getNameofAnimal()+ " and hearts are : "+heart.getNoOfHearts());

        } else {
            System.out.println("You are dead");
        }

    }
}
