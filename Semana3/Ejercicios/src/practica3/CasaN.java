
package practica3;

public class CasaN {
    private int CasanN;
    private int PasajeN;
    private String CalleN;

    public CasaN() {
    }

    public CasaN(int CasanN, int PasajeN, String CalleN) {
        this.CasanN = CasanN;
        this.PasajeN = PasajeN;
        this.CalleN = CalleN;
    }

    public int getCasanN() {
        return CasanN;
    }

    public void setCasanN(int CasanN) {
        this.CasanN = CasanN;
    }

    public int getPasajeN() {
        return PasajeN;
    }

    public void setPasajeN(int PasajeN) {
        this.PasajeN = PasajeN;
    }

    public String getCalleN() {
        return CalleN;
    }

    public void setCalleN(String CalleN) {
        this.CalleN = CalleN;
    }

   
    
    String infoCasaN(){
        String info = "";
        info +=" El numero de casa es :"+this.getCasanN()+"\n";
        info +=" El numero de pasaje es :"+this.getPasajeN()+"\n";
        info +="El nombre de la calle es:"+this.getCalleN()+"\n";
        return info;
    }
}
