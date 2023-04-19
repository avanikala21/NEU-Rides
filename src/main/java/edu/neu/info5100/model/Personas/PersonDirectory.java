package edu.neu.info5100.model.Personas;

import java.util.ArrayList;

public class PersonDirectory {
    ArrayList<Person> Persons = new ArrayList<Person>();

    public ArrayList<Person> getPersons() {
        return Persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        Persons = persons;
    }

    public PersonDirectory(ArrayList<Person> persons) {
        Persons = persons;
    }
}
