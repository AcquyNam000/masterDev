/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package materdev_btvn1;

import java.util.Scanner;

/**
 *
 * @author Nam
 */



public class Materdev_btvn1 {
 
    /**
     * @param args the command line arguments
     */
       

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ip = new Scanner(System.in);
        homeWord_first b1 = new homeWord_first();
        homeWord_second b2 = new homeWord_second();
        homeWork_third b3 = new homeWork_third();
        int selector = 0;
                System.out.println("~~MENU~~");
                System.out.println(" 1, pick moth print days ( used enum ) ");
                System.out.println(" 2, pick month print days ( no used enum)");
                System.out.println(" 3, distance between dates" );
                System.out.println(" 4, use for to calculate the total number of primes ");
                System.out.println(" 5 ,use while to calculate the total number of primes");
                System.out.println(" 6 ,use do while to calculate the total number of primes");
                System.out.println(" 7 ,print menu");
                System.out.println(" 0 ,exit");
        do
            {
                System.out.print("Your choice is : "); 
                selector = ip.nextInt();
                switch (selector) {
                    case 1:
                        b1.hw1a();
                        break;
                    case 2:
                        b1.hw1b();
                        break;
                    case 3:
                        b2.hw2();
                    case 4:
                        b3.sumPrimesUsingFor();
                        break;
                    case 5:
                        b3.sumPrimesUsingWhile();
                        break;
                    case 6:
                        b3.sumPrimesUsingDoWhile();
                        break;
                    case 7:
                System.out.println("~~MENU~~");
                System.out.println(" 1, pick moth print days ( used enum ) ");
                System.out.println(" 2, pick month print days ( no used enum)");
                System.out.println(" 3, distance between dates" );
                System.out.println(" 4, use for to calculate the total number of primes ");
                System.out.println(" 5 ,use while to calculate the total number of primes");
                System.out.println(" 6 ,use do while to calculate the total number of primes");
                System.out.println(" 7 ,print menu");
                System.out.println(" 0 ,exit");
                break;
                
                    case 0:
                        break;
                    default:
                        throw new AssertionError();
                }
                
            }
        while(selector == 0);
        
        
    }
    
}
