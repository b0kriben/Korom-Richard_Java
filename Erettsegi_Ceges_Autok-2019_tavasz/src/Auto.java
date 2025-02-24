public class Auto {
    private int nap;
    private String oraPerc;
    private String rendszam;
    private String szemelyAz;
    private int kiBe;

    public Auto(int nap, String oraPerc, String rendszam, String szemelyAz, int kiBe){
        this.nap = nap;
        this.oraPerc = oraPerc;
        this.rendszam = rendszam;
        this.szemelyAz = szemelyAz;
        this.kiBe = kiBe;
    }

    public int getNap() {
        return nap;
    }

    public void setNap(int nap) {
        this.nap = nap;
    }

    public String getOraPerc() {
        return oraPerc;
    }

    public void setOraPerc(String oraPerc) {
        this.oraPerc = oraPerc;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public String getSzemelyAz() {
        return szemelyAz;
    }

    public void setSzemelyAz(String szemelyAz) {
        this.szemelyAz = szemelyAz;
    }

    public int getKiBe() {
        return kiBe;
    }

    public void setKiBe(int kiBe) {
        this.kiBe = kiBe;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "nap=" + nap +
                ", oraPerc='" + oraPerc + '\'' +
                ", rendszam='" + rendszam + '\'' +
                ", szemelyAz='" + szemelyAz + '\'' +
                ", kiBe=" + kiBe +
                '}';
    }
}
