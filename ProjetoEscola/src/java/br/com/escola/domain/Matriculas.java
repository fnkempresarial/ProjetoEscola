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
public class Matriculas {
    //ID, ALUNOS_ID, DATA_MATRICULA, TURMAS_ID;
    
    private int ID;
    private int ALUNOS_ID;
    private Date DATA_MATRICULA;
    private int TURMAS_ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getALUNOS_ID() {
        return ALUNOS_ID;
    }

    public void setALUNOS_ID(int ALUNOS_ID) {
        this.ALUNOS_ID = ALUNOS_ID;
    }

    public Date getDATA_MATRICULA() {
        return DATA_MATRICULA;
    }

    public void setDATA_MATRICULA(Date DATA_MATRICULA) {
        this.DATA_MATRICULA = DATA_MATRICULA;
    }

    public int getTURMAS_ID() {
        return TURMAS_ID;
    }

    public void setTURMAS_ID(int TURMAS_ID) {
        this.TURMAS_ID = TURMAS_ID;
    } 
    
}
