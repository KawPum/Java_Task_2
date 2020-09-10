package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class DogOrphanage {
    private ArrayList<Dog> dogs = new ArrayList();

    public void addDogs(int howMany)
    {
        Scanner sc = new Scanner(System.in);
        for (;howMany>0;howMany--)
        {
            dogs.add(new Dog(sc.next(), sc.nextInt()));
        }
    }

    @Override
    public String toString() {
        return "Orphanage holds " + dogs.size() + " dogs at the moment.";
    }
}
