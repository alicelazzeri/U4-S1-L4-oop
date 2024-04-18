package it.epicode.oop2;

public abstract class Dipendente implements TurnoLavoro {
    private int matricola;
    private double stipendioMensile;
    private Dipartimento dipartimento;

    // Getter

    public int getMatricola() {
        return matricola;
    }
    public double getStipendioMensile() {
        return stipendioMensile;
    }
    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    // Setter

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    // Costruttore

    public Dipendente (int matricola,double stipendioMensile, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendioMensile = stipendioMensile;
        this.dipartimento = dipartimento;
    }

    public abstract double calculateSalary();
    // ricordati che questo metodo è abstract e qui non ha un corpo
    // perchè deve essere solo stanziata e overridden nelle sue sottoclassi

    @Override
    public void checkIn() {
        System.out.println("Il dipendente ha iniziato il proprio turno");
    }
}



