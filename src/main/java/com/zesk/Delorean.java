package com.zesk;

/**
 * A Delorean implementation in java
 *
 *
 */
public class Delorean
{
    private int speed;

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

    public static void main( String[] args )
    {
        System.out.println("Doc construit une delorean");
        Delorean delo = new Delorean();
        //System.out.println("Nous sommes le %s" % delo.get_date());


        System.out.println("Doc refait le plein de plutonium");
        //delo.insert_plutonium();

        System.out.println("Doc programme un voyage dans le temps pour retourner en 1955");
        //delo.set_target_date("05/11/1955");

        System.out.println("Doc accelere jusqu a 89mph");
        delo.setSpeed(89);

        System.out.println("####### VOYAGE DANS LE TEMPS #########");
        //System.out.println("Nous sommes le %s" % delo.get_date());
    }
}
