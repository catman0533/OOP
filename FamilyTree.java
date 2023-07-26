

import java.util.ArrayList;
import java.util.List;
    

 public class FamilyTree {
    private List<Person> people;

    public FamilyTree() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public List<Person> getChildrenOfPerson(Person person) {
        List<Person> children = new ArrayList<>();
        for (Person p : people) {
            if (p.getChildren().contains(person)) {
                children.add(p);
            }
        }
        return children;
    }
}

   
