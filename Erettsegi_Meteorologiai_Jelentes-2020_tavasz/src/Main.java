import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import  java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        // 1.feladat
        ArrayList<String> adatok = new ArrayList<>();

        try{
            File f = new File("tavirathu.txt");
            Scanner scanner = new Scanner(f);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
                adatok.add(line);

                /*int hely = 0;
                for(line = readLine(); line != null; line = readLine()){
                    adatok[hely] = new IdojarasAdat(line.split(" "));
                    hely++;
                }*/
            }

            scanner.close();
        }catch(FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // 2. feladat
        //IdojarasAdat();
        System.out.println("2. feladat");
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg egy település kódját!");
        String telepulesKod = sc.nextLine();
        System.out.print("Település: "+ telepulesKod);
        //System.out.println("Az utolsó mérési adat a megadott településről " + ido + " -kor érkezett.");

        // 6.feladat
        /*ArrayList<String> telepulesRendezes = new ArrayList<>();

        telepulesRendezes.add(sc.nextLine());

        System.out.println(telepulesRendezes);

        try{
            FileWriter writer = new FileWriter(telepulesRend + ".txt");

            for (String tRend : telepulesRendezes){
                writer.write(tRend + "\n");
            }

            //writer.write("Elso sor\n");
            //writer.write("Masodik sor\n");

            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }*/
    }

    /*public static void IdojarasAdat(){
        System.out.println("2. feladat");
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg egy település kódját!");
        String telepulesKod = sc.nextLine();
        System.out.print("Település: "+ telepulesKod);
        System.out.println("Az utolsó mérési adat a megadott településről " + ido + " -kor érkezett.");
    }*/
}