package project.personal.design.pattern.builder;

public class Programmer {
    private ProgramLanguageBuilder programLanguageBuilder;

    public void setLanguage(ProgramLanguageBuilder builder) {
        programLanguageBuilder = builder;
    }

    public ProgramLanguage getMyLanguage() {
        return programLanguageBuilder.create()
                .buildLanguageName()
                .buildLanguageVersion()
                .getProgramLanguage();
    }
}
