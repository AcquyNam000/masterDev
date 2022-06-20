/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materdev_btvn1;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author Nam
 */
public class homeWord_second {
    Scanner ip = new Scanner(System.in);
    
    
    public boolean checkTime(Date dt1 , Date dt2)
     {
         if(dt1.getYear()  < dt2.getYear() )
         {
            return true;
         }
         else
             if(dt1.getYear() ==  dt2.getYear() )
             {
                 if(dt1.getMonth() < dt2.getMonth() )
                 {
                     return true;
                 }
                 else
                     if(dt1.getMonth() == dt2.getMonth())
                     {
                         if(dt1.getDay() <= dt2.getDay())
                         {
                             return true;
                         }
                         else
                         {
                             return false;
                         }
                         
                     }
             }
         return false;
     }
    
  
    
    public void hw2() 
    {
        try
        {
        System.out.println("HELLO welcome to homework 2");
        int y1 , y2 , m1 , m2 , d1 , d2 ;
        System.out.println("enter datetime frist:");
        System.out.print("day:"); d1 = ip.nextInt();
        System.out.print("month:"); m1 = ip.nextInt();
        System.out.print("year:"); y1 = ip.nextInt();
        System.out.println("enter datetime second:");
        System.out.print("day:"); d2 = ip.nextInt();
        System.out.print("month:"); m2 = ip.nextInt();
        System.out.print("year:"); y2 = ip.nextInt();
        LocalDate lc1 = LocalDate.of(y1, m1, d1);
        String date1 = lc1.toString();
        LocalDate lc2 = LocalDate.of(y2, m2, d2);
        String date2 = lc2.toString();
        
         System.out.println(  " the gap between two datetime : " + lc1.until(lc2,ChronoUnit.DAYS));
        }
        catch(Exception ex)
        {
            System.out.println("the datetime first > the datetime second <3 <3 <3");
            
        }
        
        
        
        
}}