package it.epicode.oop2;

public class DipendentePartTime extends Dipendente {
    public DipendentePartTime (int matricola, double stipendioMensile, Dipartimento dipartimento) {
        // qui mi richiamo il costruttore di Dipendente per far corrispondere i parametri con quelli di DipendenteFullTime
        super (matricola, stipendioMensile, dipartimento);
    }
    @Override
    public double calculateSalary() {
        return getStipendioMensile();
    }
    public void checkIn() {
        System.out.println("Il dipendente con matricola " + getMatricola() + " ha iniziato il proprio turno");
    }

}
