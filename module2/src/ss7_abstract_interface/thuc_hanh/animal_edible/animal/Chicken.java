package ss7_abstract_interface.thuc_hanh.animal_edible.animal;

public class Chicken extends Animal implements Edible {
    @Override // ghì đè lên phương thức makeSound của class abstract Animal
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }
    @Override //ghì đè lên phương thức howToEat của Implement Edible
    public String howToEat() {
        return "could be fried";
    }
}
