/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteques;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Jose
 */
public class Auxiliar {
        public static String dataActual(){
        TimeZone tz = TimeZone.getTimeZone("CET"); // or PST, MID, etc ...
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy kk:mm:ss");
        df.setTimeZone(tz);
        String currentTime = df.format(now);
        return currentTime;
    }
        
    
}
