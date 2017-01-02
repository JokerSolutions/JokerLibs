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

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * JokerCrypto class.
 * @author smzb
 */
public class JokerCrypto {
    
    /**
     * Let's generate a Random Number between l and h
     * @param l Low value for minimum random value
     * @param h High value for random value
     * @return int of random number between (l)ow and (h)igh
     */
    public static int randomInt(int l, int h) {
        int result = ThreadLocalRandom.current().nextInt(l, h + 1);
        return result;
    }
    
    /**
     * Lets generate a password with a length parameter.
     * @param length The password length
     * @return String of random password of n length
     */
    public static char[] generatePassword(int length) {
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String chars = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbols = "!£$%^&*()_+-=][}{#';~@:?></.,";

        String passSymbols = charsCaps + chars + numbers + symbols;
        Random rnd = new Random();

        char[] password = new char[length];

        for (int i=0; i<length; i++) {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
        }

        return password;
    }
}
