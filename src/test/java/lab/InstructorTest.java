package lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {

    Instructor instructor;

    @BeforeEach
    void setup(){
        instructor = new Instructor(4856, "John");
    }

    @Test
    @DisplayName("Test Implemntations")
    void implementationTest(){
        Assertions.assertTrue(instructor instanceof ITeacher,"Implementations -> False");
        System.out.println("Implementations -> True");
    }

    @Test
    @DisplayName("Test Inheritance")
    void inheritanceTest(){
        Assertions.assertTrue(instructor instanceof Person, "Inheritance -> False");
        System.out.println("Inheritance -> True");
    }

    @Test
    @DisplayName("Test Teach")
    void teachTest(){
        Student student = new Student(4890, "Austin");
        double hours = 35;
        instructor.teach(student,hours);

        Assertions.assertEquals(hours, student.getTotalStudyTime(), "Teach -> not working");
        System.out.println("Works");
    }

    @Test
    @DisplayName("Test Lecture")
    void lectureTest(){
        Student student = new Student(4890, "Austin");
        Student student1 = new Student(4891, "Mike");
        ILearner[] list = {student, student1};
        double hours = 100;
        instructor.lecture(list, hours);

        double expected = 50;

        Assertions.assertEquals(expected, student.getTotalStudyTime(), "Lecture -> not wokring");
        System.out.println("Lecture -> Works");
    }




}