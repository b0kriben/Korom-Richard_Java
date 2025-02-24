import java.util.HashSet;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        /*HashSet<String> maganhangzok = new HashSet<>();

        maganhangzok.add("a");
        maganhangzok.add("á");
        maganhangzok.add("e");
        maganhangzok.add("é");
        maganhangzok.add("i");
        maganhangzok.add("í");
        maganhangzok.add("o");
        maganhangzok.add("ó");
        maganhangzok.add("ö");
        maganhangzok.add("ő");
        maganhangzok.add("u");
        maganhangzok.add("ú");
        maganhangzok.add("ü");
        maganhangzok.add("ű");*/

        String szoveg = "Iden Java szigeten voltunk nyaralni. Nem is tudtam, hogy elneveztek egy helyet egy programozasi nyelvrol.";

        /*for(String c : maganhangzok){
            szoveg = szoveg.replace(c, "");
            szoveg = szoveg.replace(c.toUpperCase(), "");
        }*/

        szoveg = szoveg.replaceAll("[aáeéiíoóöőuúüűAÁEÉIÍOÓÖŐUÚÜŰ]", "");

        System.out.println("szoveg = " + szoveg);
    }
}