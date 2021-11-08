package com.nadaf.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.model.PersonDTO;

@Service
public class PersonService {

	public List<PersonDTO> getListOfPerson() {

		List<PersonDTO> persons = new ArrayList<PersonDTO>();
		PersonDTO person1 = new PersonDTO("Sonu", "25", "bikrampur");
		PersonDTO person2 = new PersonDTO("Nadaf", "29", "Katihar");
		PersonDTO person3 = new PersonDTO("Mohammad", "26", "bhagalpur");
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		return persons;

	}

}
