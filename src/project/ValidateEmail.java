/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;    //email validating codes

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author My Pc
 */
public class ValidateEmail {
    public static boolean ValidateEmail (String email){
    
        boolean status = false;
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher=pattern.matcher(email);
        if(matcher.matches())
        {
            status = true;
        }
        else
        {
        status = false;
        }
        return status;
    }
    
}
