package MyTest.MyClasses;

public enum Sex {
    MALE("М"), FEMALE("Ж");

    private String translation;

    Sex(String translation) {
        this.translation = translation;
    }
    public String getTranslation() {
        return translation;
    }
}
