package com.journaldev.spring.service;

import java.io.IOException;
import java.util.List;

import com.journaldev.spring.bean.Result;
import com.journaldev.spring.model.Person;

public interface SearchService {

	public Result search(String s) throws IOException;

	public void updatePerson(Person p);

	public List<Person> listPersons();

	public Person getPersonById(int id);

	public void removePerson(int id);

}
