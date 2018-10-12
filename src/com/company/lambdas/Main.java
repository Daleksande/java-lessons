package com.company.lambdas;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    @FunctionalInterface
    interface  PersonFactory<P extends  Person> {
        P create(String fName, String lName);
    }

    public static void main(String[] args) {

        List<String> strings1 = Arrays.asList("a","b", "v");
        List<String> strings2 = Arrays.asList("1","2", "70");

        strings1.add("d");
        strings2.addAll(strings2);

        strings2.stream()
                .filter(f -> f.contains("2"))
                .forEach(l->strings1.add(l+"w"));



        PersonFactory<Person> personPersonFactory = Person::new;
        Person pers = personPersonFactory.create("Name", "Fam");
        List<Person> list = new ArrayList<>();
        list.add(personPersonFactory.create("4", "A"));
        list.add(personPersonFactory.create("1", "B"));
        list.add(personPersonFactory.create("3", "C"));


        List<Person> b = list.stream()
                .sorted((o1, o2) -> o1.getfName().compareTo(o2.getfName()))
                .collect(Collectors.toList());

        Map<String, String> mp =
                list.stream().collect(Collectors.toMap(Person::getfName,Person::getlName));

        System.out.println(pers.fName + " " + pers.lName);


        List<String> strings = new ArrayList<>();
        strings.add("l10");
        strings.add("lol11");
        strings.add("lold13tt");
        strings.add("lol14");
        strings.add("lol15t");
        strings.add("lol16");
        strings.add("lo7");
        strings.add("lol18d");
        strings.add("lol19");

        strings.stream().filter(s -> s.contains("t"))
                .filter(ss->ss.matches("\\d\\w"))
                .forEach(System.out::println); //contains возвращает true если строка содержит элемент
    }
}
