/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materdev_btvn1;

import java.util.Scanner;

/**
 * bài số 1 gồm 2 ý a và b
 * @author Nguyễn Phương Nam
 * mã user nhân viên trên Gchat namnp108
 * đề bài nhập tháng in ngày sử dụng 2 cách enum cộng switch hoặc
 * dùng một cách thường cho số vào 
 */
public class homeWord_first {
    
    Scanner ip = new Scanner(System.in);
    public void hw1a()
      {
          int numberChoose = 0;
          int year ;
          pickMonth pm = null ;
          System.out.println("HELLO SIR <3 <3 <3 * 1000 ");
          System.out.println("Please choose the month we give you and it will print the number of days <3 <3 <3");
          System.out.println("Enter 1 : JANUARY");
          System.out.println("Enter 2 : FEBRUARY");
          System.out.println("Enter 3 : MARCH");
          System.out.println("Enter 4 : APRIL");
          System.out.println("Enter 5 : MAY");              
          System.out.println("Enter 6 : JUNE");
          System.out.println("Enter 7 : JULY");
          System.out.println("Enter 8 : AUGUST");
          System.out.println("Enter 9 : SEPTEMBER");
          System.out.println("Enter 10: OCTOBER");
          System.out.println("Enter 11: NOVEMBER");
          System.out.println("Enter 12: DECEMBER");
          System.out.println("Enter 13: MENU OF HOMEWORK FIRST");
          System.out.println("Enter 0 : EXIT PROGRAM ( bye bye 5 5 5 )");
    
          do{
              System.out.print("Your choice is : ");
              numberChoose = ip.nextInt();
              
             switch(numberChoose)
          {
              case 1: 
                  System.out.println("you just selected " + pm.JANUARY + " and " + pm.JANUARY + " has " + pm.JANUARY.sumDay() + " days");
                  break;
              case 2:
                  System.out.println("This is a special case you have to enter the whole year to determine the number of days");
                  System.out.println("<3<3<3 sorry for the inconvenience <3<3<3");
                  System.out.print("INPUT YEAR :"); year = ip.nextInt();
                          if(year % 4 == 0)//chia hết cho 4 là năm nhuận
        {
            if( year % 100 == 0)
            //nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì không phải năm nhuận
            {
                if ( year % 400 == 0)//chia hết cho 400 là năm nhuận
                    System.out.println("you just selected " + pm.FEBRUARY + " and " + pm.FEBRUARY + " has 29 days");
                else
                    System.out.println("you just selected " + pm.FEBRUARY + " and " + pm.FEBRUARY + " has " + pm.FEBRUARY.sumDay() + " days");
            }
            else//chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
                    System.out.println("you just selected " + pm.FEBRUARY + " and " + pm.FEBRUARY + " has 29 days");
        }
        else {
                    System.out.println("you just selected " + pm.FEBRUARY + " and " + pm.FEBRUARY + " has " + pm.FEBRUARY.sumDay() + " days");
        }
                  break;
              case 3:
                  System.out.println("you just selected " + pm.MARCH + " and " + pm.MARCH + " has " + pm.MARCH.sumDay() + " days");
                  break;
              case 4:
                  System.out.println("you just selected " + pm.APRIL + " and " + pm.APRIL + " has " + pm.APRIL.sumDay() + " days");
                  break;
              case 5:
                  System.out.println("you just selected " + pm.MAY + " and " + pm.MAY + " has " + pm.MAY.sumDay() + " days");
                  break;
              case 6:
                  System.out.println("you just selected " + pm.JUNE + " and " + pm.JUNE + " has " + pm.JUNE.sumDay() + " days");
                  break;
              case 7:
                  System.out.println("you just selected " + pm.JULY + " and " + pm.JULY + " has " + pm.JULY.sumDay() + " days");
                  break;
              case 8:
                  System.out.println("you just selected " + pm.AUGUST + " and " + pm.AUGUST + " has " + pm.AUGUST.sumDay() + " days");
                  break;
              case 9:
                  System.out.println("you just selected " + pm.SEPTEMBER + " and " + pm.SEPTEMBER + " has " + pm.SEPTEMBER.sumDay() + " days");
                  break;
              case 10:
                  System.out.println("you just selected " + pm.OCTOBER + " and " + pm.OCTOBER + " has " + pm.OCTOBER.sumDay() + " days");
                  break;
              case 11:
                  System.out.println("you just selected " + pm.NOVEMBER + " and " + pm.NOVEMBER + " has " + pm.NOVEMBER.sumDay() + " days");
                  break;
              case 12:
                  System.out.println("you just selected " + pm.DECEMBER + " and " + pm.DECEMBER + " has " + pm.DECEMBER.sumDay() + " days");
                  break;
              case 13:
                  System.out.println("Please choose the month we give you and it will print the number of days <3 <3 <3");
                  System.out.println("Enter 1 : JANUARY");
                  System.out.println("Enter 2 : FEBRUARY");
                  System.out.println("Enter 3 : MARCH");
                  System.out.println("Enter 4 : APRIL");
                  System.out.println("Enter 5 : MAY");              
                  System.out.println("Enter 6 : JUNE");
                  System.out.println("Enter 7 : JULY");
                  System.out.println("Enter 8 : AUGUST");
                  System.out.println("Enter 9 : SEPTEMBER");
                  System.out.println("Enter 10: OCTOBER");
                  System.out.println("Enter 11: NOVEMBER");
                  System.out.println("Enter 12: DECEMBER");
                  System.out.println("Enter 13: MENU OF HOMEWORK FIRST");
                  System.out.println("Enter 0 : EXIT PROGRAM ( bye bye 5 5 5 )");
                  System.out.print("Your choice is : ");
                  numberChoose = ip.nextInt();
              
                  break;
              case 0 :
                  System.out.println("THANK'S YOU SIR USED MY PROGRAM !!! GOOD LUCK TO YOU <3<3<3 ");
                  break;
              default:
                  System.out.println("sorry your selection is not on the menu!!!");
                  break;
                  
          } // end switch
          } //end do
          while (numberChoose != 0);
      }  //    end func hwla
    
 
     public void hw1b()
      {
           int numberChoose = 0;
          int year ;
          pickMonth pm = null ;
          System.out.println("HELLO SIR <3 <3 <3 * 1000 ");
          System.out.println("Please choose the month we give you and it will print the number of days <3 <3 <3");
          System.out.println("Enter 1 : JANUARY");
          System.out.println("Enter 2 : FEBRUARY");
          System.out.println("Enter 3 : MARCH");
          System.out.println("Enter 4 : APRIL");
          System.out.println("Enter 5 : MAY");              
          System.out.println("Enter 6 : JUNE");
          System.out.println("Enter 7 : JULY");
          System.out.println("Enter 8 : AUGUST");
          System.out.println("Enter 9 : SEPTEMBER");
          System.out.println("Enter 10: OCTOBER");
          System.out.println("Enter 11: NOVEMBER");
          System.out.println("Enter 12: DECEMBER");
          System.out.println("Enter 13: MENU OF HOMEWORK FIRST");
          System.out.println("Enter 0 : EXIT PROGRAM ( bye bye 5 5 5 )");
    
          do{
              System.out.print("Your choice is : ");
              numberChoose = ip.nextInt();
              
             switch(numberChoose)
          {
              case 1: 
                  System.out.println("you just selected January and January has 31 days");
                  break;
              case 2:
                  System.out.println("This is a special case you have to enter the whole year to determine the number of days");
                  System.out.println("<3<3<3 sorry for the inconvenience <3<3<3");
                  System.out.print("INPUT YEAR :"); year = ip.nextInt();
                          if(year % 4 == 0)//chia hết cho 4 là năm nhuận
        {
            if( year % 100 == 0)
            //nếu vừa chia hết cho 4 mà vừa chia hết cho 100 thì không phải năm nhuận
            {
                if ( year % 400 == 0)//chia hết cho 400 là năm nhuận
                    System.out.println("you just selected February and February has 29 days");
                else
                    System.out.println("you just selected February and February has 28 days");
            }
            else//chia hết cho 4 nhưng không chia hết cho 100 là năm nhuận
                    System.out.println("you just selected February and February has 29 days");
        }
        else {
                   System.out.println("you just selected February and February has 28 days");
        }
                  break;
              case 3:
                  System.out.println("you just selected March and March has 31 days");
                  break;
              case 4:
                  System.out.println("you just selected April and April has 30 days");
                  break;
              case 5:
                  System.out.println("you just selected May and May has 31 days");
                  break;
              case 6:
                  System.out.println("you just selected June and June has 30 days");
                  break;
              case 7:
                  System.out.println("you just selected July and July has 31 days");
                  break;
              case 8:
                  System.out.println("you just selected August and August has 31 days");
                  break;
              case 9:
                  System.out.println("you just selected September and September has 30 days");
                  break;
              case 10:
                  System.out.println("you just selected October and October has 31 days");
                  break;
              case 11:
                  System.out.println("you just selected November and November has 30 days");
                  break;
              case 12:
                  System.out.println("you just selected December and December has 31 days");
                  break;
              case 13:
                  System.out.println("Please choose the month we give you and it will print the number of days <3 <3 <3");
                  System.out.println("Enter 1 : JANUARY");
                  System.out.println("Enter 2 : FEBRUARY");
                  System.out.println("Enter 3 : MARCH");
                  System.out.println("Enter 4 : APRIL");
                  System.out.println("Enter 5 : MAY");              
                  System.out.println("Enter 6 : JUNE");
                  System.out.println("Enter 7 : JULY");
                  System.out.println("Enter 8 : AUGUST");
                  System.out.println("Enter 9 : SEPTEMBER");
                  System.out.println("Enter 10: OCTOBER");
                  System.out.println("Enter 11: NOVEMBER");
                  System.out.println("Enter 12: DECEMBER");
                  System.out.println("Enter 13: MENU OF HOMEWORK FIRST");
                  System.out.println("Enter 0 : EXIT PROGRAM ( bye bye 5 5 5 )");
                  System.out.print("Your choice is : ");
                  numberChoose = ip.nextInt();
              
                  break;
              case 0 :
                  System.out.println("THANK'S YOU SIR USED MY PROGRAM !!! GOOD LUCK TO YOU <3<3<3 ");
                  break;
              default:
                  System.out.println("sorry your selection is not on the menu!!!");
                  break;
                  
          } // end switch
          } //end do
          while (numberChoose != 0);
      }
    
}
