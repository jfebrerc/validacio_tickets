/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Jose
 */
import Biblioteques.IO;
import java.util.Scanner;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String VERSIO = "0.01";
        IO.imprimirTI("Iniciant el supersistema de validació de ticket " + VERSIO);
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String id_lector = sc.nextLine();
        }
    }
    
}
