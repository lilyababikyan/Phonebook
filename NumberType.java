package phonebook;

public enum NumberType {
    Home("Home number"),
    Mobile("Mobile number"),
    Work("Work number");

    private final String numberType;
    NumberType(String numberType) {
        this.numberType = numberType;
    }
    public String getNumberType() {
        return numberType;
    }
}
