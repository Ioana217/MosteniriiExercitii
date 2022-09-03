package Exemple;

public class Cat extends Animal {
    public void  sleep(){
        System.out.println("ZzzZZzzZZz");
    }
    @Override
    public void makeSound(){
        System.out.println("miau");
    }
}
