package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;

public abstract class People <PersonType extends Person> implements Iterable<Person> {

    private List<PersonType> personList = new ArrayList<>();
    public People(List<PersonType> personList) {
        this.personList = personList;
    }
    public People(PersonType... person) {
        //Arrays.stream(person).toList().forEach(p -> this.personList.add(p));
        //Arrays.stream(person).toList().addAll(PersonType, person);
        personList.addAll(Arrays.stream(person).toList());
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
//        Optional<Person> p = this.personList.stream().filter(p -> p.getId() == id).findAny().get();
//        return p.isPresent() ? p.get() : null;

        for (PersonType p : this.personList) {
            if (p.getId() == id)
                return p;
        }  return null;

    }

    public List<PersonType> findAll() {
        return this.personList;
    }

}
