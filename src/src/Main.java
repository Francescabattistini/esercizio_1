import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //esercizio 1.1

        int x = 2;
        int y = 3;
        int risultato = moltiplica(x, y);
        System.out.println("il prodotto di " + x + " e " + y + " è: " + risultato);
//esercizio 1.2
        String nome = "francesca";
        int age = 32;
        System.out.println(("il nome di " + nome + " e la sua età è " + age));

        //esercizio 1.3

        // esercizio 1.3
        String[] cinque = {"a", "b", "c", "d", "e"};
        String stringa = "terzo";
        for (int i = 0; i < Main.inserisciInArray(cinque, stringa).length; i++)
            System.out.println(Main.inserisciInArray(cinque, stringa)[i]);
 //Esercizio 2
        Scanner input = new Scanner( System.in);

        System.out.println("inserisci la prima stringa: ");
String stringa1 = input.nextLine();
        System.out.println("inserisci la seconda stringa: ");
        String stringa2 = input.nextLine();
        System.out.println("inserisci la terza stringa: ");
        String stringa3 = input.nextLine();
                String concatenata = stringa1 + stringa2 + stringa3;
        System.out.println("concatenazione : " + concatenata);

        String concatenataInversa = stringa3 + stringa2 + stringa1;
        System.out.println("concatenazione inversa: " + concatenataInversa);


    }


    //esercizio 1.1
    static int moltiplica(int a, int b) {
        return a * b;
    }
    //esercizio 1.3

    static String[] inserisciInArray(String[] cinque, String s) {
        String[] sei = new String[6];
        for (int i = 0; i < sei.length; i++) {
            if (i <= 1)
                sei[i] = cinque[i];
            else if (i == 2)
                sei[i] = s;
            else {
                sei[i] = cinque[i - 1];
            }
        }
            return sei;

    }
}

