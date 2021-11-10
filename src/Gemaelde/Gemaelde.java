package Gemaelde;

public class Gemaelde {

    private double price;
    private int fakeLevel;  // + Wahrscheinlichkeit
    private String name;
    private String painter;

    public Gemaelde(String name, String painter, double price, int fakeLevel) {

        this.name = name;
        this.painter = painter;
        this.price = price;
        this.fakeLevel = fakeLevel;

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

}
