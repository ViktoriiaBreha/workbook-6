package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        ArrayList<Person> p = new ArrayList<>();
        p.add(new Person("Julia","Smith",14 ));
        p.add(new Person("Paul","Johnson",56 ));
        p.add(new Person("Viktoriia","Breha",21 ));
        p.add(new Person("Enes","Wilson",24 ));
        p.add(new Person("Ana","Anderson", 78));
        p.add(new Person("Bhim","Taylor",30 ));
        p.add(new Person("Tyler","Ortmann",21 ));
        p.add(new Person("Berkcan","Moore",45 ));
        p.add(new Person("Ethan","Davis",9 ));
        p.add(new Person("Topher","Martinez",12 ));

        System.out.println("=== Welcome to our application ===");

        while(run){
            System.out.println(" ");
            System.out.println("== Our options ==");
            System.out.println("1.See whole list ");
            System.out.println("2.Search by name ");
            System.out.println("3.See average age ");
            System.out.println("4.See oldest person's age ");
            System.out.println("5.See youngest person's age ");
            System.out.println("6.Exit");
            System.out.print("Enter number: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    viewAll(p);
                    break;
                case 2:
                    getNameBySearch(p,scanner);
                    break;
                case 3:
                    getAverageAge(p);
                    break;
                case 4:
                    getOldest(p);
                    break;
                case 5:
                    getYoungest(p);
                    break;
                case 6:
                    System.out.println("Thank you for using our application");
                    run = false;
                    break;
                default:
                    System.out.println("Wrong number try again");
                    break;
            }}



    }

    public static void viewAll (ArrayList<Person> p ){
        p.add(new Person("Julia","Smith",14 ));
        p.add(new Person("Paul","Johnson",56 ));
        p.add(new Person("Viktoriia","Breha",21 ));
        p.add(new Person("Enes","Wilson",24 ));
        p.add(new Person("Ana","Anderson", 78));
        p.add(new Person("Bhim","Taylor",30 ));
        p.add(new Person("Tyler","Ortmann",21 ));
        p.add(new Person("Berkcan","Moore",45 ));
        p.add(new Person("Ethan","Davis",9 ));
        p.add(new Person("Topher","Martinez",12 ));
        for (Person person : p){
            System.out.println(person);
        }

    }

    public static void getNameBySearch(ArrayList<Person> p, Scanner scanner){
        System.out.println(" ");
        System.out.print("Enter the name to find a person: ");
        String nameSearch = scanner.nextLine().trim();
        List<Person> name = p.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase(nameSearch)
                        ||person.getLastName().equalsIgnoreCase(nameSearch)).toList();

        name.forEach(System.out::println);

    }

    public static void getAverageAge(ArrayList<Person> p){
        System.out.println(" ");
        System.out.print("Average age is: ");
        int age = (int) p.stream()
                .mapToInt(Person :: getAge).average().getAsDouble();

        System.out.println(age);
    }

    public static void getOldest (ArrayList<Person> p){
        System.out.println(" ");
        System.out.print("Oldest person: ");
        int maxAge = p.stream()
                .mapToInt(Person :: getAge).max().getAsInt();

        System.out.println(maxAge);
    }

    public static void getYoungest (ArrayList<Person> p ){
        System.out.println(" ");
        System.out.print("Youngest person: ");
        int minAge = p.stream()
                .mapToInt(Person :: getAge).min().getAsInt();

        System.out.println(minAge);
    }
}
