/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.escola.domain;

import java.util.Date;

/**
 *
 * @author frank
 */
public class Turmas {
    //CARGA_HORARIA, CURSOS_ID, DATA_FINAL, DATA_INICIO, ID, INSTRUTORES_ID, NOME_TURMA
    
    private int CARGA_HORARIA;
    private int CURSOS_ID;
    private Date DATA_FINAL;
    private Date DATA_INICIO;
    private int ID;
    private int INSTRUTORES_ID;
    private String NOME_TURMA;

    public int getCARGA_HORARIA() {
        return CARGA_HORARIA;
    }

    public void setCARGA_HORARIA(int CARGA_HORARIA) {
        this.CARGA_HORARIA = CARGA_HORARIA;
    }

    public int getCURSOS_ID() {
        return CURSOS_ID;
    }

    public void setCURSOS_ID(int CURSOS_ID) {
        this.CURSOS_ID = CURSOS_ID;
    }

    public Date getDATA_FINAL() {
        return DATA_FINAL;
    }

    public void setDATA_FINAL(Date DATA_FINAL) {
        this.DATA_FINAL = DATA_FINAL;
    }

    public Date getDATA_INICIO() {
        return DATA_INICIO;
    }

    public void setDATA_INICIO(Date DATA_INICIO) {
        this.DATA_INICIO = DATA_INICIO;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getINSTRUTORES_ID() {
        return INSTRUTORES_ID;
    }

    public void setINSTRUTORES_ID(int INSTRUTORES_ID) {
        this.INSTRUTORES_ID = INSTRUTORES_ID;
    }

    public String getNOME_TURMA() {
        return NOME_TURMA;
    }

    public void setNOME_TURMA(String NOME_TURMA) {
        this.NOME_TURMA = NOME_TURMA;
    }
    
    
    
    
    
}
