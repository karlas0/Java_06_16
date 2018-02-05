package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //paprasyti ivesti zodi
        System.out.println("iveskite zodi, ieskosime jame ab komb kokio");
        Scanner sc = new Scanner(System.in);
        String zodis = sc.nextLine();
        //nuskaityti ivesta zodi
        Main objektas = new Main();
        objektas.kiekZodyjeABKOmbinaciju(zodis);


    }

    //sukurti atskira metoda
    //duoti zodi metodui kaip parametra
    public void kiekZodyjeABKOmbinaciju(String zodis) {
        int kiekZodyjeABKOmbinaciju = 0;
        //patikrinti ar zodis yra ne tuscias, ar tas zodis yra ne skaicius
        if (zodis.equals("")) {
            System.out.println("zodis yra netinkamas");

        } else {
            //ar tas zodis yra ne skaicius
            boolean arSkaicius = false;
            try {
                Float.parseFloat(zodis);
                arSkaicius = true;
                System.out.println("ivestas zodis yra netinkamas");
            } catch (Exception klaida) {
            }
            if (arSkaicius == false) {
                //eiti per visas raides
                //neziureti pacios paskutines raides
                for (int i = 0; i < zodis.length() - 1; i++) {
                    char simbolisPirmas = zodis.charAt(i);
                    char simbolisAntras = zodis.charAt(i + 1);
                    //paziureti ar raide yra a
                    if (simbolisPirmas == 'a') {
                        if (simbolisAntras == 'b') {
                            kiekZodyjeABKOmbinaciju++;
                        }
                    }


                }
            }
            System.out.println(kiekZodyjeABKOmbinaciju);
        }

    }


    //patikrinti ar paskutine raide ne a


    //paimti raide pagal i

    //jeigu raide yra a, paziureti ar sekanti raide yra b
}
