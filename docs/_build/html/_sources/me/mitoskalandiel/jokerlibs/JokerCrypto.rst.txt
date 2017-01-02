.. java:import:: java.util Random

.. java:import:: java.util.concurrent ThreadLocalRandom

JokerCrypto
===========

.. java:package:: me.mitoskalandiel.jokerlibs
   :noindex:

.. java:type:: public class JokerCrypto

   JokerCrypto class.

   :author: smzb

Methods
-------
generatePassword
^^^^^^^^^^^^^^^^

.. java:method:: public static char[] generatePassword(int length)
   :outertype: JokerCrypto

   Lets generate a password with a length parameter.

   :param length: The password length
   :return: String of random password of n length

randomInt
^^^^^^^^^

.. java:method:: public static int randomInt(int l, int h)
   :outertype: JokerCrypto

   Let's generate a Random Number between l and h

   :param l: Low value for minimum random value
   :param h: High value for random value
   :return: int of random number between (l)ow and (h)igh

