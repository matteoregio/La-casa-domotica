import graphics.*;
import java.util.ArrayList;
import java.util.Scanner;

// public void setpos(double x, double y){
//         this.x = x;
//         this.y = y;
//         Canvas.getInstance().repaint();
//     }

public class CasaDomotica {
    public ArrayList<LampadinaIntelligente> l;
    private final int max_lamp;

    public CasaDomotica() {
        this.l = new ArrayList<>();
        this.max_lamp = 100;
    }

    public static Color ColoreLampadina(String c) {
        c = c.toLowerCase();
        Color colore;
        if (c.equals("nero")) {
            colore = Color.BLACK;
            return colore;
        } else if (c.equals("bianco")) {
            colore = Color.WHITE;
            return colore;
        } else if (c.equals("blu")) {
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
    public static void caricaLampadina(ArrayList <Integer> v, int n){
        Scanner in = new Scanner(System.in);
        int conta = 0;
        for(int i = 0; i < v.size(); i++){
            if(conta != 0){
                if(n == v.get(i) && n >= 16 || n <= 0){
                    System.out.println("Il valore non è valido, inserisci un altro valore");
                    n = in.nextInt();
                }
            }
            v.add(conta, n);
            conta++;
        }
    }

    public static void disegna(int l, LampadinaIntelligente lamp){
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
            Ellipse e = new Ellipse(443, 805, 17, 17);
            e.setColor(lamp.getColore());
            e.fill();
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-470, -470);
            dis.translate(-60, 290);
            dis.draw();
        }

        if(l == 2){    // Camera1
            Ellipse e = new Ellipse(273, 550, 17, 17);
            e.setColor(lamp.getColore());
            e.fill();
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(-230, 40);
            dis.draw();
        }

        if(l == 3){    // Corridoio centro
            Ellipse e = new Ellipse(462, 379, 17, 17);
            e.setColor(lamp.getColore());
            e.fill();
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(-40, -130);
            dis.draw();
        }

        if(l == 4){    // Tavolo cucina (659, 391)
            Ellipse e = new Ellipse(652, 391, 17, 17);
            e.setColor(lamp.getColore());
            e.fill();
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(148, -118);
            dis.draw();
        }

        if(l == 5){    // Sala (801, 481)
            Ellipse e = new Ellipse(801, 481, 17, 17);
            e.setColor(lamp.getColore());
            e.fill();
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(298, -30);
            dis.draw();
        }

        if(l == 6){    // Striscia led (532, 493)
            Rectangle r = new Rectangle(532, 362, 7, 131);
            r.setColor(lamp.getColore());
            r.fill();
        }

        if(l == 7){    // Bagno grande centro (295,405)
            Ellipse e = new Ellipse(295, 405, 17, 17);
            e.setColor(lamp.getColore());
            e.fill();
            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(-208, -103);
            dis.draw();
        }

        if(l == 8){    // Bagno grande led sinistra (338,338)
            Rectangle r = new Rectangle(338, 338, 37, 7);
            r.setColor(lamp.getColore());
            r.fill();
        }

        if(l == 9){   // Matrimoniale centro (225,147)
            Ellipse e = new Ellipse(224, 162, 17, 17);
            e.setColor(Color.GREEN);
            e.fill();

            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(-280, -350);
            dis.draw();
        }

        if(l == 10){   // Matrimoniale abatjour destra (310,315)
            Ellipse e = new Ellipse(304, 309, 10, 10);
            e.setColor(lamp.getColore());
            e.fill();

            Ellipse e1 = new Ellipse(304, 309, 12, 12);
            e1.setColor(Color.BLACK);
            e1.draw();
        }

        if(l == 11){   // Matrimoniale abatjour sinistra (145,315)
            Ellipse e1 = new Ellipse(139, 309, 12, 12);
            e1.setColor(Color.BLACK);
            e1.draw();

            Ellipse e = new Ellipse(140, 310, 11, 11);
            e.setColor(lamp.getColore());
            e.fill();
        }

        if(l == 12){   // Bagno piccolo (486,147)
            Ellipse e = new Ellipse(486, 147, 17, 17);
            e.setColor(Color.GREEN);
            e.fill();

            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(-17, -361);
            dis.draw();
        }

        if(l == 13){   // Camera doppia centro (769,244)
            Ellipse e = new Ellipse(769, 244, 17, 17);
            e.setColor(Color.GREEN);
            e.fill();

            Picture dis = new Picture("lampada1.jpeg");
            dis.grow(-480, -480);
            dis.translate(267, -265);
            dis.draw();
        }

        if(l == 14){   // Camera doppia abatjour sinistra (704,106)
            Ellipse e = new Ellipse(698, 99, 12, 12);
            e.setColor(Color.BLACK);
            e.draw();

            Ellipse e1 = new Ellipse(698, 99, 11, 11);
            e1.setColor(lamp.getColore());
            e1.fill();
        }

        if(l == 15){   // Camera doppia abatjour destra (839,106)
            Ellipse e = new Ellipse(833, 100, 12, 12);
            e.setColor(Color.BLACK);
            e.draw();

            Ellipse e1 = new Ellipse(833, 100, 11, 11);
            e1.setColor(lamp.getColore());
            e1.fill();
        }

        if(l == 16){   // Balcone led (1001,163)
            Rectangle r = new Rectangle(994, 165, 7, 381);
            r.setColor(lamp.getColore());
            r.fill();
        }

    }

    public void sceltaUno(ArrayList <Integer> v){
        Scanner in = new Scanner(System.in);
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
                        Ingresso (1)
                        camera1 (2)
                        corridoio centro (3)
                        tavolo cucina (4)
                        sala (5)
                        striscia led cucina (6)
                        bagno grande centro (7)
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
        caricaLampadina(v, lampaScelta);

        LampadinaIntelligente lamp = new LampadinaIntelligente(nome, pot, qta, c);
        disegna(lampaScelta,lamp);
        this.l.add(lamp);

        t1.setText("");
        t1.draw();
        t2.setText("");
        t2.draw();
        t3.setText("");
        t3.draw();
        t4.setText("");
        t4.draw();
        t5.setText("");
        t5.draw();
        t6.setText("");
        t6.draw();
        t7.setText("");
        t7.draw();
        t8.setText("");
        t8.draw();
        t9.setText("");
        t9.draw();
        t10.setText("");
        t10.draw();
        t11.setText("");
        t11.draw();
        t12.setText("");
        t12.draw();
        t13.setText("");
        t13.draw();
        t14.setText("");
        t14.draw();
        t15.setText("");
        t15.draw();
        t16.setText("");
        t16.draw();
    }

    public void sceltaDue(CasaDomotica c){
        Scanner in = new Scanner(System.in);
        System.out.print("Nome lampadina da rimuovere: ");
        String nome = in.next();
        if (c.rimuovi(nome))
            System.out.println("Rimossa correttamente.");
        else
            System.out.println("Lampadina non trovata.");
    }

    public void sceltaTre(CasaDomotica c){
        Scanner in = new Scanner(System.in);
        System.out.print("Nome lampadina da accendere: ");
        String nome = in.next();
        LampadinaIntelligente l = c.cerca(nome);
        if (l != null) {
            l.accendi();
            System.out.println("Lampadina accesa.");
        } else {
            System.out.println("Lampadina non trovata.");
        }

    }

    public void sceltaQuattro(CasaDomotica c){
        Scanner in = new Scanner(System.in);
        System.out.print("Nome lampadina da spegnere: ");
        String nome = in.next();
        LampadinaIntelligente l = c.cerca(nome);
        if (l != null) {
            l.spegni();
            System.out.println("Lampadina spenta.");
        } else {
            System.out.println("Lampadina non trovata.");
        }

    }

    public void sceltaSette(CasaDomotica c){
        Scanner in = new Scanner(System.in);
        System.out.print("Nome lampadina: ");
        String nome = in.next();
        LampadinaIntelligente l = c.cerca(nome);
        if (l != null) {
            l.aumenta_illuminazione();
            System.out.println("Luminosità aumentata.");
        } else {
            System.out.println("Lampadina non trovata.");
        }
    }

    public void sceltaOtto(CasaDomotica c){
        Scanner in = new Scanner(System.in);
        System.out.print("Nome lampadina: ");
        String nome = in.next();
        LampadinaIntelligente l = c.cerca(nome);
        if (l != null) {
            l.diminuisci_illuminazione();
            System.out.println("Luminosità diminuita.");
        } else {
            System.out.println("Lampadina non trovata.");
        }
    }

    public void sceltaNove(CasaDomotica ca){
        Scanner in  = new Scanner(System.in);
        System.out.print("Nome lampadina: ");
        String nome = in.next();
        LampadinaIntelligente l = ca.cerca(nome);
        if (l != null) {
            System.out.print("Nuovo colore: ");
            String col = in.next();
            Color c = ca.ColoreLampadina(col);
            l.setColore(c);
            System.out.println("Colore aggiornato.");
        } else {
            System.out.println("Lampadina non trovata.");
        }
    }

    public CasaDomotica(int max_lamp) {
        if (max_lamp < 1)
            max_lamp = 100;

        this.max_lamp = max_lamp;
        this.l = new ArrayList<>();
    }

    public boolean add(LampadinaIntelligente lamp) {
        if (l.size() >= max_lamp)
            return false;

        if (cerca(lamp.getNome()) != null)
            return false;

        l.add(lamp);
        return true;
    }

    public LampadinaIntelligente cerca(String nome) {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getNome().equalsIgnoreCase(nome)) {
                return l.get(i);
            }
        }
        return null;
    }

    public boolean rimuovi(String nome) {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getNome().equalsIgnoreCase(nome)) {
                l.remove(i);
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> getElencoLampadine() {
        ArrayList<String> nomi = new ArrayList<>();

        for (int i = 0; i < l.size(); i++) {
            nomi.add(l.get(i).getNome());
        }

        return nomi;
    }

    public void accendiTutte() {
        for (int i = 0; i < l.size(); i++) {
            l.get(i).accendi();
        }
    }

    public void spegniTutte() {
        for (int i = 0; i < l.size(); i++) {
            l.get(i).spegni();
        }
    }

    public float getPotenzaAttuale() {
        float pot = 0;

        for (int i = 0; i < l.size(); i++) {
            LampadinaIntelligente lamp = l.get(i);

            if (lamp.isAccesa()) {
                pot += lamp.getPotenza() * (lamp.getQta_ill() / 100.0f);
            }
        }

        return pot;
    }

    @Override
    public String toString() {
        return "Sistema domotico con " + l.size() +
                " lampadine, su un massimo di " + max_lamp;
    }
}
