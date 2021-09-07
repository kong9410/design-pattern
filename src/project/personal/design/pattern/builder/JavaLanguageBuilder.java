package project.personal.design.pattern.builder;

public class JavaLanguageBuilder extends ProgramLanguageBuilder {
    @Override
    public ProgramLanguageBuilder buildLanguageName() {
        programLanguage.setLanguage("Java");
        return this;
    }

    @Override
    public ProgramLanguageBuilder buildLanguageVersion() {
        programLanguage.setVersion("0.1");
        return this;
    }
}
