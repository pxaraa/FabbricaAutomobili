package modelli;

public class Componente {
    private String nome;
    private String provenienza;
    private Visibilità visibilità;
    private double costo;
    private double tempiOrdinazione;

    public Componente(String nome, String provenienza,Visibilità visibilità, double costo, double tempiOrdinazione){
        this.nome = nome;
        this.provenienza = provenienza;
        this.visibilità = visibilità;
        this.costo = costo;
        this.tempiOrdinazione = tempiOrdinazione;
    }
    // Getters e Setters
    public double getCosto() {
        return costo;
    }

    //stampa delle caratteristiche del componente una volta fatto new componente
    @Override
    public String toString() {
        return "Componente [nome=" + nome + ", paese=" + provenienza + ", visibilità=" + visibilità + ", tempoDiOrdinazione="
                + tempiOrdinazione + ", costo=" + costo + "]";
    }
}
