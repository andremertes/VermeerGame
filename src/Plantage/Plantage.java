package Plantage;

import Plants.Plant;

public class Plantage { // represents the land where the player builds fields and farm houses

    private Plant[] plants; // plants that will grow
    private String location;

    private MyField[][] field;  // field

    public Plantage(String loc) {

        plants = new Plant[2];
        //field = new MyField[16][16];
        field = new MyField[5][5];
        this.location = loc;
        setPlants();

    }

    private void setPlants() {

        // (int) Math.random() * 6 + 1;

    }

    public void getPlants() {

    }

    public String getLocation() {

        return this.location;

    }

    public void setField(int posX, int posY, MyField field) {

        this.field[posY][posX] = field;

    }

    public MyField[][] getField() {

        return this.field;

    }

    public MyField getField(int posX, int posY) {

        return this.field[posY][posX];

    }



}
