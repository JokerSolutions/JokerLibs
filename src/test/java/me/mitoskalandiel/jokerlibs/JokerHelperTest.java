/*
 * Copyright (C) 2016 smzb
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package me.mitoskalandiel.jokerlibs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Lets set up tests for the JokerHelper
 * @author smzb
 */
public class JokerHelperTest {
    
    private int intNum1;
    private int intNum2;
    private double dblNum1;
    private double dblNum2;
    
    /**
     *
     */
    public JokerHelperTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
        intNum1 = 5;
        intNum2 = 6;
        dblNum1 = 5.3;
        dblNum2 = 2;
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of addNumbers method, of class JokerHelper.
     */
    @Test
    public void testAddNumbers_int_int() {
        System.out.println("Test:addNumbers(int)");
        JokerHelper instance = new JokerHelper();
        int expected = 11;
        int result = instance.addNumbers(intNum1, intNum2);
        assertThat(expected, is(equalTo(result)));
    }

    /**
     * Test of subNumbers method, of class JokerHelper.
     */
    @Test
    public void testSubNumbers_int_int() {
        System.out.println("Test:subNumbers(int)");
        JokerHelper instance = new JokerHelper();
        int expected = -1;
        int result = instance.subNumbers(intNum1, intNum2);
        assertThat(expected, is(equalTo(result)));
    }

    /**
     * Test of mulNumbers method, of class JokerHelper.
     */
    @Test
    public void testMulNumbers_int_int() {
        System.out.println("Test:mulNumbers(int)");
        JokerHelper instance = new JokerHelper();
        int expected = 30;
        int result = instance.mulNumbers(intNum1, intNum2);
        assertThat(expected, is(equalTo(result)));
    }

    /**
     * Test of divNumbers method, of class JokerHelper.
     * TODO come up with a good test for division
     */
    @Test
    public void testDivNumbers_int_int() {
        System.out.println("Test:divNumbers(int)");
        int Num1 = 0;
        int Num2 = 1;
        JokerHelper instance = new JokerHelper();
        int expected = 0;
        int result = instance.divNumbers(Num1, Num2);
        assertThat(expected, is(equalTo(result)));
    }

    /**
     * Test of addNumbers method, of class JokerHelper.
     */
    @Test
    public void testAddNumbers_double_double() {
        System.out.println("Test:addNumbers(double)");
        JokerHelper instance = new JokerHelper();
        double expected = 7.3;
        double result = instance.addNumbers(dblNum1, dblNum2);
        assertThat(expected, is(equalTo(result)));
    }

    /**
     * Test of subNumbers method, of class JokerHelper.
     */
    @Test
    public void testSubNumbers_double_double() {
        System.out.println("Test:subNumbers(double)");
        JokerHelper instance = new JokerHelper();
        double expected = 3.3;
        double result = instance.subNumbers(dblNum1, dblNum2);
        assertThat(expected, is(equalTo(result)));
    }

    /**
     * Test of mulNumbers method, of class JokerHelper.
     */
    @Test
    public void testMulNumbers_double_double() {
        System.out.println("Test:mulNumbers(double)");
        JokerHelper instance = new JokerHelper();
        double expected = 10.6;
        double result = instance.mulNumbers(dblNum1, dblNum2);
        assertThat(expected, is(equalTo(result)));
    }

    /**
     * Test of divNumbers method, of class JokerHelper.
     */
    @Test
    public void testDivNumbers_double_double() {
        System.out.println("Test:divNumbers(double)");
        JokerHelper instance = new JokerHelper();
        double expected = 2.65;
        double result = instance.divNumbers(dblNum1, dblNum2);
        assertThat(expected, is(equalTo(result)));
    }
    
    /**
     *
     */
    @Test(expected=java.lang.ArithmeticException.class)
    public void testDivideByZero_int_int() {
        System.out.println("Test:divByZero(int)");
        JokerHelper instance = new JokerHelper();
        double result = instance.divNumbers(intNum1, 0);
    }
    
    /**
     *
     */
    @Test
    public void testDivideByZero_double_double() {
        System.out.println("Test:divByZero(double)");
        JokerHelper instance = new JokerHelper();
        double expected = Double.POSITIVE_INFINITY;
        double result = instance.divNumbers(dblNum1, 0);
        assertThat(expected, is(equalTo(result)));
    }

}
