package be.intecbrussel.opdrachten.opdracht1;

import java.util.*;

public class AppString {

    public static void main(String[] args) {

        Collection<String> userWords = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Geef een zin die eindigd met een punt.");
        String word = "";

        while (!(word = keyboard.next()).endsWith(".")) {
            userWords.add(word);
        }

        userWords.add(word);

        userWords.forEach(System.out::println);
    }
}
