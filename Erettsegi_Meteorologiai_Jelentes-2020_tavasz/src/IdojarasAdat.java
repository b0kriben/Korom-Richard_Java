public class IdojarasAdat {
    private String telepules;
    private String ido;
    private String szeliranyErosseg;
    private int homerseklet;

    /*public IdojarasAdat(String[] tomb){
        telepules = tomb[0];
        ido = tomb[1];
        szeliranyErosseg = tomb[2];
        homerseklet = Integer.parseInt(tomb[3]);
    }*/

    public IdojarasAdat(String telepules, String ido, String szeliranyErosseg, int homerseklet){
        this.telepules = telepules;
        this.ido = ido;
        this.szeliranyErosseg = szeliranyErosseg;
        this.homerseklet = homerseklet;
    }

    public String getTelepules() {
        return telepules;
    }

    public void setTelepules(String telepules) {
        this.telepules = telepules;
    }

    public String getIdo() {
        return ido;
    }

    public void setIdo(String ido) {
        this.ido = ido;
    }

    public String getSzeliranyErosseg() {
        return szeliranyErosseg;
    }

    public void setSzeliranyErosseg(String szeliranyErosseg) {
        this.szeliranyErosseg = szeliranyErosseg;
    }

    public int getHomerseklet() {
        return homerseklet;
    }

    public void setHomerseklet(int homerseklet) {
        this.homerseklet = homerseklet;
    }

    @Override
    public String toString() {
        return "IdojarasAdat{" +
                "telepules='" + telepules + '\'' +
                ", ido='" + ido + '\'' +
                ", szeliranyErosseg='" + szeliranyErosseg + '\'' +
                ", homerseklet=" + homerseklet +
                '}';
    }
}
