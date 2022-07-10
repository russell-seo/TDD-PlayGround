package pluscalculate;

public enum GubunType {
    comma(","),
    colon(";");

    private String type;

    GubunType(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
