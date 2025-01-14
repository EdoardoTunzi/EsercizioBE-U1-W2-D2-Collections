package be.esercizi.esercizio1;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
    public static Scanner scanner = new Scanner(System.in);
    public static Set<String> listaParole = new HashSet<String>();
    public static Set<String> duplicati = new HashSet<>();

    public static void main(String[] args){

        System.out.println("Quante parole vuoi inserire? Inserisci un numero: ");
        int numParole = Integer.parseInt(scanner.nextLine());

        addWordsToList(numParole);

        //stampa duplicati
        System.out.println("Parole duplicate: " + ((duplicati.isEmpty()) ? "Nessuna" : duplicati));
        //stampa numero non duplicati
        System.out.println("La lista contiene " + listaParole.size() + " elementi distinti");
        //stampa lista non duplicati
        System.out.println("Gli elementi della lista sono: " + listaParole);

        System.out.println("Programma terminato");
    }



    public static void addWordsToList(int numWords){
        System.out.println("Inserisci " + numWords + " parole, una per volta");

        for (int i = 0; i < numWords; i++) {
            System.out.println("Inserisci la " +(i+1)+ "° parola");
            String parola = scanner.nextLine();

            /* if (listaParole.contains(parola)) {
                System.out.println("Duplicato: " + parola);
            }
            listaParole.add(parola);*/

            if (!listaParole.contains(parola)) {
                listaParole.add(parola);
            } else {
                duplicati.add(parola);
            }
        }
    }
}
