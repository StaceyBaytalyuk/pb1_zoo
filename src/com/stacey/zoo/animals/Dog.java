package com.stacey.zoo.animals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void voice() {
        System.out.println("Dog "+name+": Woof!");
    }
}
