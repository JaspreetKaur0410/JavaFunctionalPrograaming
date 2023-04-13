package imperative;
import BehaviourParametrization.Aple;
import BehaviourParametrization.AppleFancyFormatter;
import BehaviourParametrization.AppleSimpleFormatter;
import BehaviourParametrization.PreetyApple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> personList = List.of(
            new Person("John",Gender.MALE),
                new Person("Ankita",Gender.FEMALE),
                new Person("Reshma", Gender.FEMALE),
                new Person("Wick", Gender.MALE),
                new Person("Alice", Gender.MALE)
        );


        System.out.println("//IMPEARTIVE APPROACH");
        // IMPERATIVE APPROACH - defining every single detail step by step
        List<Person> females = new ArrayList<>();
        for(Person person:personList){
            if(person.gender.equals(Gender.FEMALE)){
                females.add(person);
            }
        }
        for(Person person:females){
            System.out.println(person.name);
        }

        //DECLARATIVE APPROACH - STREAMS+COLLECTION
        System.out.println("//DECLARATIVE APPROACH");
        personList.stream()
                .filter(person -> ((Gender.FEMALE).equals(person.gender)))
                .forEach(System.out::println);

        System.out.println();
        System.out.println();

        //BEHOURIAL PARAMETRISATION USING INTERFACE
        PreetyApple pa = new PreetyApple();
        Aple a1 = new Aple("A1", 101, "red");
        Aple a2 = new Aple("A2", 19, "green");
        Aple a3 = new Aple("A3", 200, "white");
        Aple a4 = new Aple("A4", 102, "pink");
        ArrayList<Aple> apples = new ArrayList<>();
        apples.add(a1);
        apples.add(a2);
        apples.add(a3);
        apples.add(a4);
        apples.add(a4);
        pa.preetyApple(apples, new AppleFancyFormatter());
        pa.preetyApple(apples, new AppleSimpleFormatter());
        System.out.println();
        System.out.println();
    }

    static class Person{
        private String name;
        private Gender gender;
        private String abc;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }
    }
    enum Gender{
        FEMALE, MALE
    }
}
