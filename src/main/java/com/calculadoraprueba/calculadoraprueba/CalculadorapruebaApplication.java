package com.calculadoraprueba.calculadoraprueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadorapruebaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculadorapruebaApplication.class, args);
    }


    public class A {
        public static int counter = 0;
    }

    public class B {
        private A first = new A();
        private A second = new A();

        public void runUpTheCount() {
            first.counter ++;  // Noncompliant
            second.counter ++;  // Noncompliant. A.counter is now 2, which is perhaps contrary to expectations
        }
    }
}
