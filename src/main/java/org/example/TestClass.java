package org.example;

import com.github.javafaker.Faker;

public class TestClass {
    public static void main(String[] args) {
        System.out.println(Faker.instance().howIMetYourMother().quote());
        System.out.println(Faker.instance().date().birthday(18, 70));
    }
}
