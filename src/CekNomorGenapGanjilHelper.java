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
        StringBuilder result = new StringBuilder();

        if (number % 2 == 0) {
            result.append(number).append(" adalah bilangan genap,");
        } else {
            result.append(number).append(" adalah bilangan ganjil,");
        }

        if (isPrime(number)) {
            result.append(" ").append(number).append(" merupakan bilangan prima.");
        } else {
            result.append(" ").append(number).append(" bukan bilangan prima.");
        }

        return result.toString();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true; 
    }
    
}


