package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] partyGuest = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.println("Come Ti Chiami?: ");
        String userName = scan.nextLine();

        boolean checkGuest = false;

        System.out.println(userName);

        // -----------------------Versione For-------------------------------------------------

     /*   for (int i = 0; i < partyGuest.length; i++){
            if(userName.equals(partyGuest[i])){
                checkGuest = true;
            }
        } */

        //-------------------------Alternativa While---------------------------------------------
        int i = 0;
        while(i<partyGuest.length){
            if(userName.equals(partyGuest[i])){
                checkGuest = true;
                break;
            }else {
                i++;
            }
        }

        //------------------------------Risultato-------------------------------------------

        if (checkGuest) {
            System.out.println("Puoi passare");
        }else{
            System.out.println("Vai via dalla mia vista");
        }

    scan.close();

    }
}
