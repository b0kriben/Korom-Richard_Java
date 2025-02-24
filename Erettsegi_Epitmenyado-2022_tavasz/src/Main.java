import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // fájl olvasás
        ArrayList<String> utcak = new ArrayList<>();

        try{
            File f = new File("utca.txt");
            Scanner scanner = new Scanner(f);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
                utcak.add(line);

            }

            scanner.close();

            int telkekszama;
            telkekszama = utcak.toArray().length-1;
            System.out.println("2. feladat. A mintában " + telkekszama + " telek szerepel.");

            System.out.println("Kérem adja meg a tulajdonos adószámát: ");
            String tulajdonosAdoszam = scanner.nextLine();

            System.out.println("3. feladat. Egy tulajdonos adószáma " + tulajdonosAdoszam);
        }catch(FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}