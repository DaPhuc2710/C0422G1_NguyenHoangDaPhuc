package ss7_abstract_interface.thuc_hanh.animal_edible.fruit;

import ss7_abstract_interface.thuc_hanh.animal_edible.animal.Edible;

public class Apple extends Fruit implements Edible {
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}
