package lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{

    private List<Person> personList = new ArrayList<>();


    public void addPeople(Person person){
        personList.add(person);
    }

    public Person findByID(long id) {

        Person personWithID = null;

        for (Person person : personList) {
            if (person.getID() == id){
                personWithID = person;
            }
        }
            return personWithID;
    }

    public boolean contains(Person person){

        return personList.contains(person);

    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void removeByID(long id){

       for (Person p : personList){
           if (p.getID() == id){
               remove(p);
           }
       }

    }

    public void removeAll(){

        personList.clear();

    }

    public int count(){
        return personList.size();
    }

    public void toArray(){
        System.out.println(Arrays.toString(personList.toArray()));
    }

    @Override
    public String toString() {
        return "People" +
                  personList +
                ' ';
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
