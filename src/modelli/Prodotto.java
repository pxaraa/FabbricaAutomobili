package modelli;
import java.util.List;

public class Prodotto {
    private String id;
    private String etichetta;
    private double costoGiornaliero;
    private int giorniRealizzazione;
    private List<Componente> listaComponenti;
    private double fattoreGuadagno;

    public Prodotto(String id, String etichetta, List <Componente> listaComponenti,double costoGiornaliero, double fattoreGuadagno, int giorniRealizzazione){
        this.id = id;
        this.etichetta = etichetta;
        this.listaComponenti = listaComponenti;
        this.costoGiornaliero = costoGiornaliero;
        this.fattoreGuadagno = fattoreGuadagno;
        this.giorniRealizzazione = giorniRealizzazione;
    }

    //metodo per calcolare quanto costa il prodotto formato da più componenti
    public double calcolaCostoComponenti(){
        double costoTotale = 0;
        for (Componente x : listaComponenti){
            costoTotale += x.getCosto();
        }
        return costoTotale;
    }

    //metodo per calcolare il costo di realizzazione
    public double getCostoDiRealizzazione(){
        return (double)this.giorniRealizzazione * this.costoGiornaliero;
    }

    //metodo che calcola il costo totale per la produzione
    private double getCostoComplessivoProduzione(){
        return this.calcolaCostoComponenti() + this.getCostoDiRealizzazione();
    }

    //metodo che calcola il prezzo di vendita
    public double getPrezziAcquirenti(){
        return this.getCostoComplessivoProduzione() + this.fattoreGuadagno;
    }

    //possiamo stampare le info del prodotto dopo aver fatto new prodotto
    @Override
    public String toString() {
        return "Prodotto [identificativo=" + id +
                ", etichetta=" + etichetta +
                ", componenti=" + listaComponenti +
                ", getPrezziAcquirenti()=" + getPrezziAcquirenti() + "]";
    }
    //getter e setter

    public void setCostoGiornaliero(double costoGiornaliero) {
        this.costoGiornaliero = costoGiornaliero;

    }

    public void setFattoreGuadagno(double fattoreGuadagno) {
        this.fattoreGuadagno = fattoreGuadagno;
    }
}
