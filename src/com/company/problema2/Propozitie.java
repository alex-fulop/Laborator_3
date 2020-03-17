package com.company.problema2;

public class Propozitie {
    public String propozitie;

    public void cuvinte(){
        char[] tmp = this.propozitie.toCharArray();
        for (int i = 0; i <tmp.length ; i++) {
            if(tmp[i] == ' ') System.out.println();
            else System.out.print(tmp[i]);
        }
    }
}
