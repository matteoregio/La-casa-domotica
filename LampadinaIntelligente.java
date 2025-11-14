//classe lampadaAI

public class LampadinaIntelligente {
    private int potenza;
    private int qta_ill;
    private String nome;
    private String colore;
    private boolean stato;

    public LampadinaIntelligente(int potenza, String nome){
        if(potenza < 0){
            potenza = -potenza;
        }

        this.potenza = potenza;
        this.qta_ill = 50;
        this.nome = nome;
        this.colore = "giallo";
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getColore(){
        return this.colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void accendi(){
        this.stato = true;
    }

    public void spegni(){
        this.stato = false;
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