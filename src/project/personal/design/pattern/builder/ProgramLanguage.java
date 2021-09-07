package project.personal.design.pattern.builder;

public class ProgramLanguage {
    private String language;
    private String version;

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "ProgramLanguage{" +
                "language='" + language + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
