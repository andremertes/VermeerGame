package Player;

import Finanzen.Aktie;
import Gemaelde.Gemaelde;
import Plantage.Plantage;

import java.util.HashMap;
import java.util.Vector;

public class Player {

    public static final int KNOWLEDGE_LEVELS = 3;

    private String name;
    private double money;
    private int knowledge;
    private boolean isInGame;
    private double hypothek;
    private HashMap<Integer, Plantage> plantagen;
    private HashMap<Integer, Aktie> aktien;
    // private HashMap<Integer, Gemaelde> gemaelde = new HashMap<Integer,Gemaelde>();
    private Vector paintings;

    public Player(String name) {

        this.name = name;
        this.money = 50000;
        this.knowledge = 0;
        this.isInGame = true;
        this.hypothek = 0;
        this.paintings = new Vector();
        this.plantagen = new HashMap<Integer, Plantage>();
        this.aktien = new HashMap<Integer, Aktie>();

    }

    public double getMoney() {

        return this.money;

    }

    public void addMoney(double m) {

        this.money += m;

    }

    public void subtractMoney(double m) {

        if (this.money - m >= 0) {
            this.money -= m;
        } else {
            setGameOver();
        }

    }

    public void addPlantage(int i, Plantage p) {

        this.plantagen.put(i,p);

    }

    public void removePlantage(int i) {

        this.plantagen.remove(i);

    }

    public Plantage getPlantage(int i) {

        return this.plantagen.get(i);

    }

    public int getAnzahlPlantagen() {

        return this.plantagen.size();

    }

    public void addAktie(int i, Aktie a) {

        this.aktien.put(i,a);

    }

    public void removeAktie(int i) {

        this.aktien.remove(i);

    }

    public Aktie getAktie(int i) {

        return this.aktien.get(i);

    }

    public int getAnzahlAktien() {

        return this.aktien.size();

    }

    public void addGemaelde(/*int i,*/ Gemaelde g) {

        //this.gemaelde.put(i,g);
        this.paintings.add(g);

    }

    public void removeGemaelde(int i) {

        //this.gemaelde.remove(i);
        this.paintings.remove(i);

    }

    /*public Gemaelde getGemaelde(int i) {

        //return this.gemaelde.get(i);
        return this.paintings.get(i);

    }*/

    public Object getGemaelde(int i) {

        return this.paintings.get(i);

    }

    public int getAnzahlGemaelde() {

        //return this.gemaelde.size();
        return this.paintings.size();

    }

    public void increaseHypothek(double value) {

        if (value < 0) {
            this.hypothek -= value;
        } else {
            this.hypothek += value;
        }

    }

    public void decreaseHypothek(double value) {

        if (value < 0) {
            this.hypothek -= value;
        } else {
            this.hypothek += value;
        }

    }

    public double getHypotheHoehe() {

        return this.hypothek;

    }

    public void setEducatedKunstgutachter() {

        this.knowledge++;

    }

    public int getKunstKennerStatus() {

        return this.knowledge;

    }

    public void setInGame() {

        this.isInGame = true;

    }

    public boolean getIngameStatus() {

        return this.isInGame;

    }

    public void setGameOver() {

        this.isInGame = false;

    }

}
