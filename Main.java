//lavoro a gruppi, grafica;
//gruppo di: Gabu, Regio, Egeonu

import graphics.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        CasaDomotica casa = new CasaDomotica(100);

        Picture p = new Picture("casa.jpg");
        p.draw();

        boolean flag = true;

        while(flag){

            System.out.println("\n=== MENU CASA DOMOTICA ===");
            System.out.println("1. Aggiungi lampadina");
            System.out.println("2. Rimuovi lampadina");
            System.out.println("3. Accendi lampadina");
            System.out.println("4. Spegni lampadina");
            System.out.println("5. Accendi tutte le lampadine");
            System.out.println("6. Spegni tutte le lampadine");
            System.out.println("7. Imposta luminosità lampadina");
            System.out.println("8. Aumenta luminosità +10%");
            System.out.println("9. Diminuisci luminosità -10%");
            System.out.println("10. Modifica colore lampadina");
            System.out.println("11. Mostra potenza attuale");
            System.out.println("12. Elenco lampadine");
            System.out.println("13, salva la casa");
            System.out.println("0. Esci");
            System.out.println("=== MENU CASA DOMOTICA ===");
            System.out.println("Scelta: ");

            int scelta = in.nextInt();

            if (scelta == 1) {
                //Scelta della lampadina da parte dell'utente
               Text t = new Text(447, 771, "1");
t.draw();
Text t1 = new Text(279, 555, "2");
t1.draw();
Text t2 = new Text(467, 348, "3");
t2.draw();
Text t3 = new Text(659, 391, "4");
t3.draw();
Text t4 = new Text(801, 481, "5");
t4.draw();
Text t5 = new Text(525, 400, "6");
t5.draw();
Text t6 = new Text(295, 405, "7");
t6.draw();
Text t7 = new Text(345, 338, "8");
t7.draw();
Text t8 = new Text(225, 147, "9");
t8.draw();
Text t9 = new Text(310, 315, "10");
t9.draw();
Text t10 = new Text(145, 315, "11");
t10.draw();
Text t11 = new Text(486, 147, "11");
t11.draw();
Text t12 = new Text(769, 244, "12");
t12.draw();
Text t13 = new Text(704, 106, "14");
t13.draw();
Text t14 = new Text(839, 106, "15");
t14.draw();
Text t15 = new Text(985, 300, "16");
t15.draw();
 

                
                System.out.print("Nome lampadina: ");
                String nome = in.next();

                System.out.print("Potenza in watt: ");
                int pot = in.nextInt();

                System.out.print("Luminosità iniziale (0-100): ");
                int qta = in.nextInt();

                System.out.print("Colore: ");
                String colore = in.next();

                LampadinaIntelligente lamp = new LampadinaIntelligente(nome, pot, qta, colore);

                if (casa.add(lamp))
                    System.out.println("Lampadina aggiunta.");
                else
                    System.out.println("ERRORE: impossibile aggiungere.");

            } else if (scelta == 2) {
                System.out.print("Nome lampadina da rimuovere: ");
                String nome = in.next();
                if (casa.rimuovi(nome))
                    System.out.println("Rimossa correttamente.");
                else
                    System.out.println("Lampadina non trovata.");

            } else if (scelta == 3) {
                System.out.print("Nome lampadina da accendere: ");
                String nome = in.next();
                LampadinaIntelligente l = casa.cerca(nome);
                if (l != null) {
                    l.accendi();
                    System.out.println("Lampadina accesa.");
                } else {
                    System.out.println("Lampadina non trovata.");
                }

            } else if (scelta == 4) {
                System.out.print("Nome lampadina da spegnere: ");
                String nome = in.next();
                LampadinaIntelligente l = casa.cerca(nome);
                if (l != null) {
                    l.spegni();
                    System.out.println("Lampadina spenta.");
                } else {
                    System.out.println("Lampadina non trovata.");
                }

            } else if (scelta == 5) {
                casa.accendiTutte();
                System.out.println("Tutte accese.");

            } else if (scelta == 6) {
                casa.spegniTutte();
                System.out.println("Tutte spente.");

            } else if (scelta == 7) {
                System.out.print("Nome lampadina: ");
                String nome = in.next();
                LampadinaIntelligente l = casa.cerca(nome);
                if (l != null) {
                    System.out.print("Nuova luminosità (0-100): ");
                    int q = in.nextInt();
                    l.setQta_ill(q);
                    System.out.println("Luminosità aggiornata.");
                } else {
                    System.out.println("Lampadina non trovata.");
                }

            } else if (scelta == 8) {
                System.out.print("Nome lampadina: ");
                String nome = in.next();
                LampadinaIntelligente l = casa.cerca(nome);
                if (l != null) {
                    l.aumenta_illuminazione();
                    System.out.println("Luminosità aumentata.");
                } else {
                    System.out.println("Lampadina non trovata.");
                }

            } else if (scelta == 9) {
                System.out.print("Nome lampadina: ");
                String nome = in.next();
                LampadinaIntelligente l = casa.cerca(nome);
                if (l != null) {
                    l.diminuisci_illuminazione();
                    System.out.println("Luminosità diminuita.");
                } else {
                    System.out.println("Lampadina non trovata.");
                }

            } else if (scelta == 10) {
                System.out.print("Nome lampadina: ");
                String nome = in.next();
                LampadinaIntelligente l = casa.cerca(nome);
                if (l != null) {
                    System.out.print("Nuovo colore: ");
                    String col = in.next();
                    l.setColore(col);
                    System.out.println("Colore aggiornato.");
                } else {
                    System.out.println("Lampadina non trovata.");
                }

            } else if (scelta == 11) {
                System.out.println("Potenza attuale: " + casa.getPotenzaAttuale() + " W");

            } else if (scelta == 12) {
                System.out.println("Lampadine presenti: ");
                for (int i = 0; i < casa.getElencoLampadine().size(); i++) {
                    System.out.println("- " + casa.getElencoLampadine().get(i));
                }

            } else if (scelta == 13) {
                try {
                    ObjectOutputStream bs = new ObjectOutputStream(new FileOutputStream("casa.jpg"));
                    bs.close();
                } catch (IOException e) {
                    System.out.println("Il file non è stato trovato, oppure non esiste");
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
