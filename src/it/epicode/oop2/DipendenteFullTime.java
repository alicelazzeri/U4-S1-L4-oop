package it.epicode.oop2;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime (int matricola, double stipendioMensile, Dipartimento dipartimento) {
        // qui mi richiamo il costruttore di Dipendente per far corrispondere i parametri con quelli di DipendenteFullTime
        super(matricola, stipendioMensile, dipartimento);
    }

   @Override
    public double calculateSalary() {
       return getStipendioMensile();
    }
}
