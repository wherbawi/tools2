package edu.ppu.runers;

import java.util.Arrays;
import java.util.List;

import edu.ppu.domain.Person;

public class PersonRunner {

	public static void main(String[] args) {

		Person person = new Person("p1", 10);
		List<Person> persons = Arrays.asList(new Person("p2", 10), new Person("p3", 20), new Person("Gohst", 3000));
		double avgAge = getAvg(persons);
		System.out.println(avgAge);

		Person maxAgePerson = getOldestGuy(persons);

		System.out.println(maxAgePerson);

	}

	private static Person getOldestGuy(List<Person> persons) {
		Person maxAgePerson = null;
		for (Person currPerson : persons) {
			if (maxAgePerson == null || currPerson.getAge() > maxAgePerson.getAge())
				maxAgePerson = currPerson;
		}
		return maxAgePerson;
	}

	private static double getAvg(List<Person> persons) {
		int sum = 0;
		for (Person person : persons) {
			sum += person.getAge();
		}
		return sum / persons.size();
	}

}
