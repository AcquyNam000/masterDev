/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materdev_btvn1;

import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class homeWork_third {    
    public boolean checkPrime(long number)
            {
                if(number <  2)
                    return false;
                if(number >2)
                    {
                        for(int i = 0 ; i < Math.sqrt(number) ; i ++)
                            {
                                if(number % i == 0)
                                    {
                                       return false;
                                    }
                            }
                        return true;
                    }
                return false;
            }
    
    
    public void sumPrimesUsingFor()
            {
                long sum = 0 ;
                for(long i = 0 ; i < 10000 ; i++)
                    {
                        if(checkPrime(i))
                            {
                              sum += i;  
                            }
                    }
                
                System.out.println("use the for loop to sum the primes by :" + sum);
                
            }
    
    
        
    public void sumPrimesUsingWhile()
            {
                long sum = 0 ;
                int i = 0;
                while(i <= 10000)
                    {
                        i++;
                        if(checkPrime(i))
                            {
                              sum += i;  
                            }
                        
                    }
                
                System.out.println("use the for loop to sum the primes by :" + sum);
                
            }
    
    
    
    public void sumPrimesUsingDoWhile()
            {
                long sum = 0 ;
                int i = 0;
                do
                    {
                        if(checkPrime(i))
                            {
                              sum += i;  
                            }
                    }
                while(i <= 10000);
                
                System.out.println("use the for loop to sum the primes by :" + sum);
                
            }
    
    
}
