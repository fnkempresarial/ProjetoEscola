/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.escola.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author frank
 */
public class JSFutil {
        
    public static void adicionaMensagemSucesso(String Mensagem){
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, Mensagem, Mensagem); 
        FacesContext contexto  = FacesContext.getCurrentInstance();
        contexto.addMessage(null, msg);
    }
    public static void adicionaMensagemErro(String Mensagem){
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, Mensagem, Mensagem); 
        FacesContext contexto  = FacesContext.getCurrentInstance();
        contexto.addMessage(null, msg);
    }
}
