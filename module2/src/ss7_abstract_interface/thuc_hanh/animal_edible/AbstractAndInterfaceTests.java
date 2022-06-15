package ss7_abstract_interface.thuc_hanh.animal_edible;
import ss7_abstract_interface.thuc_hanh.animal_edible.animal.Animal;
import ss7_abstract_interface.thuc_hanh.animal_edible.animal.Chicken;
import ss7_abstract_interface.thuc_hanh.animal_edible.animal.Edible;
import ss7_abstract_interface.thuc_hanh.animal_edible.animal.Tiger;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal animal : animals) { // vòng lặp foreach
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){ //  instance check xem thử có ghi đè được hay k
                Edible edible=(Chicken)animal; //xét xong rồi thì mình ghìn đè Chicken tại animal
                System.out.println("Chicken\t"+edible.howToEat());
            }

            if (animal instanceof Tiger){ //  instance check xem thử có ghi đè được hay k
                Edible edible=(Tiger)animal; //xét xong rồi thì mình ghìn đè Tiger tại animal
                System.out.println("Tiger\t"+edible.howToEat());
            }
        }
    }
}
