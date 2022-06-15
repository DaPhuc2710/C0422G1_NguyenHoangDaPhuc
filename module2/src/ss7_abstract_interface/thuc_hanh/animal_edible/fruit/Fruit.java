package ss7_abstract_interface.thuc_hanh.animal_edible.fruit;

import ss7_abstract_interface.thuc_hanh.animal_edible.animal.Edible;

public abstract class Fruit implements Edible {
    public static void main(String[] args) {
        Fruit[] fruits=new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }

}
