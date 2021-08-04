package com.stacey.zoo.animals;

public class Chicken extends Animal {
    public Chicken(String name) {
        super(name);
    }

    public void voice() {
        System.out.println("Chicken "+name+": Kokoko! ");
    }
}
