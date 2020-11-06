/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.InputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author felrd
 */
public class CarritoTest {
    
    public CarritoTest() {
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
     * Test of getItem method, of class Carrito.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        Producto producto = new Producto(1, "Felipe", null, "Hoila", 1200.0, 540);
        Carrito instance = new Carrito(2, 43, "Banano", "Coso para colgar", 3000.0, 5, 5000.0);
        int expResult = 2;
        int result = instance.getItem();
        
        if (expResult==result) {
            System.out.println("La wea buena");
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setItem method, of class Carrito.
     */
    @Test
    public void testSetItem() {
        System.out.println("setItem");
        int item = 1;
        Carrito instance = new Carrito(2, 43, "Banano", "Coso para colgar", 3000.0, 5, 5000.0);
        instance.setItem(item);
        
        int numero = instance.item;
        if (numero==item) {
            System.out.println("Item cambiado");
        }
        else
        {
          System.out.println("Item no cambiado");      
        }
    }

    /**
     * Test of getIdProducto method, of class Carrito.
     */
    @Test
    public void testGetIdProducto() {
        System.out.println("getIdProducto");
        Carrito instance = new Carrito(2, 43, "Banano", "Coso para colgar", 3000.0, 5, 5000.0);
        int expResult = 43;
        int result = instance.getIdProducto();
        
         if (expResult==result) {
            System.out.println("IDprodcuto");
        }
    }

    /**
     * Test of setIdProducto method, of class Carrito.
     */
    @Test
    public void testSetIdProducto() {
        System.out.println("setIdProducto");
        int idProducto = 0;
        Carrito instance = new Carrito(2, 43, "Banano", "Coso para colgar", 3000.0, 5, 5000.0);
        instance.setIdProducto(idProducto);
        
        int numero = instance.idProducto;
        if (numero==idProducto) {
            System.out.println("Producto cambiado");
        }
        else
        {
          System.out.println("Producto no cambiado");      
        }
    }

    /**
     * Test of getNombres method, of class Carrito.
     */
    @Test
    public void testGetNombres() {
        System.out.println("getNombres");
        Carrito instance = new Carrito(2, 43, "Banano", "Coso para colgar", 3000.0, 5, 5000.0);
        String expResult = "Banano";
        String result = instance.getNombres();
       
         if (expResult==result) {
            System.out.println("Nombre");
        }
    }

    /**
     * Test of setNombres method, of class Carrito.
     */
    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String nombres = "";
        Carrito instance = new Carrito(2, 43, "Banano", "Coso para colgar", 3000.0, 5, 5000.0);
        instance.setNombres(nombres);
        
        String numero = instance.nombres;
        if (numero==nombres) {
            System.out.println("Nombres cambiado");
        }
        else
        {
          System.out.println("Nombres no cambiados");      
        }
    }

    /**
     * Test of getDescripcion method, of class Carrito.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Carrito instance = new Carrito(2, 43, "Banano", "Coso para colgar", 3000.0, 5, 5000.0);
        String expResult = "Coso para colgar";
        String result = instance.getDescripcion();
         if (expResult==result) {
            System.out.println("Descripción");
        }
    }

    /**
     * Test of setDescripcion method, of class Carrito.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String descripcion = "";
        Carrito instance = new Carrito(2, 43, "Banano", "Coso para colgar", 3000.0, 5, 5000.0);
        instance.setDescripcion(descripcion);
        
        String numero = instance.descripcion;
        if (numero==descripcion) {
            System.out.println("Descripcion cambiada");
        }
        else
        {
          System.out.println("Descripcion no cambiada");      
        }
    }

    /**
     * Test of getPrecioCompra method, of class Carrito.
     */
    @Test
    public void testGetPrecioCompra() {
        System.out.println("getPrecioCompra");
        Carrito instance = new Carrito(2, 43, "Banano", "Coso para colgar", 3000.0, 5, 5000.0);
        double expResult = 3000.0;
        double result = instance.getPrecioCompra();
        
         if (expResult==result) {
            System.out.println("Precio");
        }
    }

    /**
     * Test of setPrecioCompra method, of class Carrito.
     */
    @Test
    public void testSetPrecioCompra() {
        System.out.println("setPrecioCompra");
        double precioCompra = 0.0;
        Carrito instance = new Carrito(2, 43, "Banano", "Coso para colgar", 3000.0, 5, 5000.0);
        instance.setPrecioCompra(precioCompra);
        
        Double numero = instance.precioCompra;
        if (numero==precioCompra) {
            System.out.println("Precio cambiado");
        }
        else
        {
          System.out.println("Precio no cambiado");      
        }
    }

    /**
     * Test of getCantidad method, of class Carrito.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        Carrito instance = new Carrito(2, 43, "Banano", "Coso para colgar", 3000.0, 5, 5000.0);
        int expResult = 5;
        int result = instance.getCantidad();
        
         if (expResult==result) {
            System.out.println("Cantidad");
        }
    }

    /**
     * Test of setCantidad method, of class Carrito.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int cantidad = 0;
        Carrito instance = new Carrito(2, 43, "Banano", "Coso para colgar", 3000.0, 5, 5000.0);
        instance.setCantidad(cantidad);
        
        int numero = instance.cantidad;
        if (numero==cantidad) {
            System.out.println("Cantidad cambiada");
        }
        else
        {
          System.out.println("Cantidad no cambiada");      
        }
    }

    /**
     * Test of getSubTotal method, of class Carrito.
     */
    @Test
    public void testGetSubTotal() {
        System.out.println("getSubTotal");
        Carrito instance = new Carrito(2, 43, "Banano", "Coso para colgar", 3000.0, 5, 5000.0);
        double expResult = 5000.0;
        double result = instance.getSubTotal();
        
         if (expResult==result) {
            System.out.println("SubTotal");
        }
    }

    /**
     * Test of setSubTotal method, of class Carrito.
     */
    @Test
    public void testSetSubTotal() {
        System.out.println("setSubTotal");
        double subTotal = 0.0;
        Carrito instance = new Carrito(2, 43, "Banano", "Coso para colgar", 3000.0, 5, 5000.0);
        instance.setSubTotal(subTotal);
        
        Double numero = instance.subTotal;
        if (numero==subTotal) {
            System.out.println("subTotal cambiado");
        }
        else
        {
          System.out.println("subTotal no cambiado");      
        }
    }
    
}
