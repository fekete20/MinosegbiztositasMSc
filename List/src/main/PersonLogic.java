package main;

import java.util.ArrayList;

public class PersonLogic {
	ArrayList<Person> people = new ArrayList<>();

	public void init() {
		people.add(new Person("Név 1", 50));
		people.add(new Person("Név 2", 18));
		people.add(new Person("Név 3", 21));
		people.add(new Person("Név 4", 72));
	}

	public void savePerson(Person person) {
		people.add(person);
	}

	public void deletePerson(int index) {
		if (people.size() <= index) {
			throw new IndexOutOfBoundsException("Nincs ilyen indexû elem!");
		} else {
			people.remove(index);
		}
	}

	public void removeAll() {
		people.clear();
	}

	public boolean isEmpty() {
		return people.isEmpty();
	}

	public int getSize() {
		return people.size();
	}

	public ArrayList<Person> getAllPerson() {
		if (people.isEmpty()) {
			return null;
		}
		return people;
	}

	public Person getById(int index) {
		if (people.size() <= index) {
			throw new IndexOutOfBoundsException("Nincs ilyen indexû elem!");
		} else {
			return people.get(index);
		}
	}

	public Person searchByName(String name) {
		for (Person p : people) {
			if (p.getName().toLowerCase().contains(name.toLowerCase())) {
				return p;
			}
		}
		return null;
	}

}
