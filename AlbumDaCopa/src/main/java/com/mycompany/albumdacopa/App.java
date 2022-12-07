package com.mycompany.albumdacopa;

import com.github.javafaker.Faker;
import java.util.Locale;

/**
 *
 * @author Matheus Nascimento
 */
public class App {

    public static void main(String[] args) {
        System.out.println(Faker.instance(Locale.forLanguageTag("pt-BR")).name().fullName());
    }

}
