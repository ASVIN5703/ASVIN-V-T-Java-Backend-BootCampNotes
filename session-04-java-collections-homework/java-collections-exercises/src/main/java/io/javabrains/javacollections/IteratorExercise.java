package io.javabrains.javacollections;

import java.util.ArrayList;
import java.util.Collection;
<<<<<<< HEAD
import java.util.Iterator;
=======
>>>>>>> 67ac0be (Session 3 exercises)

/*
Write code that calls the getFruits method and then iterates over the collection, printing each element to console
 */

public class IteratorExercise {
<<<<<<< HEAD
    public static void main(String[] args) {
        FruitSupplier f=new FruitSupplier();
        Collection<String> itr=f.getFruits();
        Iterator<String> i= itr.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
=======

>>>>>>> 67ac0be (Session 3 exercises)

}


class FruitSupplier {
    public Collection<String> getFruits() {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        return list;
    }

}