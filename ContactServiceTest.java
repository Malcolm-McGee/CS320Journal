package contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class ContactServiceTest {


@Test

public void testAdd(){

	ContactServiceTest cs = new ContactServiceTest();

	Contact t1 = new Contact("A1", "Malcolm", "McGee", "3919", "Lester Drive");

	assertEquals(true, cs.addContact(t1));

}



@Test

public void testDelete(){

	ContactService cs = new ContactService();

	Contact t1 = new Contact("A1", "Malcolm", "McGee", "3919", "Lester Drive");

	Contact t2 = new Contact("A2", "Malcolm", "McGee", "3119", "Lester Drive");

	Contact t3 = new Contact("A3", "Malcolm", "McGee", "3319", "Lester Drive");

	cs.addContact(t1);

	cs.addContact(t2);

	cs.addContact(t3);

	assertEquals(true, cs.deleteContact("A2"));

	assertEquals(false, cs.deleteContact("A1"));

	assertEquals(false, cs.deleteContact("A3"));

}



@Test

public void testUpdate(){

ContactService cs = new ContactService();

Contact t1 = new Contact("A1", "Malcolm", "McGee", "3919", "Lester Drive");

Contact t2 = new Contact("A2", "Malcolm", "McGee", "3119", "Lester Drive");

Contact t3 = new Contact("A3", "Malcolm", "McGee", "3319", "Lester Drive");

cs.addContact(t1);

cs.addContact(t2);

cs.addContact(t3);

assertEquals(true, cs.updateContact("A3", "Malcolm", "McGee", "3319", "Lester Drive"));

assertEquals(false, cs.updateContact("A4", "Malcolm", "McGee", "3419", "Lester Drive"));

}

}