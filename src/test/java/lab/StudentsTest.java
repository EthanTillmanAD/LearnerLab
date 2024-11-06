package lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {

    Students students;
    Student student1;
    Student student2;

    @BeforeEach
    void setup(){
        students = Students.getInstance();
        student1 = new Student(4856, "Ethan");
        student2 = new Student(4890, "Austin");
    }

    @Test
    @DisplayName("Testing Students")
    void studentsTesting(){

        Students test = Students.getInstance();
        Person actual = test.findByID(4856);
        Person expected = test.getPersonList().get(0);

       Assertions.assertEquals(expected, actual);
        //
//        People people = new People();
//
//        people.addPeople(student1);
//
//        Assertions.assertTrue(students.contains(student1));




    }
}