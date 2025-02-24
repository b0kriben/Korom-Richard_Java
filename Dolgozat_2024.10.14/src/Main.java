import java.util.Scanner;

public class Main {
    // 1.feladat
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a csoki gyartasi sorszamat: ");
        int szam = scanner.nextInt();

        int szamitas = 0;

        for(int i = 2; i < szam; i++) {
            if(szam % i == 0){
                szamitas += 1;
            }
        }

        if(szamitas == 0){
            System.out.println("Gratulalok, nyertel!");
        }
        else {
            System.out.println("Sajnos nem nyert!");
        }

        // 2.feladat
        System.out.println("Adja meg a jelszót!");
        String jelszo = scanner.nextLine();
        System.out.println("Input: " + jelszo);

        int erosseg = 1;
        int characters = jelszo.length().count;

        if (characters >= 5 && characters < 8){
            erosseg += 1;
        }
        else if (characters >= 8) {
            erosseg += 1+2;
        }
        else if (jelszo.contains("jelszo") || jelszo.contains("123")) {
            erosseg = 0;
        }

        // 3.feladat
        System.out.println("Kérem a szöveget!");
        String szoveg = scanner.nextLine();
        System.out.println("Input: " + szoveg);

        
    }

    // 2.feladat
    public static void jelszo_erosseg(String jelszo){
        System.out.println("Return: " + jelszo_erosseg(erosseg));
    }

    // 3.feladat
    public static void maganhangzo_torol(String szoveg){
        System.out.println("Return: " + maganhangzo_torol(ujSzoveg));
    }
}