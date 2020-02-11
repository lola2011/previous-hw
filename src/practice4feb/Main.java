package practice4feb;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Main {


    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Set<Person> person1 = new HashSet<>();

        Person p1 = new Person(23, "aybek");
        persons.add(p1);
        Person p2 = new Person(22, "anvar");
        Person p3 = new Person(23, "aziz");
        if (!persons.contains(new Person(23, "aziz"))) {
            persons.add(new Person());
        } else person1.add(new Person());
        System.out.println(persons);
        System.out.println("hashSet: " + person1);

    ArrayList<Cat>cats=new ArrayList<>();
        Random rnd=new Random(100);
        for (int i=0; i<100; i++){
        int c=0;
        c=rnd.nextInt();
        if (c%3==0){
            cats.add(0,new Cat("Tom"));
            System.out.println("Cat caught mouse");
        }
        else { cats.add(new Cat("Mot"));
            System.out.println("Cat drinks milk");
    }

}System.out.println(cats);


        ArrayList<Meal>meals=new ArrayList<>();

        Dish[]dishes= new Dish[10];
        dishes[0]=new Dish("lagman",250);




    }


    }



