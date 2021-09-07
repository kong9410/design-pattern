package project.personal.design.pattern.builder;

public abstract class ProgramLanguageBuilder {
    protected ProgramLanguage programLanguage;

    public ProgramLanguageBuilder create() {
        programLanguage = new ProgramLanguage();
        return this;
    }

    public ProgramLanguage getProgramLanguage() {
        return programLanguage;
    }

    public abstract ProgramLanguageBuilder buildLanguageName();
    public abstract ProgramLanguageBuilder buildLanguageVersion();
}
