package project.personal.design.pattern.facade;

public class Burner {
    public void inputGas() {
        System.out.println("가스 넣기");
    }

    public void ignite() {
        System.out.println("점화");
    }

    public void extinguish() {
        System.out.println("불 끄기");
    }
}
