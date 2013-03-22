/**
 * 
 */
package com.example.service;
import com.example.model.*;
import com.example.service.*;

import junit.framework.TestCase;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
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
public class ToyServiceImplTest extends TestCase{

    private ToyServiceImpl toyService;
    private List<Toy> toys;

    private static int TOY_COUNT = 2;
    private static String DOLL_NAME = "dolll";
    private static String CAR_NAME = "car";
    
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
	    toyService = new ToyServiceImpl();
	    toys = new ArrayList<Toy>();
	    
	    //stub up a list of toys
	    Toy toy = new Toy();
	    toy.setToyName(CAR_NAME);
	    toyService.addToy(toy);

	    toy = new Toy();
	    toy.setToyName(DOLL_NAME);
	    toyService.addToy(toy);
	}



        /**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.example.service.ToyServiceImpl#addToy(com.example.model.Toy)}.
	 */
	@Ignore("testAddToy not implemented yet")
	@Test
	public final void testAddToy() {
		//fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.example.service.ToyServiceImpl#removeToy(java.lang.Integer)}.
	 */
	@Ignore("testRemoveToy not implemented yet")
	@Test
	public final void testRemoveToy() {
		//fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.example.service.ToyServiceImpl#listToys()}.
	 */
	//@Ignore("testListToys not implemented yet")
	@Test
	public final void testListToys() {
		List<Toy> toys = toyService.listToys();
        assertNotNull(toys);        
        assertEquals(TOY_COUNT, toyService.listToys().size());
    
        Toy toy = toys.get(0);
        assertEquals(CAR_NAME, toy.getToyName());
        
        toy = toys.get(1);
        assertEquals(DOLL_NAME, toy.getToyName());
	}

    @Test
    public void testGetToysWithNoToys() {
        toyService = new ToyServiceImpl();
        assertEquals(0,toyService.listToys().size());  
    }

	
}
