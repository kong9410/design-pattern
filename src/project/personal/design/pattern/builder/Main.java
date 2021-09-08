package project.personal.design.pattern.builder;

import project.personal.design.pattern.builder.CLanguageBuilder;
import project.personal.design.pattern.builder.JavaLanguageBuilder;
import project.personal.design.pattern.builder.ProgramLanguage;
import project.personal.design.pattern.builder.Programmer;

public class Main {
    public static void main(String[] args) {
        Programmer javaProgrammer = new Programmer();
        JavaLanguageBuilder javaLanguageBuilder = new JavaLanguageBuilder();
        javaProgrammer.setLanguage(javaLanguageBuilder);
        ProgramLanguage java = javaProgrammer.getMyLanguage();

        System.out.println("first programmer use " + java.toString());

        Programmer cProgrammer = new Programmer();
        CLanguageBuilder cLanguageBuilder = new CLanguageBuilder();
        cProgrammer.setLanguage(cLanguageBuilder);
        ProgramLanguage c = cProgrammer.getMyLanguage();

        System.out.println("second programmer use " + c.toString());
    }
}
