package me.mitos_kalandiel.jokerapi;

/**
 * Copyright (C) 2016 by smzb
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public class JokerHelper implements IJokerHelper {

    /**
     * Add two INT numbers somehow
     *
     * @param Num1 Integer 1
     * @param Num2 Integer 2
     * @return Integer with the addition result
     */
    @Override
    public int addNumbers(int Num1, int Num2) {
        return Num1 + Num2;
    }

    /**
     * Subtract two INT numbers somehow
     *
     * @param Num1 Integer 1
     * @param Num2 Integer 2
     * @return Integer with the subtraction result
     */
    @Override
    public int subNumbers(int Num1, int Num2) {
        return Num1 - Num2;
    }

    /**
     * Multiply two INT numbers somehow
     *
     * @param Num1 Integer 1
     * @param Num2 Integer 2
     * @return Integer with the multiplication result
     */
    @Override
    public int mulNumbers(int Num1, int Num2) {
        return Num1 * Num2;
    }

    /**
     * Divide two INT numbers somehow
     *
     * @param Num1 Integer 1
     * @param Num2 Integer 2
     * @return Integer with the division result
     */
    @Override
    public int divNumbers(int Num1, int Num2) {
        return Num1 / Num2;
    }

    /**
     * Add two double numbers somehow
     *
     * @param Num1 Double 1
     * @param Num2 Double 2
     * @return Double with the addition result
     */
    @Override
    public double addNumbers(double Num1, double Num2) {
        return Num1 + Num2;
    }

    /**
     * Subtract two double numbers somehow
     *
     * @param Num1 Double 1
     * @param Num2 Double 2
     * @return Double with the subtraction result
     */
    @Override
    public double subNumbers(double Num1, double Num2) {
        return Num1 - Num2;
    }

    /**
     * Multiply two double numbers somehow
     *
     * @param Num1 Double 1
     * @param Num2 Double 2
     * @return Double with the multiplication result
     */
    @Override
    public double mulNumbers(double Num1, double Num2) {
        return Num1 * Num2;
    }

    /**
     * Divide two double numbers somehow
     *
     * @param Num1 Double 1
     * @param Num2 Double 2
     * @return Double with the division result
     */
    @Override
    public double divNumbers(double Num1, double Num2) {
        return Num1 / Num2;
    }
}
