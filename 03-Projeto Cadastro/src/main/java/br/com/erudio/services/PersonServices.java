package br.com.erudio.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.erudio.model.Person;

@Service
public class PersonServices {
	
	private final AtomicLong counter = new AtomicLong();
	
	public Person create(Person person) {
		person.setId(counter.incrementAndGet());
		return person;
	}
	
	public Person update(Person person) {
		return person;
	}	
	
	public void delete(String id) {
		
	}
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Renato");
		person.setLastName("Alberto");
		person.setAddress("Brasília - DF");
		person.setGender("Male");
		return person ;
	}
	
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<Person>();
		
		for (int i = 0; i < 8; i++) {
			Person person = movkPerson(i);
			persons.add(person);
		}
		
		return persons;
	}

	private Person movkPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person Name " + i);
		person.setLastName("Person LastName " + i);
		person.setAddress("Person Address " + i);
		person.setGender("Person Gender " + i);
		return person ;
	}

}
