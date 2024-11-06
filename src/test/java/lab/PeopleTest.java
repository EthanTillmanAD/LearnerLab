package lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {
    People people;
    Student student1;
    Student student2;
    @BeforeEach
    void setup(){
        people = new People();
        student1 = new Student(4890, "Austin");
        student2 = new Student(4856, "John");
    }

    @Test
    @DisplayName("Test Add People")
    void addPeopleTest(){
        people.addPeople(student1);
        people.addPeople(student2);

        Assertions.assertEquals( student1, people.findByID(4890), "First add check -> not working");
        Assertions.assertEquals(student2, people.findByID(4856),"Second add check -> not working");
        System.out.println("Add people -> Works");
    }

    @Test
    @DisplayName("Test Remove People")
    void removePeopleTest(){
        people.addPeople(student1);
        people.addPeople(student2);

        people.remove(student2);

        Assertions.assertFalse(people.contains(student2), "Remove test -> True");
        System.out.println("Remove test -> Works");
    }
    @Test
    @DisplayName("Test Find By ID")
    void findByIDTest(){
        people.addPeople(student1);
        people.addPeople(student2);


        Assertions.assertEquals(student1, people.findByID(4890), "Find by id test -> not working");
        System.out.println("Find by id test -> Works");

    }
}