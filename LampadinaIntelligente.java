//classe lampadaAI

import java.awt.*;
import java.io.Serializable;

public class LampadinaIntelligente implements Serializable {
    private int potenza;
    private int qta_ill;
    private String nome;
    private Color colore;
    public boolean stato;

    public LampadinaIntelligente(String nome, int potenza, int qta_ill, Color colore){
        if(potenza < 0){
            potenza = -potenza;
        }

        this.potenza = potenza;
        this.qta_ill = qta_ill;
        this.nome = nome;
        this.colore = colore;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Color getColore(){
        return this.colore;
    }

    public int getQta_ill() {
        return qta_ill;
    }

    public void setQta_ill(int qta_ill) {
        this.qta_ill = qta_ill;
    }

    public int getPotenza() {
        return potenza;
    }

    public void setColore(Color colore) {
        this.colore = colore;
    }

    public void accendi(){
        this.stato = true;
    }

    public void spegni(){
        this.stato = false;
    }

    public boolean isAccesa(){
        return stato;
    }

    public void aumenta_illuminazione(){
        if(qta_ill <= 90 && qta_ill > 0)
            this.qta_ill += 10;
        else{
            this.qta_ill = 100;
        }
    }

    public void diminuisci_illuminazione(){
        if(qta_ill > 10 && qta_ill < 100)
            this.qta_ill -= 10;
        else
            this.qta_ill = 0;
    }

    @Override
    public String toString(){
        String risposta;
        if(stato)
            risposta = "accesa";
        else
            risposta = "spenta";

        return "Nome: " + this.nome + ", Potenza: " + this.potenza + ", Stato: " + risposta + ", Quantità illuminazione: " + this.qta_ill + "%" + ", Colore: " + this.colore;
    }
}
