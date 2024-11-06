package lab;

import java.util.*;

public final class Students extends People{

    private static final Students INSTANCE = new Students();



    private Students() {
        getPersonList().add(new Student(4856, "Ethan"));
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
