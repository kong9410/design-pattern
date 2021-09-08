package project.personal.design.pattern.facade;

public class RamenFacade {
    public void makeRamen(String name) {
        Ramen ramen = new Ramen(name);
        ramen.ramenName();

        Pot pot = new Pot();
        pot.putOn();

        Water water = new Water();
        water.input();

        Burner burner = new Burner();
        burner.inputGas();
        burner.ignite();

        water.boil(100);

        ramen.inputStuff();
        ramen.inputSoup();
        ramen.inputNoodle();

        burner.extinguish();

        System.out.println("냠냠");
    }
}
