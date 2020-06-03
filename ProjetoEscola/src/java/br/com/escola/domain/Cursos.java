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
public class Cursos {
    //ID, CARGA_HORARIA,NOME, PRECO, REQUISITO
    private int ID;
    private int CARGA_HORARIA;
    private String NOME;
    private double PRECO;
    private String REQUISITO;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCARGA_HORARIA() {
        return CARGA_HORARIA;
    }

    public void setCARGA_HORARIA(int CARGA_HORARIA) {
        this.CARGA_HORARIA = CARGA_HORARIA;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public double getPRECO() {
        return PRECO;
    }

    public void setPRECO(double PRECO) {
        this.PRECO = PRECO;
    }

    public String getREQUISITO() {
        return REQUISITO;
    }

    public void setREQUISITO(String REQUISITO) {
        this.REQUISITO = REQUISITO;
    }
    
    
    
}
