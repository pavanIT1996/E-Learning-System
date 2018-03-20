/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author win 8
 */
public class CurrentDate
{
    Calendar cal=new GregorianCalendar();
    int month=cal.get(Calendar.MONTH);          //get month
    int year=cal.get(Calendar.YEAR);            //get year
    int day=cal.get(Calendar.DAY_OF_MONTH);     //get days
   // date.setText(year+"/"+(month+1)+"/"+day);   //set the date date label
    
}
