package MyTest.MyClasses;

public enum Specialty implements GetTranslate {
    MANAGER("Манагер"), ENGINEER("Инженер"), DEVOPS("Разработчик");
    private String translate;

    Specialty(String translate) {
        this.translate = translate;
    }


    @Override
    public String getTranslate() {
        return translate;
    }
}
