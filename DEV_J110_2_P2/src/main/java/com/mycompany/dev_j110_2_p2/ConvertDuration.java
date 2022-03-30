/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dev_j110_2_p2;

/**
 *
 * @author USER
 */
public class ConvertDuration {
    protected static String timeToString (int secs){
        int hour = secs/3600,
                min = secs / 60 % 60,
                sec = secs /1 % 60;
        return String.format("%02d:%02d:%02d", hour, min, sec);

    }
}
