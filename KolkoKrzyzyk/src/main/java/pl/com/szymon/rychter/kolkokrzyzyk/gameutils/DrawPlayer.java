/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.szymon.rychter.kolkokrzyzyk.gameutils;

import java.util.Random;

/**
 *
 * @author Szymon
 */
public class DrawPlayer {
    /**
  * draw player to start game
  * @return true means first player start
  */
    public static boolean randomPlayer(){
        Random r = new Random();
        boolean b = r.nextBoolean();
        return b;
    }
    /**
 * draw circle or cross
 * @return true means circle
 */
    public static boolean randomSign(){
        Random r = new Random();
        boolean b = r.nextBoolean();
        return b;
    } 
}
