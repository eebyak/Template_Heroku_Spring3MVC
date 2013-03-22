/**
 * 
 */
package com.example.controller;

import java.util.HashMap;
import java.util.Map;
import static java.lang.System.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;


import org.springframework.web.servlet.ModelAndView;
import com.example.controller.*;
import com.example.model.Person;
import com.example.service.PersonService;
import com.example.service.PersonServiceImpl;

import static org.junit.Assert.*;
import junit.framework.TestCase;
//import org.testng.annotations.*;
import org.junit.Ignore;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * @author kay
 *
 */
public class PersonControllerTest extends AbstractTransactionalJUnit4SpringContextTests{
	static PersonController controller = new PersonController();
	static Person person; 
    private static PersonService personService = new PersonServiceImpl();

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
           
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		person = new Person();
        person.setLastName("doe");
        person.setFirstName("john");
        out.println("putting John Doe into db");
        out.println(personService);
        out.println(person.toString());
        out.println("");
        //personService.addPerson(person);
        out.println("Done adding person");

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.example.controller.PersonController#listPeople(java.util.Map)}.
	 */
   
        @Ignore("not implemented yet") 
        @Test
	public final void testListPeople() throws Exception{
        	Map<String, Object> map = new HashMap<String, Object>();
        	map.put("person", person);
        	out.println("-------------------------");
        	out.print(map.isEmpty());
        	out.println("-------------------------");
        	out.println(controller);
        	String newpage = controller.listPeople(map);
            assertEquals("people", newpage);
	}

	/**
	 * Test method for {@link com.example.controller.PersonController#addPerson(com.example.model.Person, org.springframework.validation.BindingResult)}.
	 */
        @Ignore("not implemented yet") 
	@Test
	public final void testAddPerson() {

	}

	/**
	 * Test method for {@link com.example.controller.PersonController#deletePerson(java.lang.Integer)}.
	 */
        @Ignore("not implemented yet") 
	@Test
	public final void testDeletePerson() {

	}

        
        
}
