package Gemaelde;

import Player.Player;

public class Gemaelde {

    private double price;
    private int fakeLevel;  // + Wahrscheinlichkeit
    private boolean isFake;
    private String name;
    private String painter;

    public Gemaelde(String name, String painter, double price, boolean isFake) {

        this.name = name;
        this.painter = painter;
        this.price = price;
        this.isFake = isFake;

        if (isFake) {
            this.fakeLevel = generateFakeLevel();
        } else {
            this.fakeLevel = -1;
        }

    }

    // Generelles Fakelevel... Unabhängig von Spieler-Knowledge
    private int generateFakeLevel() {

        return (int) Math.random() * (Player.KNOWLEDGE_LEVELS + 1);

    }

    public String getName() {

        return this.name;

    }

    public String getPainter() {

        return this.painter;

    }

    public double getPrice() {

        return this.price;

    }

    public int getFakeLevel() {

        return this.fakeLevel;

    }

    public boolean isFake() {

        return this.isFake;

    }

}
