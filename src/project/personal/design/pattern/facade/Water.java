package project.personal.design.pattern.facade;

public class Water {
    public void input() {
        System.out.println("물 투하");
    }
    
    public void boil(double temperature) {
        System.out.println("물 끓이기, 온도: " + temperature);
    }
}
