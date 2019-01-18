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
        Adult               --> ticket_general_adult
        Xiquet              --> ticket_general_xiquet
        Visitant            --> ticket_general_visitant
        Nadó                --> ticket_general_nado
    Express                 --> ticket_express
        Adult               --> ticket_express_adult
        Xiquet              --> ticket_express_xiquet
    Tickets número viatjes  --> ticket_numero_viatjes
        Adult               --> ticket_viatjes_adult
        Xiquet              --> ticket_viatjes_xiquet
    */
    private int id_producte;
    private String data_compra;
    private String tipus;
    private String viatjes;

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
