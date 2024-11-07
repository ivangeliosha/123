package AllFiles.dao;

import AllFiles.models.Person;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDao {
    private final List<Person> people;
    private static int cntID;
    {
        people = new ArrayList<>();
        people.add(new Person(++cntID,"John"));
        people.add(new Person(++cntID,"Jane"));
        people.add(new Person(++cntID,"Bob"));
    }

    public List<Person> all() {
        return people;
    }

    public String user(int id){
        return people.get(id).getName();
    }
}
