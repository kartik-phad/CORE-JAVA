package Abstracts;

public class Dog extends Animal{   //The class must be an abstract class or implement an abstract method

    @Override
    public void sayHello(){                 //here we have implemented an abstract method from parent Animal
        System.out.println("woff");
    }

    @Override
    public void jump() {

    }
}
