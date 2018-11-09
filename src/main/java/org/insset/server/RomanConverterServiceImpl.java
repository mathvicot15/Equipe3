/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import javax.swing.JOptionPane;
import org.insset.client.service.RomanConverterService;

/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class RomanConverterServiceImpl extends RemoteServiceServlet implements
        RomanConverterService {

    @Override
    public String convertDateYears(String nbr) throws IllegalArgumentException {
        //Implement your code
        return "XV/III/MX";
    }

    @Override
    public Integer convertRomanToArabe(String nbr) throws IllegalArgumentException {
       
        
      /* Parcourir la chaîne de caractère tout en analysant chaque caractère */
        
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
    
    
    
    

    @Override
    public String convertArabeToRoman(Integer nbr) throws IllegalArgumentException {
        //Implement your code
        return new String("XVXX");
    }

}
