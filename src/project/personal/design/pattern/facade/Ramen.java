package project.personal.design.pattern.facade;

public class Ramen {
    private final String name;

    public Ramen(String name) {
        this.name = name;
    }

    public void ramenName() {
        System.out.println(name + " 라면 입니다");
    }

    public void inputNoodle() {
        System.out.println("라면 투하");
    }

    public void inputStuff() {
        System.out.println("건더기 투하");
    }

    public void inputSoup() {
        System.out.println("스프 투하");
    }
}
