package interfaces;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RedBird bird = new RedBird();
        Rocket rocket = new Rocket();


        bird.fly();

//        Arrays.sort();
//        re(List.of(rocket, bird));

    }

    public static void printFly(List<Flamable> flyables) {
        for (Flamable flyable: flyables) {
            flyable.fly();
        }
    }

}
