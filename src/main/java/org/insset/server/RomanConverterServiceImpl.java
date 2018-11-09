/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import static java.lang.Integer.parseInt;
import org.insset.client.service.RomanConverterService;

/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class RomanConverterServiceImpl extends RemoteServiceServlet implements
        RomanConverterService {
    
    /**
    * @author  RDPaul
    * @since   09/11/2018
    * @param nbr Valeur à traiter
    * @return string Retourne la valeur convertie
    */
    @Override
    public String convertDateYears(String nbr) throws IllegalArgumentException {
     
        String[] tab = nbr.split("/");
        int tmp;
        int cpt = 0;
        String result = "";
        for(int i = 0; i< tab.length; i++){
            cpt += 1;
            tmp = parseInt(tab[i]);

            if(cpt<3){
                result += convertArabeToRoman(tmp)+"/";
            }else{
                result += convertArabeToRoman(tmp);
            }
        }
        return result;
    }
    
    /**
    * @author  SRomain
    * @since   09/11/2018
    * @param nbr Valeur à traiter
    * @return int Retourne la valeur convertie
    */
    @Override
    public Integer convertRomanToArabe(String nbr) throws IllegalArgumentException {
        
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
            /* ajouter res2 a res pour obtenir le total */
            res = res + res2 ;


        }

        return res;
    }
    
    /**
    * @author  VMathieu
    * @since   09/11/2018
    * @param nbr Valeur à convertir en romain
    * @return string Retourne le chiffre romain
    */
    @Override
    public String convertArabeToRoman(Integer nbr) throws IllegalArgumentException {
        
        //Creation du chiffre romain
        String s = "";
        while (nbr >= 1000) {
            s += "M";
            nbr -= 1000;        }
        while (nbr >= 900) {
            s += "CM";
            nbr -= 900;
        }
        while (nbr >= 500) {
            s += "D";
            nbr -= 500;
        }
        while (nbr >= 400) {
            s += "CD";
            nbr -= 400;
        }
        while (nbr >= 100) {
            s += "C";
            nbr -= 100;
        }
        while (nbr >= 90) {
            s += "XC";
            nbr -= 90;
        }
        while (nbr >= 50) {
            s += "L";
            nbr -= 50;
        }
        while (nbr >= 40) {
            s += "XL";
            nbr -= 40;
        }
        while (nbr >= 10) {
            s += "X";
            nbr -= 10;
        }
        while (nbr >= 9) {
            s += "IX";
            nbr -= 9;
        }
        while (nbr >= 5) {
            s += "V";
            nbr -= 5;
        }
        while (nbr >= 4) {
            s += "IV";
            nbr -= 4;
        }
        while (nbr >= 1) {
            s += "I";
            nbr -= 1;
        }    
    
        return s;
    }

}
