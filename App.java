package be.intecbrussel.opdrachten.opdracht1;

import java.util.*;

public class App {

    public static void main(String[] args) {

        Collection<Integer> userNumbers = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Geef in 5 nummer aub");

        while (userNumbers.size() < 5) {
            userNumbers.add(keyboard.nextInt());
        }

        userNumbers.forEach(System.out::println);

        int sum = userNumbers.stream()
                             .mapToInt(e -> e)
                             .sum();

        System.out.println(sum);
    }
}
