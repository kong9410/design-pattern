package project.personal.design.pattern.builder;

public class CLanguageBuilder extends ProgramLanguageBuilder {
    @Override
    public ProgramLanguageBuilder buildLanguageName() {
        programLanguage.setLanguage("C");
        return this;
    }

    @Override
    public ProgramLanguageBuilder buildLanguageVersion() {
        programLanguage.setVersion("0.1");
        return this;
    }
}
