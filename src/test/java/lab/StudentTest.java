package lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;
    @BeforeEach
    void setup(){
        student = new Student(4856, "John");
    }

    @Test
    @DisplayName("Test Implemntations")
    void implementationTest(){
        Assertions.assertTrue(student instanceof ILearner,"Implementations -> False");
        System.out.println("Implementations -> True");
    }

    @Test
    @DisplayName("Test Inheritance")
    void inheritanceTest(){
        Assertions.assertTrue(student instanceof Person, "Inheritance -> False");
        System.out.println("Inheritance -> True");
    }

    @Test
    @DisplayName("Test Learn")
    void learnTest(){
        double hours = 40;

        student.learn(hours);

        Assertions.assertEquals(hours, student.getTotalStudyTime(), "LearnMethod -> Not working");
        System.out.println("LearnMethod -> Works");
    }


}