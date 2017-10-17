package com.zesk;

import java.util.Random;

/**
 * A Delorean implementation in java
 */
public class Delorean {
    private int speed;
    private boolean plutonium = false;
    private Integer year = 2017;
    private Integer targetYear;

    public void setSpeed(int speed) {
        this.speed = speed;
        if (this.targetYear != null && this.plutonium && this.speed > 88) {
            this.year = this.targetYear;
            this.plutonium = false;
            System.out.println("Delorean traveled in time to " + this.year);
        }
    }

    public int getSpeed() {
        return this.speed;
    }

    public void insertPlutonium() {
        this.plutonium = true;
    }

    public boolean hasPlutonium() {
        return this.plutonium;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void setTargetYear(Integer year) {
        this.targetYear = year;
        // A bug in the date selector make the target date changing
        if (this.targetYear != null && new Random().nextFloat() > 0.95f) {
            int timeshift = new Random().nextInt(200) - 100;
            System.out.println("Time selector bug ! -> time shift " + timeshift);
            this.targetYear += timeshift;
        }
    }

    public Integer getTargetYear() {
        return this.targetYear;
    }

    public static void main(String[] args) {
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
