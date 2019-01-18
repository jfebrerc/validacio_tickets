/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Biblioteques.Auxiliar;

/**
 *
 * @author Jose
 */
public class Tickets {
    /**TIPUS TICKETS*/
    /*
    General
        Adult
        Xiquet
        Visitant
        Nadó
    Express
    Tickets número viatjes
    */
    private int id_producte;
    private String data_compra;
    private String tipus;
    private String viatjes = null;

    public int getId_producte(){
        return id_producte;
    }

    public String getData_compra(){
        return data_compra;
    }

    public String getTipus(){
        return tipus;
    }

    public String getViatjes() {
        return viatjes;
    }

    public void setId_producte(int IdP){
        id_producte = IdP;
    }

    public void setData_compra(String dataC){
        data_compra = dataC;
    }

    public void setTipus(String Tp){
        tipus = Tp;
    }

    public void setViatjes(String viatjes) {
        this.viatjes = viatjes;
    }



}
