package servizi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

import modelli.Componente;
import modelli.Prodotto;

public class GestioneProdotti {
    private HashMap<String, Prodotto> archivioProdotti = new HashMap<>();

    public void addProdotto(String id, String etichetta, List<Componente> listaComponenti, double costoGiornaliero, double fattoreGuadagno, int giorniRealizzazione){
        archivioProdotti.put(id, new Prodotto(id, etichetta, listaComponenti, costoGiornaliero,fattoreGuadagno, giorniRealizzazione));
    }

    public Prodotto getProdotto(String identificativo){
        Prodotto p = this.archivioProdotti.get(identificativo);
        if (p == null) {
            throw new NoSuchElementException("Il prodotto " + identificativo + " non è stato trovato");
        }
        return p;
    }

    public void setFattoreGuadagno(double fattoreGuadagno){
        for (Prodotto p : archivioProdotti.values()) {
            p.setFattoreGuadagno(fattoreGuadagno);
        }
    }

    public void setCostoGiornaliero(double costoGiornaliero){
        for (Prodotto p : archivioProdotti.values()) {
            p.setCostoGiornaliero(costoGiornaliero);
        }
    }

    @Override
    public String toString() {
        return "Catalogo Prodotti:\n " + this.archivioProdotti;
    }


}