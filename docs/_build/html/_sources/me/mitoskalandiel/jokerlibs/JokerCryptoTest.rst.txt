.. java:import:: java.util ArrayList

.. java:import:: java.util HashMap

.. java:import:: java.util Map

.. java:import:: org.junit After

.. java:import:: org.junit AfterClass

.. java:import:: org.junit Before

.. java:import:: org.junit BeforeClass

.. java:import:: org.junit Test

.. java:import:: org.junit Assert

JokerCryptoTest
===============

.. java:package:: me.mitoskalandiel.jokerlibs
   :noindex:

.. java:type:: public class JokerCryptoTest

   Set up tests for the cryptography.

   :author: smzb

Fields
------
MAXIT
^^^^^

.. java:field:: public static final int MAXIT
   :outertype: JokerCryptoTest

MINIT
^^^^^

.. java:field:: public static final int MINIT
   :outertype: JokerCryptoTest

Constructors
------------
JokerCryptoTest
^^^^^^^^^^^^^^^

.. java:constructor:: public JokerCryptoTest()
   :outertype: JokerCryptoTest

Methods
-------
getFrequencies
^^^^^^^^^^^^^^

.. java:method:: static Map<Number, Integer> getFrequencies(ArrayList<? extends Number> nums)
   :outertype: JokerCryptoTest

   :param nums: an array of integers
   :return: a Map, key being the number and value its frequency

isRandom
^^^^^^^^

.. java:method:: static boolean isRandom(ArrayList<? extends Number> randomNums, int r)
   :outertype: JokerCryptoTest

randomNumbersRun
^^^^^^^^^^^^^^^^

.. java:method::  boolean randomNumbersRun()
   :outertype: JokerCryptoTest

setUp
^^^^^

.. java:method:: @Before public void setUp()
   :outertype: JokerCryptoTest

setUpClass
^^^^^^^^^^

.. java:method:: @BeforeClass public static void setUpClass()
   :outertype: JokerCryptoTest

tearDown
^^^^^^^^

.. java:method:: @After public void tearDown()
   :outertype: JokerCryptoTest

tearDownClass
^^^^^^^^^^^^^

.. java:method:: @AfterClass public static void tearDownClass()
   :outertype: JokerCryptoTest

testGeneratePassword
^^^^^^^^^^^^^^^^^^^^

.. java:method:: @Test public void testGeneratePassword()
   :outertype: JokerCryptoTest

   Test of generatePassword method, of class JokerCrypto.

testRandomInt
^^^^^^^^^^^^^

.. java:method:: @Test public void testRandomInt()
   :outertype: JokerCryptoTest

   Test of randomInt method, of class JokerCrypto.

