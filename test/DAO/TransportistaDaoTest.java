/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import dao.TransportistaDao;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Santiago Mendez
 */
public class TransportistaDaoTest {
    
    public TransportistaDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of consultarClienteById method, of class TransportistaDao.
     */
    @org.junit.Test
    public void testConsultarClienteById() {
        System.out.println("consultarClienteById");
        int id = 0;
        TransportistaDao instance = new TransportistaDao();
        List expResult = null;
        List result = instance.consultarClienteById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultarClienteByNombre method, of class TransportistaDao.
     */
    @org.junit.Test
    public void testConsultarClienteByNombre() {
        System.out.println("consultarClienteByNombre");
        String nombre = "";
        TransportistaDao instance = new TransportistaDao();
        List expResult = null;
        List result = instance.consultarClienteByNombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
