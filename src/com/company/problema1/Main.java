//1. Scrieti un program care pentru un sir de caratectere, afiseaza numarul de aparitii al unui caracter dat.

package com.company.problema1;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu o propozitie");
        String propozitie = scanner.nextLine();
        System.out.println("Introdu un caracter");
        char c = scanner.next().charAt(0);
        Propozitie builder = new Propozitie();
        System.out.format("Characterul %c apare de %d ori", c, builder.nr_aparitii(propozitie, c));
    }
}
