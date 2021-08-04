package com.stacey.zoo.animals;

public abstract class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    public abstract void voice();

}
