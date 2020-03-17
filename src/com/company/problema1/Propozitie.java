package com.company.problema1;

public class Propozitie {
    public static int nr_aparitii(String propozitie ,char c){
        char[] tmp = propozitie.toCharArray();
        int cont = 0;

        for (int i = 0; i < tmp.length; i++) {
            if(tmp[i] == c) cont++;
        }

        return cont;
    }
}
