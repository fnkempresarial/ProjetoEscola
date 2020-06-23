/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.escola.bean;

import br.com.escola.dao.CursosDAO;
import br.com.escola.domain.Cursos;
import br.com.escola.util.JSFutil;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author frank
 */

@ManagedBean(name="MBCursos")
@ViewScoped
public class CursosBean implements Serializable {
    private Cursos cursos;
    private List<Cursos> itens;
    private List<Cursos> filtraitens;

    public List<Cursos> getFiltraitens() {
        return filtraitens;
    }

    public void setFiltraitens(List<Cursos> filtraitens) {
        this.filtraitens = filtraitens;
    }
       
    public Cursos getCursos() {
        return cursos;
    }

    public void setCursos(Cursos cursos) {
        this.cursos = cursos;
    }

    public List<Cursos> getItens() {
        return itens;
    }

    public void setItens(List<Cursos> itens) {
        this.itens = itens;
    }
    
   @PostConstruct
   public void buscarPesquisa(){
       CursosDAO cdao = new CursosDAO();
       try{
       List<Cursos> lista = cdao.listar();
       filtraitens = lista;
       itens = lista;
       
      }catch(SQLException ex){
           
       }
   }
   
   public void iniciacurso(){
       cursos = new Cursos();
   }
   
   
   public void cadastra(){
       CursosDAO cdao = new CursosDAO();
        try {           
            cdao.inserir(cursos);
           List<Cursos> lista = cdao.listar();
           itens = lista;
           filtraitens = lista;
           JSFutil.adicionaMensagemSucesso("Curso Salvo com sucesso");
        } catch (SQLException ex) {           
            JSFutil.adicionaMensagemErro(ex.getMessage());
        }
   
   }
   
    
}
