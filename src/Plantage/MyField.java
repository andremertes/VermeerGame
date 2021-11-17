package Plantage;

public class MyField {  // represents a field on the map, eg grass, rocks, farm houses, fields, ...

    private int ausbauStufe;
    private boolean buildable = false;

    public MyField() {}

    public MyField(boolean buildable) {

        this.buildable = buildable;

    }

    public boolean isBuildable() {

        return this.buildable;

    }

}
