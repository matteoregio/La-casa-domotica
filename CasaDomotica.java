import java.util.ArrayList;

public class CasaDomotica {
    private ArrayList<LampadinaIntelligente> l;
    private int max_lamp;

    public CasaDomotica() {
        this.l = new ArrayList<>();
        this.max_lamp = 100;
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
