package Abstracts;

public abstract class Animal {

    public abstract void sayHello();        //abstract method

    public abstract void jump();

    private int age ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void sleep(){                    //concrete method
        System.out.println("zzz");
    }

}
