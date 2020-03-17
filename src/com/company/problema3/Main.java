//3. Sa se creeze o clasa java care seteaza printr-un contructor 2 tipuri de date si le returneaza folosind metodele getter.

package com.company.problema3;

public class Main {
    public static void main(String args[]){
        Car car = new Car("Porsche", 119000);

        System.out.format("Modelul masinii este %s\n", car.getModel());
        System.out.format("Kilometrajul masinii este %d km", car.getMileage());


    }
}
