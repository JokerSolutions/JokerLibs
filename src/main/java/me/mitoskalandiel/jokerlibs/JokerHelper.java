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

/**
 * JokerHelper class.
 * @author smzb
 */
public class JokerHelper implements IJokerHelper {

    /**
     * Add two INT numbers somehow.
     *
     * @param intNum1 Integer 1
     * @param intNum2 Integer 2
     * @return Integer with the addition result
     */
    @Override
    public int addNumbers(int intNum1, int intNum2) {
        return intNum1 + intNum2;
    }

    /**
     * Subtract two INT numbers somehow.
     *
     * @param intNum1 Integer 1
     * @param intNum2 Integer 2
     * @return Integer with the subtraction result
     */
    @Override
    public int subNumbers(int intNum1, int intNum2) {
        return intNum1 - intNum2;
    }

    /**
     * Multiply two INT numbers somehow.
     *
     * @param intNum1 Integer 1
     * @param intNum2 Integer 2
     * @return Integer with the multiplication result
     */
    @Override
    public int mulNumbers(int intNum1, int intNum2) {
        return intNum1 * intNum2;
    }

    /**
     * Divide two INT numbers somehow.
     *
     * @param intNum1 Integer 1
     * @param intNum2 Integer 2
     * @return Integer with the division result
     * TODO We somehow have to make sure we can't divide by 0
     */
    @Override
    public int divNumbers(int intNum1, int intNum2) {
        return intNum1 / intNum2;
    }

    /**
     * Add two double numbers somehow.
     *
     * @param intNum1 Double 1
     * @param intNum2 Double 2
     * @return Double with the addition result
     */
    @Override
    public double addNumbers(double intNum1, double intNum2) {
        return intNum1 + intNum2;
    }

    /**
     * Subtract two double numbers somehow.
     *
     * @param intNum1 Double 1
     * @param intNum2 Double 2
     * @return Double with the subtraction result
     */
    @Override
    public double subNumbers(double intNum1, double intNum2) {
        return intNum1 - intNum2;
    }

    /**
     * Multiply two double numbers somehow.
     *
     * @param intNum1 Double 1
     * @param intNum2 Double 2
     * @return Double with the multiplication result
     */
    @Override
    public double mulNumbers(double intNum1, double intNum2) {
        return intNum1 * intNum2;
    }

    /**
     * Divide two double numbers somehow.
     *
     * @param intNum1 Double 1
     * @param intNum2 Double 2
     * @return Double with the division result
     * TODO We somehow have to make sure we can't divide by 0
     */
    @Override
    public double divNumbers(double intNum1, double intNum2) {
        return intNum1 / intNum2;
    }
}