package Plantage;

public class MyField { // represents a field on the map, eg grass, rocks, farm houses, fields, ...

    private Object type;
    private int ausbauStufe;
    protected boolean buildable;
    // protected Object type;
    protected String name;

    public MyField() {}

    public boolean isBuildable() {

        return this.buildable;

    }

}
