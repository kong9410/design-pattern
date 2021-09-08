package project.personal.design.pattern.facade;

public class Client {
    public void cooking() {
        RamenFacade ramenFacade = new RamenFacade();
        ramenFacade.makeRamen("신");
    }
}
