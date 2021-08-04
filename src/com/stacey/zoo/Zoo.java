package com.stacey.zoo;

import com.stacey.zoo.animals.*;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
	    new Zoo().run();
    }

    private void run() {
       List<Animal> animals = new ArrayList<>();

        animals.add(new Cat("Murka"));
        animals.add(new Chicken("Ryaba"));
        animals.add(new Dog("Bobik"));
        animals.add(new Cow("Burenka"));
        animals.add(new Chicken("Kvochka"));
        animals.add(new Cat("Barsik"));
        animals.add(new Cow("Kalina"));
        animals.add(new Dog("Tuzik"));

        animals.forEach(Animal::voice);
    }
}
