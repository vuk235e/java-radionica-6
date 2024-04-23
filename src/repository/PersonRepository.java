/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import domain.City;
import domain.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student2
 */
public class PersonRepository {
     private static PersonRepository instance; //SINGLETON PATTERN
    private List<Person> persons;
    
    private PersonRepository() {
        persons = new ArrayList<>();
        persons.add(new Person("1111111111111","Ana","Anić",25,new City(110001, "Beograd")));
        persons.add(new Person("2222222222222","Ava","Avić",26,new City(13000, "Pancevo")));
    }
    
    public void add(Person person) {
        persons.add(person);
    }
    
    public List<Person> getPersons() {
        return persons;
    }

    public static PersonRepository getInstance() {
       if (instance==null) instance = new PersonRepository();
        return instance;
    }
}
