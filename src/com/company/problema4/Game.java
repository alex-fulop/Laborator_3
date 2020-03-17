package com.company.problema4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Game {
    private String c;
    private int tries = 0;

    public void setC(String c){
        this.c = c;
    }

    public int guess(){
        System.out.println("Ghiceste numele : ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        if(option.equals(this.c)){
            System.out.format("Felicitari, ai ghicit din %d incercari!", this.tries);
            return 0;
        }
        else {
            this.tries++;
            return guess();
        }
    }
}
