/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package materdev_btvn1;

/**
 *
 * @author Nam
 */
public enum pickMonth {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);
    
    private final int sumDay;
    pickMonth(int sumDay)
       {
           this.sumDay = sumDay;
       }
    
    public int sumDay()
       {
           return this.sumDay;
       }
    
}
