package ru.ilka.miumodernweb.entity;

public enum LanguageEnum {
    ENG("eng"),
    RUS("rus");

    private final String displayedName;

    LanguageEnum(String displayedName) {
        this.displayedName = displayedName;
    }

    public String getDisplayedName() {
        return displayedName;
    }

    public static LanguageEnum getByDisplayedName(String displayedName) {
        for (int i = 0; i < values().length; i++) {
            if (displayedName.equals(values()[i].displayedName)) {
                return values()[i];
            }
        }
        return RUS;
    }
}
