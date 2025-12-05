import graphics.Ellipse;
import graphics.Picture;
import graphics.*;

public class DisegnaLampadina {
    private Ellipse c;
    private Ellipse c1;
    private Rectangle r;
    private Picture p;

    public DisegnaLampadina(int l, LampadinaIntelligente lamp){
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
            c = new Ellipse(443, 805, 17, 17);
            c.setColor(lamp.getColore());
            c.fill();
            p = new Picture("lampada1.jpeg");
            p.grow(-470, -470);
            p.translate(-60, 290);
            p.draw();
        }

        if(l == 2){    // Camera1
            c = new Ellipse(273, 550, 17, 17);
            c.setColor(lamp.getColore());
            c.fill();
            p = new Picture("lampada1.jpeg");
            p.grow(-480, -480);
            p.translate(-230, 40);
            p.draw();
        }

        if(l == 3){    // Corridoio centro
            c = new Ellipse(462, 379, 17, 17);
            c.setColor(lamp.getColore());
            c.fill();
            p = new Picture("lampada1.jpeg");
            p.grow(-480, -480);
            p.translate(-40, -130);
            p.draw();
        }

        if(l == 4){    // Tavolo cucina (659, 391)
            c = new Ellipse(652, 391, 17, 17);
            c.setColor(lamp.getColore());
            c.fill();
            p = new Picture("lampada1.jpeg");
            p.grow(-480, -480);
            p.translate(148, -118);
            p.draw();
        }

        if(l == 5){    // Sala (801, 481)
            c = new Ellipse(801, 481, 17, 17);
            c.setColor(lamp.getColore());
            c.fill();
            p = new Picture("lampada1.jpeg");
            p.grow(-480, -480);
            p.translate(298, -30);
            p.draw();
        }

        if(l == 6){    // Striscia led (532, 493)
            r = new Rectangle(532, 362, 7, 131);
            r.setColor(lamp.getColore());
            r.fill();
        }

        if(l == 7){    // Bagno grande centro (295,405)
            c = new Ellipse(295, 405, 17, 17);
            c.setColor(lamp.getColore());
            c.fill();
            p = new Picture("lampada1.jpeg");
            p.grow(-480, -480);
            p.translate(-208, -103);
            p.draw();
        }

        if(l == 8){    // Bagno grande led sinistra (338,338)
            r = new Rectangle(338, 338, 37, 7);
            r.setColor(lamp.getColore());
            r.fill();
        }

        if(l == 9){   // Matrimoniale centro (225,147)
            c = new Ellipse(224, 162, 17, 17);
            c.setColor(Color.GREEN);
            c.fill();

            p = new Picture("lampada1.jpeg");
            p.grow(-480, -480);
            p.translate(-280, -350);
            p.draw();
        }

        if(l == 10){   // Matrimoniale abatjour destra (310,315)
            c = new Ellipse(304, 309, 10, 10);
            c.setColor(lamp.getColore());
            c.fill();

            c1 = new Ellipse(304, 309, 12, 12);
            c1.setColor(Color.BLACK);
            c1.draw();
        }

        if(l == 11){   // Matrimoniale abatjour sinistra (145,315)
            c1 = new Ellipse(139, 309, 12, 12);
            c1.setColor(Color.BLACK);
            c1.draw();

            c = new Ellipse(140, 310, 11, 11);
            c.setColor(lamp.getColore());
            c.fill();
        }

        if(l == 12){   // Bagno piccolo (486,147)
            c = new Ellipse(486, 147, 17, 17);
            c.setColor(Color.GREEN);
            c.fill();

            p = new Picture("lampada1.jpeg");
            p.grow(-480, -480);
            p.translate(-17, -361);
            p.draw();
        }

        if(l == 13){   // Camera doppia centro (769,244)
            c = new Ellipse(769, 244, 17, 17);
            c.setColor(Color.GREEN);
            c.fill();

            p = new Picture("lampada1.jpeg");
            p.grow(-480, -480);
            p.translate(267, -265);
            p.draw();
        }

        if(l == 14){   // Camera doppia abatjour sinistra (704,106)
            c = new Ellipse(698, 99, 12, 12);
            c.setColor(Color.BLACK);
            c.draw();

            c1 = new Ellipse(698, 99, 11, 11);
            c1.setColor(lamp.getColore());
            c1.fill();
        }

        if(l == 15){   // Camera doppia abatjour destra (839,106)
            c = new Ellipse(833, 100, 12, 12);
            c.setColor(Color.BLACK);
            c.draw();

            c1 = new Ellipse(833, 100, 11, 11);
            c1.setColor(lamp.getColore());
            c1.fill();
        }

        if(l == 16){   // Balcone led (1001,163)
            r = new Rectangle(994, 165, 7, 381);
            r.setColor(lamp.getColore());
            r.fill();
        }

    }


    public void remove() {
        p.remove();
        c.remove();
        r.remove();
    }
}
