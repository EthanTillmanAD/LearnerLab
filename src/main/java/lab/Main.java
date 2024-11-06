package lab;

public class Main {


    public static void main(String[] args) {

        Person person1 = new Person(3421, "Jake");
        Person person2 = new Person(3223, "Mike");


        People listOfPeople = new People();

        listOfPeople.addPeople(person1);
        listOfPeople.addPeople(person2);


        listOfPeople.toArray();

        System.out.println( listOfPeople.findByID(3421));


        System.out.println(listOfPeople.contains(person1));

       listOfPeople.removeByID(3421);

        System.out.println(listOfPeople);

        listOfPeople.removeAll();

        System.out.println(listOfPeople);

        Students students = Students.getInstance();


        System.out.println(students);



    }
}
