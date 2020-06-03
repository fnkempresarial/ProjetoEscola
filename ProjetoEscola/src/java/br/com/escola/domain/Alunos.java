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
public class Alunos {
    private int ID;
    private String CPF;
    private String NOME;
    private Date DATA_NASCIMENTO;
    private String EMAIL;
    private String FONE;
    private String POLO;
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public Date getDATA_NASCIMENTO() {
        return DATA_NASCIMENTO;
    }

    public void setDATA_NASCIMENTO(Date DATA_NASCIMENTO) {
        this.DATA_NASCIMENTO = DATA_NASCIMENTO;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getFONE() {
        return FONE;
    }

    public void setFONE(String FONE) {
        this.FONE = FONE;
    }

    public String getPOLO() {
        return POLO;
    }

    public void setPOLO(String POLO) {
        this.POLO = POLO;
    }
        
    
}
