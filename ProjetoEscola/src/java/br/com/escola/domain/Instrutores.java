/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.escola.domain;

/**
 *
 * @author frank
 */
public class Instrutores {
    //CERTIFICADOS, EMAIL, ID, NOME, VALOR_HORA;
    
    private int ID;
    private String NOME;
    private String EMAIL;
    private String CERTIFICADOS;
    private int VALOR_HORA;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getCERTIFICADOS() {
        return CERTIFICADOS;
    }

    public void setCERTIFICADOS(String CERTIFICADOS) {
        this.CERTIFICADOS = CERTIFICADOS;
    }

    public int getVALOR_HORA() {
        return VALOR_HORA;
    }

    public void setVALOR_HORA(int VALOR_HORA) {
        this.VALOR_HORA = VALOR_HORA;
    }
    
    
    
}
