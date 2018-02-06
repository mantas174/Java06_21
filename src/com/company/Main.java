package com.company;

import java.util.Scanner;

public class Main {

    private static final String AR_LABAS = "labas";

    public static void main(String[] args) {
	// write your code here
        Main obj = new Main();
        Scanner in = new Scanner(System.in);
        String tekstas;
        boolean arYra;

        System.out.println("Iveskite teksta kuriame ieskosime \"labas\" ");
        tekstas = in.nextLine();

        arYra = obj.arYraLabas(tekstas);

        if(arYra){
            System.out.println("Tekste: ");
            System.out.println(tekstas);
            System.out.println(" yra \"labas\" ");
        }else {
            System.out.println("Tekste: ");
            System.out.println(tekstas);
            System.out.println(" nera \"labas\" ");
        }

    }
    public boolean arYraLabas(String tekstas){
        boolean yra = false;
        String [] poZodi;

        poZodi = tekstas.split(" ");
        for(int i = 0; i < poZodi.length; i++){
            if (poZodi[i].equals(AR_LABAS)){
                yra = true;
            }
        }

        return yra;
    }
}
