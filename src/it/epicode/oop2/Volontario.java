package it.epicode.oop2;

public class Volontario implements TurnoLavoro {
    private String nome;
    private int eta;
    private String cv;

    // Getter

    public String getNome() {
        return nome;
    }
    public int getEta() {
        return eta;
    }
    public String getCv() {
        return cv;
    }

    // Setter

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEta(int eta) {
        this.eta = eta;
    }
    public void setCv(String cv) {
        this.cv = cv;
    }

    // Costruttore

    public Volontario (String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    @Override
    public void checkIn() {
        System.out.println("Il volontario " + this.nome + " ha iniziato il proprio turno");
    }
}
