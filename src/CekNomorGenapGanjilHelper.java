/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abtme
 */
public class CekNomorGenapGanjilHelper {
    public static String checkNumber(int number) {
        if (number % 2 == 0) {
            return number + " adalah bilangan genap.";
        } else {
            return number + " adalah bilangan ganjil.";
        }
    }
}


