package be.esercizi.esercizio2;

import java.util.*;

public class Esercizio2 {
    public static Random rand = new Random();

    public static void main(String[] args) {
        List<Integer> randomNums = numeriRandom(10);
        System.out.println(randomNums);

        List<Integer> reversedList = reverseList(randomNums);
        System.out.println("Lista originale con elementi in ordine inverso: " + reversedList);

        // Stampa i valori pari
        System.out.println("Valori in posizioni pari:");
        printValues(randomNums, true);

        // Stampa i valori dispari
        System.out.println("Valori in posizioni dispari:");
        printValues(randomNums, false);
    }



    // Funzione che genera una lista ordinata di numeri casuali
    public static List<Integer> numeriRandom(int num) {
        List<Integer> randomNumslist = new ArrayList<Integer>();

        for (int i = 0; i < num; i++) {
            randomNumslist.add(rand.nextInt(0,101));
        }
        // ordino la lista con il sort()
        Collections.sort(randomNumslist);
        return randomNumslist;
    }


    // Funzione che accetta una lista e restituisce una nuova lista con ordine inverso
    public static List<Integer> reverseList(List<Integer> lista) {
        List<Integer> reversedList = new ArrayList<>(lista);
        Collections.reverse(reversedList);
        return reversedList;
    }
    // Funzione che accetta una lista e un booleano per stampare valori in posizioni pari o dispari
    public static void printValues(List<Integer> lista, boolean pari) {
        List<Integer> numsToPrint = new ArrayList<Integer>();

        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0) {
                System.out.println("Posizione " + i +":"+ lista.get(i));
            } else if (!pari && i % 2 != 0) {
                System.out.println("Posizione " + i +":"+ lista.get(i));
            }
        }


    }
}
