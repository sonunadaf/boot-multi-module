package com.nadaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nadaf.service.PersonService;
import com.project.model.PersonDTO;

@RestController
@RequestMapping("/api/")
public class PersonController {

	@Autowired
	private PersonService personService;

	@GetMapping("getPersons")
	public List<PersonDTO> getPersonList() {
		return personService.getListOfPerson();
	}

}
