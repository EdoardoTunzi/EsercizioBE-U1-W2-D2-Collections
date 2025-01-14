package be.esercizi.esercizio3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private static Map<String, String> rubrica = new HashMap<String, String>();

    public static void main(String[] args) {
        // Aggiunta contatti
        addContact("Edo", "3456789");
        addContact("Mario", "4789305");
        addContact("Francesco", "2398729873");

        // Stampa della rubrica
        System.out.println("Stampa della rubrica:");
        printRubrica();

        // Rimozione di un contatto
        System.out.println("\nRimuovo il contatto 'Mario':");
        remove("Mario");

        // Stampa della rubrica aggiornata
        System.out.println("\nRubrica dopo la rimozione:");
        printRubrica();

        // Ricerca di un contatto tramite numero di telefono
        System.out.println("\nCerco il contatto con numero '3456789':");
        cercaContatto("3456789");

        // Ricerca di un numero tramite nome
        System.out.println("\nCerco il numero di 'Francesco':");
        cercaContattoDaNome("Francesco");
    }

    public static void addContact(String nome, String numTelefonico) {
        rubrica.put(nome, numTelefonico);
    }

    public static void printRubrica() {
        for (String key : rubrica.keySet()) {
            System.out.println("Nome: " + key + " Numero: " + rubrica.get(key));
        }
    }

    public static void remove(String nome) {
        rubrica.remove(nome);
    }

    public static void cercaContatto(String numTelefono) {
        for (String key : rubrica.keySet()) {
            if (numTelefono.equals(rubrica.get(key))) {
                System.out.println("Il contatto con il numero " + numTelefono + " è " + key);
                break;
            }
        }
    }

    public static void cercaContattoDaNome(String nome) {
        System.out.println("Il contatto con il nome " + nome + " è: " + rubrica.get(nome));
    }
}