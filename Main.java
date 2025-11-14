//lavoro a gruppi, grafica;
//gruppo di: Gabu, Regio, Egeonu

import graphics.*;
import graphics.Picture;
import pictures.*;

public class Main {
    public static void main(String[] args) {

        Picture p = new Picture();
        p.load("planta.png");
        p.draw();

        while (true){
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class MainCasaDomotica {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        CasaDomotica casa = new CasaDomotica(100);     

        while (true) {

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
            System.out.println("0. Esci");
            System.out.print("Scelta: ");

            scelta = in.nextInt();
        
            switch (scelta) {

                case 1: {
                    System.out.print("Nome lampadina: ");
                    String nome = in.nextLine();

                    System.out.print("Potenza in watt: ");
                    int pot = in.nextInt();

                    System.out.print("Luminosità iniziale (0-100): ");
                    int qta = in.nextInt();
                    in.nextLine();

                    System.out.print("Colore: ");
                    String colore = in.nextLine();

                    LampadinaIntelligente lamp = 
                        new LampadinaIntelligente(nome, pot, qta, colore);

                    if (casa.add(lamp))
                        System.out.println("Lampadina aggiunta.");
                    else
                        System.out.println("ERRORE: impossibile aggiungere.");
                    break;
                }

                case 2: {
                    System.out.print("Nome lampadina da rimuovere: ");
                    String nome = in.nextLine();
                    if (casa.rimuovi(nome))
                        System.out.println("Rimossa correttamente.");
                    else
                        System.out.println("Lampadina non trovata.");
                    break;
                }

                case 3: {
                    System.out.print("Nome lampadina da accendere: ");
                    String nome = in.nextLine();
                    LampadinaIntelligente l = casa.cerca(nome);
                    if (l != null) {
                        l.accendi();
                        System.out.println("Lampadina accesa.");
                    } else {
                        System.out.println("Lampadina non trovata.");
                    }
                    break;
                }

                case 4: {
                    System.out.print("Nome lampadina da spegnere: ");
                    String nome = in.nextLine();
                    LampadinaIntelligente l = casa.cerca(nome);
                    if (l != null) {
                        l.spegni();
                        System.out.println("Lampadina spenta.");
                    } else {
                        System.out.println("Lampadina non trovata.");
                    }
                    break;
                }

                case 5:
                    casa.accendiTutte();
                    System.out.println("Tutte accese.");
                    break;

                case 6:
                    casa.spegniTutte();
                    System.out.println("Tutte spente.");
                    break;

                case 7: {
                    System.out.print("Nome lampadina: ");
                    String nome = in.nextLine();
                    LampadinaIntelligente l = casa.cerca(nome);
                    if (l != null) {
                        System.out.print("Nuova luminosità (0-100): ");
                        int q = in.nextInt();
                        l.setQuantita(q);
                        System.out.println("Luminosità aggiornata.");
                    } else {
                        System.out.println("Lampadina non trovata.");
                    }
                    break;
                }

                case 8: {
                    System.out.print("Nome lampadina: ");
                    String nome = in.nextLine();
                    LampadinaIntelligente l = casa.cerca(nome);
                    if (l != null) {
                        l.aumentaLuminosita10();
                        System.out.println("Luminosità aumentata.");
                    } else {
                        System.out.println("Lampadina non trovata.");
                    }
                    break;
                }

                case 9: {
                    System.out.print("Nome lampadina: ");
                    String nome = in.nextLine();
                    LampadinaIntelligente l = casa.cerca(nome);
                    if (l != null) {
                        l.diminuisciLuminosita10();
                        System.out.println("Luminosità diminuita.");
                    } else {
                        System.out.println("Lampadina non trovata.");
                    }
                    break;
                }

                case 10: {
                    System.out.print("Nome lampadina: ");
                    String nome = in.nextLine();
                    LampadinaIntelligente l = casa.cerca(nome);
                    if (l != null) {
                        System.out.print("Nuovo colore: ");
                        String col = in.nextLine();
                        l.setColore(col);
                        System.out.println("Colore aggiornato.");
                    } else {
                        System.out.println("Lampadina non trovata.");
                    }
                    break;
                }

                case 11:
                    System.out.println("Potenza attuale: " + casa.getPotenzaAttuale() + " W");
                    break;

                case 12:
                    System.out.println("Lampadine presenti: ");
                   for (int i = 0; i < casa.getElencoLampadine().size(); i++) {
                        System.out.println("- " + casa.getElencoLampadine().get(i));
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }
}
