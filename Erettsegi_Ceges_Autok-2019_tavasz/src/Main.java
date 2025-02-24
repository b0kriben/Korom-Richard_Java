import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // fájl olvasás
        ArrayList<String> autok = new ArrayList<>();
        //ArrayList<Auto> autok = new ArrayList<>();

        try{
            File f = new File("autok.txt");
            Scanner scanner = new Scanner(f);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                //Auto line = scanner.nextLine();
                System.out.println(line);
                autok.add(line);
            }

            scanner.close();

            //2.feladat
            /*Auto utolso;

            for (Auto i : autok){

            }
            System.out.println("2. feladat: " + auto.getNap() + ". nap rendszám: " + auto.getRendszam());
            auto();*/

            //3.feladat
            System.out.println("Kérem az egyik nap számát: ");
            int napSzama = scanner.nextInt();

        }catch(FileNotFoundException e){
            throw  new RuntimeException(e);
        }
    }

    //2.feladat
    /*public static void auto(){
        System.out.println("2. feladat: " + auto.getNap() + ". nap rendszám: " + auto.getRendszam());
    }*/
}