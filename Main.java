//lavoro a gruppi, grafica;
//gruppo di: Gabu, Regio, Egeonu

import graphics.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static Color ColoreLampadina(String c) {
        c = c.toLowerCase();
        Color colore;
        if (c.equals("nero")) {
            colore = Color.BLACK;
            return colore;
        } else if (c.equals("bianco")) {
            colore = Color.WHITE;
            return colore;
        } else if (c.equals("blue")) {
            colore = Color.BLUE;
            return colore;
        } else if (c.equals("rosso")) {
            colore = Color.RED;
            return colore;
        } else if (c.equals("verde")) {
            colore = Color.GREEN;
            return colore;
        } else {
            System.out.println("Colore non valido!!");
            return null;
        }
    }

    //non faccio il controllo al primo inserimento
    public static void caricaLampadina(Arraylist <Integer> v, int n){
        int conta = 0;
        for(int i = 0; i < v.size(); i++){
            if(conta != 0){
                if(n == v.get(i) && n >= 16 || n <= 0){
                   System.out.println("Il valore non è valido, inserisci un altro valore");
                   n = in.nextInt();
                   }
            }
               v.add(conta) = n;
               conta++;
        }
    }
    
    public static void disegna(int l){
//        Ingresso: 447, 771
//        Camera1: 279, 555
//        Corridoio centro: 467, 348
//        Tavolo cucina: 659, 391
//        Sala: 801, 481
//        Striscia led: (532, 493), (532, 362)
//        Bagno grande centro: 295, 405
//        Bagno grande led: (338, 338), (375, 338)
//        Matrimoniale centro: 225, 147
//        Matrimoniale abatjour destra: 310, 315
//        Matrimoniale abatjour sinistra: 145, 315
//        Bagno piccolo: 486, 147
//        Camera doppia centro: 769, 244
//        Camera doppia abatjour sinistra: 704, 106
//        Camera doppia abatjour destra: 839, 106
//        Balcone led: (1001, 163), (1001, 544)

        if(l == 1){    // Ingresso
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-470, -470);
            dis.translate(-60, 290);
            dis.draw();
        }

        if(l == 2){    // Camera1
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(-230, 40);
            dis.draw();
        }

        if(l == 3){    // Corridoio centro
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(-40, -130);
            dis.draw();
        }

        if(l == 4){    // Tavolo cucina (659, 391)
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(160, -80);
            dis.draw();
        }

        if(l == 5){    // Sala (801, 481)
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(300, 10);
            dis.draw();
        }

        if(l == 6){    // Striscia led (532, 493)
            Rectangle r = new Rectangle(532, 362, 7, 131);
            r.draw();
        }

        if(l == 7){    // Bagno grande centro (295,405)
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(-210, -70);
            dis.draw();
        }

        if(l == 8){    // Bagno grande led sinistra (338,338)
            Rectangle r = new Rectangle(338, 338, 37, 7);
            r.draw();
        }

        if(l == 9){   // Matrimoniale centro (225,147)
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(-280, -330);
            dis.draw();
        }

        if(l == 10){   // Matrimoniale abatjour destra (310,315)
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(-195, -165);
            dis.draw();
        }

        if(l == 11){   // Matrimoniale abatjour sinistra (145,315)
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(-360, -165);
            dis.draw();
        }

        if(l == 12){   // Bagno piccolo (486,147)
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(-30, -330);
            dis.draw();
        }

        if(l == 13){   // Camera doppia centro (769,244)
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(270, -230);
            dis.draw();
        }

        if(l == 14){   // Camera doppia abatjour sinistra (704,106)
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(210, -370);
            dis.draw();
        }

        if(l == 15){   // Camera doppia abatjour destra (839,106)
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(345, -370);
            dis.draw();
        }

        if(l == 16){   // Balcone led (1001,163)
            Rectangle r = new Rectangle(994, 165, 7, 381);
            r.draw();
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        CasaDomotica casa = new CasaDomotica(100);
        boolean flag = true;

        Picture p = new Picture("casa.jpg");
        p.draw();

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
            System.out.println("0. Esci");
            System.out.println("=== MENU CASA DOMOTICA ===");
            System.out.println("Scelta: ");

            int scelta = in.nextInt();
            ArrayList <Integer> lampadine = new ArrayList<>(16);

            if (scelta == 1) {
                //Scelta della lampadina da parte dell'utente
                {
                    Text t1  = new Text(447, 771, "1");  t1.draw();
                    Text t2  = new Text(279, 555, "2");  t2.draw();
                    Text t3  = new Text(467, 348, "3");  t3.draw();
                    Text t4  = new Text(659, 391, "4");  t4.draw();
                    Text t5  = new Text(801, 481, "5");  t5.draw();
                    Text t6  = new Text(532, 493, "6");  t6.draw();
                    Text t7  = new Text(295, 405, "7");  t7.draw();
                    Text t8  = new Text(345, 338, "8");  t8.draw();
                    Text t9  = new Text(225, 147, "9");  t9.draw();
                    Text t10 = new Text(310, 315, "10"); t10.draw();
                    Text t11 = new Text(145, 315, "11"); t11.draw();
                    Text t12 = new Text(486, 147, "12"); t12.draw();
                    Text t13 = new Text(769, 244, "13"); t13.draw();
                    Text t14 = new Text(704, 106, "14"); t14.draw();
                    Text t15 = new Text(839, 106, "15"); t15.draw();
                    Text t16 = new Text(985, 300, "16"); t16.draw();

//funzione che "cancella" i numeri dell'immagine
//                    t2.setText("");
//                    t2.draw();
//                    t3.setText("");
//                    t3.draw();
//                    t4.setText("");
//                    t4.draw();
//                    t5.setText("");
//                    t5.draw();
//                    t6.setText("");
//                    t6.draw();
//                    t7.setText("");
//                    t7.draw();
//                    t8.setText("");
//                    t8.draw();
//                    t9.setText("");
//                    t9.draw();
//                    t10.setText("");
//                    t10.draw();
//                    t11.setText("");
//                    t11.draw();
//                    t12.setText("");
//                    t12.draw();
//                    t13.setText("");
//                    t13.draw();
//                    t14.setText("");
//                    t14.draw();
//                    t15.setText("");
//                    t15.draw();
//                    t16.setText("");
//                    t16.draw();

                }

                System.out.print("Nome lampadina: ");
                String nome = in.next();
                System.out.print("Potenza in watt: ");
                int pot = in.nextInt();
                System.out.print("Luminosità iniziale (0-100): ");
                int qta = in.nextInt();
                System.out.print("Colore: ");
                String colore = in.next();
                Color c = ColoreLampadina(colore);
                System.out.println("Scegli la tua lampadina: ");
                System.out.println("""
                        Ingresso: 447, 771 (1)
                        camera1 (2)
                        corridoio centro (3)
                        tavolo cucina (4)
                        sala (5)\
                        striscia led cucina (6)\
                        bagno grande centro (7)\
                        bagno grande led (8)
                        matrimoniale centro (9)
                        matrimoniale abatjour destra (10)
                        matrimoniale abatjour sinistra (11)
                        bagno piccolo (12)
                        camera doppia centro (13)
                        camera doppia abatjour sinistra (14)
                        camera doppia abatjour destra (15)
                        balcone led (16)""");

                //controllo della lampadina in caso abbia un valore non valido oppure è già stata inserita
                int lampaScelta = in.nextInt();
                caricaLampadina(lampadine, lampaScelta);
                

                disegna(lampaScelta);
                LampadinaIntelligente lamp = new LampadinaIntelligente(nome, pot, qta, c);

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
                    Color c = ColoreLampadina(col);
                    l.setColore(c);
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

            } else if (scelta == 0) {
                flag = false;
            } else {
                System.out.println("Scelta non valida.");
            }
        }
        System.exit(0);
    }
}
