package fr.pantheonsorbonne.ufr27.miage;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class App {

    public static void main(String... args) {
        System.out.println("Running main method go to http://localhost:8080/primes/2 to launch the process");
        Quarkus.run(args);
    }
}
