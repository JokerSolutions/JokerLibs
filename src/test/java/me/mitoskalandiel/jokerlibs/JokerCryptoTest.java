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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import static me.mitoskalandiel.jokerlibs.JokerCrypto.randomInt;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Assert;

/**
 * Set up tests for the cryptography.
 * @author smzb
 */
public class JokerCryptoTest {
    
    public static final int MINIT = 20;
    public static final int MAXIT = 50;
    
    public JokerCryptoTest() {
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
     * Test of generatePassword method, of class JokerCrypto.
     */
    @Test
    public void testGeneratePassword() {
        System.out.println("generatePassword");
        int length = 5;
        char[] result = JokerCrypto.generatePassword(length);
        assertThat(result, is(not(0)));
        System.out.print("5-digit password : ");
        System.out.println(result);
    }

    /**
     * Test of randomInt method, of class JokerCrypto.
     */
    @Test
  public void testRandomInt() {
    int results = 0;
    final int TIMES = 30;
    for(int i = 0; i < TIMES; i++)
    {
      if (randomNumbersRun())
      {
        results++;
      }
    }
    System.out.println("Randomnumber generator passed quality checks");
    Assert.assertTrue(results >= TIMES * 80 / 100);
  }
   
  private boolean randomNumbersRun()
  {
    ArrayList<Integer> list = new ArrayList<Integer>();
    int r = MAXIT - MINIT;
    final int SIZE = 11;
    for (int i = 0; i < r*SIZE; i++) {
      list.add(randomInt(MINIT,MAXIT));
    }
    return isRandom(list, r);
  }
  
  static boolean isRandom(ArrayList<? extends Number> randomNums, int r) {
    //According to Sedgewick: "This is valid if N is greater than about 10r"
    if (randomNums.size() <= 10 * r) {
      return false;
    }

    //PART A: Get frequency of randoms
    Map<Number, Integer> ht = getFrequencies(randomNums);

    //PART B: Calculate chi-square - this approach is in Sedgewick
    double n_r = (double) randomNums.size() / r;
    double chiSquare = 0;

    for (int v : ht.values()) {
      double f = v - n_r;
      chiSquare += f * f;
    }
    chiSquare /= n_r;

    //PART C: According to Swdgewick: "The statistic should be within 2(r)^1/2 of r
    //This is valid if N is greater than about 10r"
    return Math.abs(chiSquare - r) <= 2 * Math.sqrt(r);
  }

  /**
   * @param nums an array of integers
   * @return a Map, key being the number and value its frequency
   */
  private static Map<Number, Integer> getFrequencies(ArrayList<? extends Number> nums) {
    Map<Number, Integer> freqs = new HashMap<Number, Integer>();

    for (Number x : nums) {
      if (freqs.containsKey(x)) {
        freqs.put(x, freqs.get(x) + 1);
      } else {
        freqs.put(x, 1);
      }
    }

    return freqs;
  }
  
}

