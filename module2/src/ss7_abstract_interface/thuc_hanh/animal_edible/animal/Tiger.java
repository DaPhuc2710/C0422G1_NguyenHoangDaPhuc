package ss7_abstract_interface.thuc_hanh.animal_edible.animal;

public class Tiger extends Animal implements Edible {
    @Override // ghì đè lên phương thức makeSound của class abstract Animal
    public String makeSound() {
        return "Tiger:Roarrrrrrrrr!";
    }

    @Override
    public String howToEat() {
        return "is danger!, can not eat";
    }
}
