package com.company;


import java.util.HashMap;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        HashMap<String, BankRekening> rekeningen = new HashMap<>();

        System.out.println("Rekeningen maken.");

        String invoer;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {

            System.out.print("Geef rekeningnummer: ");

            invoer = scanner.nextLine();

            BankRekening rek = new BankRekening(invoer);

            rekeningen.put(rek.getRekeningnummer(), rek);


        }

        System.out.println("Op welke rekening wilt u storten ? ");


        for(BankRekening rek: rekeningen.values()) {

            System.out.printf("%s\n", rek.getRekeningnummer());
        }

        System.out.print("Geef rekening: ");

        invoer = scanner.nextLine();

        System.out.print("Geef bedrag: ");

        int bedrag = Integer.parseInt(scanner.nextLine());

        rekeningen.get(invoer).storten(bedrag);



        System.out.println("Het resultaat: ");


        for(BankRekening rek: rekeningen.values()) {

            System.out.printf("%s: %d EUR\n", rek.getRekeningnummer(), rek.getSaldo());
        }

    }
}



