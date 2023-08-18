package java.com.example.demo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class People <PersonType extends Person> implements Iterable<Person> {

    private List<PersonType> personList;
    public People(List<PersonType> personList) {
        this.personList = personList;
    }
    public People(PersonType... person) {
        Arrays.stream(person).toList().forEach(p -> this.personList.add(p));
    }

    public void add(PersonType person) {
        this.personList.add(person);
    }

    public void remove(PersonType person) {
        personList.remove(person);
    }

    public int size() {
        return this.personList.size();
    }

    public void clear() {
//        personList.stream().forEach(p -> this.personList.remove(p));
        this.personList.clear();
    }

    public void addAll(Iterable <PersonType> peopleList) {
        this.personList.addAll((Collection<? extends PersonType>) peopleList);
    }

    public PersonType findById(long id) {
        return this.personList.stream().filter(p -> p.getId() == id).findAny().get();
    }

    public List<PersonType> findAll() {
        return this.personList;
    }

}
