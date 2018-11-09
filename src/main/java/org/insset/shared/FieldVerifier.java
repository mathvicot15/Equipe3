package org.insset.shared;

import static java.lang.Integer.parseInt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>
 * FieldVerifier validates that the name the user enters is valid.
 * </p>
 * <p>
 * This class is in the <code>shared</code> packing because we use it in both
 * the client code and on the server. On the client, we verify that the name is
 * valid before sending an RPC request so the user doesn't have to wait for a
 * network round trip to get feedback. On the server, we verify that the name is
 * correct to ensure that the input is correct regardless of where the RPC
 * originates.
 * </p>
 * <p>
 * When creating a class that is used on both the client and the server, be sure
 * that all code is translatable and does not use native JavaScript. Code that
 * is note translatable (such as code that interacts with a database or the file
 * system) cannot be compiled into client side JavaScript. Code that uses native
 * JavaScript (such as Widgets) cannot be run on the server.
 * </p>
 */
public class FieldVerifier {

    /**
     * Verifies that the specified name is valid for our service.
     *
     * In this example, we only require that the name is at least four
     * characters. In your application, you can use more complex checks to
     * ensure that usernames, passwords, email addresses, URLs, and other fields
     * have the proper syntax.
     *
     * @param name the name to validate
     * @return true if valid, false if invalid
     */
    public static boolean isValidName(String name) {
        if ((name == null) || (name.isEmpty())) {
            return false;
        }
        return true;
    }

    /**
     * Verifies that the specified value is valide.
     *
     * In this example, we only require that the name is at least four
     * characters. In your application, you can use more complex checks to
     * ensure that usernames, passwords, email addresses, URLs, and other fields
     * have the proper syntax.
     *
     * @param name the name to validate
     * @return true if valid, false if invalid
     */
    public static boolean isValidDecimal(Integer nbr) {
        //Implement your code
        return true;
    }
    
    /**
    * @author  SRomain
    * @since   09/11/2018
    * @param nbr Valeur à traiter
    * @return bool Retourne true ou false si la valeur est valide
    */
    public static boolean isValidRoman(String nbr) {
        int res = 0;
        for (int i = 0 ; i < nbr.length() ;i++){

            char test = nbr.charAt(i);
            int res2 = 0;

            if(test == 'I'){
                res2 = 1;
            }
            else if(test == 'V'){
            res2 = 5;
        }
            else if(test == 'X'){
            res2 = 10;
        }
            else if(test == 'L'){
            res2 = 50;
        }
            else if(test == 'C'){
            res2 = 100;
        }
            else if(test == 'D'){
            res2 = 500;
        }
            else if(test == 'M'){
            res2 = 1000;
        }
            else{
                return false;
            }

           res = res + res2;

                }
        if ( res >= 1 && res <= 1999){

        }else{
            return false;
        }
        return true;
    }
    
    /**
    * @author  RDPaul
    * @since   09/11/2018
    * @param date Valeur à traiter
    * @return bool Retourne true si la value est valide
    */
    public static boolean isValidDate(String date) {
        String[] tab = date.split("/");
        if(tab.length != 3){
            return false;
        }else if(!isBetween(1,31,parseInt(tab[0]))){
            return false;
            
        }else if(!isBetween(1,12,parseInt(tab[1]))){
            return false;
            
        }else if(!isBetween(1,2000,parseInt(tab[2]))){
            return false;
            
        }else{
            return true;
        }
         
    }
    /**
    * @author  VMathieu
    * @since   09/11/2018
    * @param limit1 Valeur inférieure
    * @param limit2 Valeur supérieure  
    * @param value Valeur à traiter
    * @return bool Retourne true si la value est supérieure à 2000 ou inférieure à 1
    */
    public static boolean isBetween(int limit1, int limit2, int value){
        if(value < limit1 || value > limit2){
            return false;
        }
        else{
            return true;
        }
    }
}
