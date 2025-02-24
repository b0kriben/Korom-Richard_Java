import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1.feladat
        ArrayList<String> adatok = new ArrayList<>();

        try{
            File f = new File("melyseg.txt");
            Scanner scanner = new Scanner(f);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
                adatok.add(line);
            }
            scanner.close();

            //1. feladat
            int sorokSzama;
            sorokSzama = adatok.size();
            System.out.println("1. feladat.");
            System.out.println("A fájl adatainak száma: " + sorokSzama);

            // 2.feladat
            System.out.println("2. feladat.");
            System.out.println("Adjon meg egy távolságértéket!");
            Scanner scanner2 = new Scanner(System.in);
            int tavolsagertek = scanner2.nextInt();

            System.out.println("Ezen a helyen a felszín " + adatok.indexOf(tavolsagertek) + " méter mélyen van.");
            /*for (String tavolsagertek : adatok) {
                System.out.println("Ezen a helyen a felszín " + tavolsagertek + " méter mélyen van.");
            }*/

            //3. feladat
            int erintettlenTerulet = 0;

            for(String i : adatok){
                if(i.equals("0")){
                    erintettlenTerulet++;
                }
            }

            int arany = 0;
            arany = (100 / sorokSzama) * erintettlenTerulet;
            System.out.println("3. feladat");
            System.out.println("Az érintetlen terület aránya " + arany + ".");

        }catch(FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
