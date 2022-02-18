package com.alexshab;

import java.util.List;

import static com.alexshab.PersonFactory.deleteDuplicates;

public class Main {

    public static void main(String[] args){
        PersonFactory factory = new PersonFactory();
        List<Person> personList = factory.generatePersons(100);
        System.out.println(personList);
        System.out.println(deleteDuplicates(personList));
    }
}