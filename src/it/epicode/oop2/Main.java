package it.epicode.oop2;

public class Main {
    public static void main(String[] args) {

        // Esercizio 1

//       Dipendente dipendente1 = new Dipendente(123, 1034.50,Dipartimento.PRODUZI0NE);
//       Dipendente dipendente2 = new Dipendente(456, 1450.20,Dipartimento.AMMINISTRAZIONE);
//       Dipendente dipendente3 = new Dipendente(789, 1957.65,Dipartimento.VENDITE);

        // opzione 1 per popolare l'array: Dipendente [] dipendenti = {dipendente1, dipendente2, dipendente3};

//        Dipendente [] dipendenti = new Dipendente [3];
//        dipendenti[0] = dipendente1;
//        dipendenti[1] = dipendente2;
//        dipendenti[2] = dipendente3;

//        for (int i = 0; i < dipendenti.length; i++ ) {
//            int matricola = dipendenti[i].getMatricola();
//            System.out.println("Matricola dipendente: " + matricola);

        // !! anche se sto ciclando un oggetto all'interno di un array, la variabile interna al ciclo for
        // è sempre di tipo int perchè l'indice dell'array è sempre un numero intero

//        for (int i = 0; i < dipendenti.length; i++) {
//            int matricola = dipendenti[i].getMatricola();
//            double stipendio = dipendenti[i].getStipendioMensile();
//            Dipartimento dipartimento = dipendenti[i].getDipartimento();
//            System.out.println("____________");
//            System.out.println("Matricola dipendente: " + matricola);
//            System.out.println("Stipendio mensile: " + stipendio);
//            System.out.println("Dipartimento: " + dipartimento);
//            System.out.println("____________");
//        }

        // Esercizio 2

//        Dipendente dipendente1 = new DipendenteFullTime(123, 1034.50, Dipartimento.PRODUZI0NE);
//        Dipendente dipendente2 = new DipendentePartTime(456, 1450.20, Dipartimento.AMMINISTRAZIONE);
//        Dipendente dipendente3 = new Dirigente(789, 1957.65, Dipartimento.VENDITE);
//
//        Dipendente[] dipendenti2 = {dipendente1, dipendente2, dipendente3};
//
//// prima me la dichiaro anche fuori la variabile stipendiTotale per stamparla a schermo dopo
//
//        double stipendiTotale = 0.0;
//        for (int i = 0; i < dipendenti2.length; i++) {
//
//            stipendiTotale += dipendenti2[i].getStipendioMensile();
//        }
//
//        System.out.println("Somma degli stipendi dei due dipendenti e del dirigente: " + stipendiTotale);
//    }

        // Esercizio 3

        Dipendente dipendente = new DipendentePartTime(729, 1477.65, Dipartimento.VENDITE);
        Volontario volontario = new Volontario("Alice Lazzeri", 29, "Laureata in Lingue e Letterature Straniere");
        Object[] dipendentiEVolontari = {dipendente, volontario};
        if (dipendente instanceof TurnoLavoro) {
            ((TurnoLavoro) dipendente).checkIn();
        }
        if (volontario instanceof TurnoLavoro) {
            ((TurnoLavoro) volontario).checkIn();

    }
    }
}