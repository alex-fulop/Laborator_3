//4. Un elev introduce de la tastatura un șir de caractere reprezentând numele unui coleg, iar
//șirul respectiv se stochează într-o variabila c. Scrieți un program care să permită unui alt
//coleg (care nu a văzut șirul introdus de primul elev) să introducă un șir de caractere până
//când ghicește numele introdus de colegul său. La sfârșit, programul trebuie să afișeze din câte
//încercări a reușit al doilea elev să găsească numele introdus de primul elev.
//Sa se utilizeze clase. Sa se implementeze cu recursivitate.

package com.company.problema4;

import java.util.Scanner;

public class Main {
    public static void main (String Args[]){
        Game game = new Game();
        System.out.println("Introdu numele : ");
        Scanner scanner = new Scanner(System.in);
        String nume = scanner.nextLine();
        game.setC(nume);
        game.guess();
    }

}
