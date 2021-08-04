package com.stacey.zoo.animals;

public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    public void voice() {
        System.out.println("Cow "+name+": Moo!");
    }
}
