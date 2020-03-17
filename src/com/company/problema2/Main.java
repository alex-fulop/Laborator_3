//2. Se citește o frază de la tastatură. Să se creeze un program care afișează toate cuvintele
//găsite în fraza respectivă.  Se va utiliza JAVA class cu metoda noua.

package com.company.problema2;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Propozitie builder = new Propozitie();
        System.out.println("Introdu o propozitie");
        Scanner scanner = new Scanner(System.in);
        builder.propozitie = scanner.nextLine();
        builder.cuvinte();

    }
}
