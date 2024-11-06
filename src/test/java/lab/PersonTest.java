package lab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person;

    @BeforeEach
    void setup(){
        person = new Person(4856, "John");
    }

    @Test
    @DisplayName("Test Person Constructor")
    void personConstructorTest() {


        String name = "John";
        long id = 4856;


        Assertions.assertEquals(name, person.getName());
        Assertions.assertEquals(id, person.getID());
    }

    @Test
    @DisplayName("Test Set Name")
    void setNameTest() {

        String name = "Larry";


        person.setName("Larry");

        Assertions.assertEquals(name, person.getName() );

    }
}