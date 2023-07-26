
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты класса Person для представления людей в генеалогическом древе
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Jane", "Doe");
        Person person3 = new Person("Alice", "Doe");

        // Добавляем person2 и person3 в список детей person1
        person1.addChild(person2);
        person1.addChild(person3);

        // Создаем объект класса FamilyTree и добавляем все объекты Person в него
        FamilyTree familyTree = new FamilyTree();
        familyTree.addPerson(person1);
        familyTree.addPerson(person2);
        familyTree.addPerson(person3);

        // Получаем список детей person1 и выводим их имена на консоль
        List<Person> children = familyTree.getChildrenOfPerson(person1);
        System.out.println("Children of " + person1.getFirstName() + ":");
        for (Person child : children) {
            System.out.println(child.getFirstName() + " " + child.getLastName());
        }
    }
}
