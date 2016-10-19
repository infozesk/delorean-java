package com.zesk;

import java.util.Date;
import java.text.DateFormat;

/**
 * A Delorean implementation in java
 *
 *
 */
public class Delorean
{
    private int speed;
    private boolean plutonium = false;
    private int year = 2017;
    private int targetYear;


    /*
     * @param speed: The speed in m/s
     */
    public void setSpeed(int speed){
        this.speed = speed;
    }

    /*
     * @return speed: The speed in m/s
     */
    public int getSpeed(){
        return this.speed;
    }

    public void insertPlutonium(){
        this.plutonium = true;
    }

    public boolean hasPlutonium(){
        return this.plutonium;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }

    public void setTargetYear(int year){
        this.targetYear = year;
    }

    public int getTargetYear(){
        return this.targetYear;
    }

    public static void main( String[] args )
    {
        System.out.println("Doc construit une delorean");
        Delorean delo = new Delorean();
        System.out.println("Nous sommes le " + delo.getYear());


        System.out.println("Doc refait le plein de plutonium");
        delo.insertPlutonium();

        System.out.println("Doc programme un voyage dans le temps pour retourner en 1955");
        delo.setTargetYear(1955);

        System.out.println("Doc accelere jusqu a 89mph");
        delo.setSpeed(89);

        System.out.println("####### VOYAGE DANS LE TEMPS #########");
        System.out.println("Nous sommes en " + delo.getYear());
    }
}
