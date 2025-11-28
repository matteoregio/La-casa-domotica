//lavoro a gruppi, grafica;
//gruppo di: Gabu, Regio, Egeonu

import graphics.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static final void stampaMenu(){
        System.out.println("\n=== MENU CASA DOMOTICA ===");
        System.out.println("1. Aggiungi lampadina");
        System.out.println("2. Rimuovi lampadina");
        System.out.println("3. Accendi lampadina");
        System.out.println("4. Spegni lampadina");
        System.out.println("5. Accendi tutte le lampadine");
        System.out.println("6. Spegni tutte le lampadine");
        System.out.println("7. Aumenta luminosità +10%");
        System.out.println("8. Diminuisci luminosità -10%");
        System.out.println("9. Modifica colore lampadina");
        System.out.println("10. Mostra potenza attuale");
        System.out.println("11. Elenco lampadine");
        System.out.println("0. Esci");
        System.out.println("=== MENU CASA DOMOTICA ===");
        System.out.println("Scelta: ");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        CasaDomotica casa = new CasaDomotica(100);
        boolean flag = true;

        Picture p = new Picture("casa.jpg");
        p.draw();

        while(flag){

            stampaMenu();

            int scelta = in.nextInt();
            ArrayList <Integer> lampadine = new ArrayList<>(16);

            if (scelta == 1) {
                casa.sceltaUno(lampadine);
            } else if (scelta == 2) {
                casa.sceltaDue(casa);
            } else if (scelta == 3) {
                casa.sceltaTre(casa);
            } else if (scelta == 4) {
                casa.sceltaQuattro(casa);
            } else if (scelta == 5) {
                casa.accendiTutte();
                System.out.println("Tutte accese.");
            } else if (scelta == 6) {
                casa.spegniTutte();
                System.out.println("Tutte spente.");
            } else if (scelta == 7) {
                casa.sceltaSette(casa);
            } else if (scelta == 8) {
                casa.sceltaOtto(casa);
            } else if (scelta == 9) {
                casa.sceltaNove(casa);
            } else if (scelta == 10) {
                System.out.println("Potenza attuale: " + casa.getPotenzaAttuale() + " W");
            } else if (scelta == 11) {
                System.out.println("Lampadine presenti: ");
                for (int i = 0; i < casa.getElencoLampadine().size(); i++) {
                    System.out.println("- " + casa.getElencoLampadine().get(i));
                }
            } else if (scelta == 0) {
                flag = false;
            } else {
                System.out.println("Scelta non valida.");
            }
        }
        System.exit(0);
    }
}
