package be.intecbrussel.opdrachten.opdracht1;

import java.util.*;

public class AppSet {

    public static void main(String[] args) {

        Collection<Integer> intCollection = new HashSet<>();
        Scanner keyboard = new Scanner(System.in);

        intCollection.add(10);
        intCollection.add(15);
        intCollection.add(10);

        intCollection.forEach(System.out::println);
    }
}
