package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Person;
import main.PersonLogic;

public class PersonLogicTest {
	PersonLogic personLogic = new PersonLogic();
	
	@Before
	public void init() {
		personLogic.init();
	}
	
	@After
	public void teardown() {
		personLogic.removeAll();
	}

	@Test
	public void testInit() {
		ArrayList<Person> peopleTest = new ArrayList<>();
		peopleTest = personLogic.getAllPerson();
		assertSame(peopleTest, personLogic.getAllPerson());
	}

	@Test
	public void testSavePerson() {
		Person person = new Person("név 20", 31);
		personLogic.savePerson(person);
		assertSame(personLogic.getById(4), person);
	}

	@Test
	public void testDeletePerson() {
		assertEquals(personLogic.getSize(), 4);
		personLogic.deletePerson(1);
		assertEquals(personLogic.getSize(), 3);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testDeleteWithException() {
		personLogic.deletePerson(4);
	}

	@Test
	public void testRemoveAllAndEmpty() {
		personLogic.removeAll();
		assertNull(personLogic.getAllPerson());
		assertTrue(personLogic.isEmpty());
	}

	@Test
	public void testGetSize() {
		assertEquals(personLogic.getSize(), 4);
	}

	@Test
	public void testGetById() {
		try {
			Person person = personLogic.getById(1);
			assertEquals(personLogic.getById(1), person);
			assertNull(personLogic.getById(99999));
			fail("Itt már kivétel kellene...");
		} catch(IndexOutOfBoundsException e) {
			assertNotNull(e);
		}
	
	}

	@Test
	public void testSearchByName() {
		assertNotNull(personLogic.searchByName("Név 1"));
		assertNull(personLogic.searchByName("adssfs"));
	}

}
