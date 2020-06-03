/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.escola.dao;

import br.com.escola.conexao.ConnectionFactory;
import br.com.escola.domain.Cursos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author frank
 */
public class CursosDAO {
    public void inserir(Cursos c) throws SQLException{
        
        StringBuilder sql = new StringBuilder();
        sql.append("insert into cursos ");
        sql.append("(nome, ");
        sql.append("requisito, ");
        sql.append("carga_horaria, ");
        sql.append("preco)");
        sql.append( "values (?,?,?,?)");
        
        //busca a conexao
        Connection conexao = ConnectionFactory.conectar();
        //prepara o comando para execução
        PreparedStatement comando = conexao.prepareStatement(sql.toString());
        
        //insere as icognitas definas no insert
        comando.setString(1, c.getNOME());
        comando.setString(2, c.getREQUISITO() );
        comando.setInt(3, c.getCARGA_HORARIA());
        comando.setDouble(4, c.getPRECO());
        
        //executa o comando na base de dados. 
        comando.executeUpdate();
    }
      
    public void teste_insert(){
        
        //Instanciamos a tabela de cursos como nossa entidade 
        Cursos c = new Cursos();
        //Inserimos os valores que serão cadastrados
        c.setNOME("Algoritmo");
        c.setREQUISITO("Nenhum");
        c.setCARGA_HORARIA(360);
        c.setPRECO(3500.00);
        
        //Instanciamos a classe que executa a ações dentro de banco de dados
      CursosDAO cdao = new CursosDAO();   
        
      try{
          //chamamos o metodo passando cadastro dentro do banco de dados
          cdao.inserir(c);
          System.out.println("Tá Salvo");
      }catch(SQLException ex){
          System.out.println("ERRO: " + ex.getMessage() );
      }
    }
    
    public void delete(Cursos c) throws SQLException{
    StringBuilder sql = new StringBuilder();
    sql.append("delete from cursos where id = ?");
    
          //busca a conexao
    Connection conexao = ConnectionFactory.conectar();
        //prepara o comando para execução
    PreparedStatement comando = conexao.prepareStatement(sql.toString());    
        //insere as icognitas definas no insert
    comando.setInt(1, c.getID());
    comando.executeUpdate();
    }
    
    public void teste_delete(){
        
        //Instanciamos a tabela de cursos como nossa entidade 
        Cursos c = new Cursos();
        //Inserimos os valores que serão cadastrados
         c.setID(2);
        
        //Instanciamos a classe que executa a ações dentro de banco de dados
      CursosDAO cdao = new CursosDAO();   
        
      try{
          //chamamos o metodo passando cadastro dentro do banco de dados
          cdao.delete(c);
          System.out.println("Morreu");
      }catch(SQLException ex){
          System.out.println("ERRO: " + ex.getMessage() );
      }
    }  
            
    public void atualizar(Cursos c) throws SQLException{
        StringBuilder sql = new StringBuilder();
        sql.append("update cursos set nome = ?, requisito = ?, ");
        sql.append("carga_horaria = ?, preco = ? ");
        sql.append("where id = ? ");
        
          //busca a conexao
    Connection conexao = ConnectionFactory.conectar();
        //prepara o comando para execução
    PreparedStatement comando = conexao.prepareStatement(sql.toString());    
        //insere as icognitas definas no insert
      comando.setInt(5, c.getID());
      comando.setString(1, c.getNOME());
      comando.setString(2, c.getREQUISITO());
      comando.setInt(3, c.getCARGA_HORARIA());
      comando.setDouble(4, c.getPRECO());
      comando.executeUpdate();                
    }
    
    public void teste_atualizar() throws SQLException{
        //Instanciamos a tabela de cursos como nossa entidade 
        Cursos c = new Cursos();
        //Inserimos os valores que serão cadastrados
        c.setNOME("Algoritmo");
        c.setREQUISITO("Ter no mínimo 11 anos.");
        c.setCARGA_HORARIA(120);
        c.setPRECO(1200.00);
        c.setID(3);
        //Instanciamos a classe que executa a ações dentro de banco de dados
      CursosDAO cdao = new CursosDAO();   
        cdao.atualizar(c);
    }
    
    public Cursos buscarPorId(Cursos c) throws SQLException{
        StringBuilder sql = new StringBuilder();
        sql.append("select id, nome, requisito, carga_horaria, preco from cursos ");
        sql.append("where id = ?");
        
         //busca a conexao
        Connection conexao = ConnectionFactory.conectar();
        //prepara o comando para execução
        PreparedStatement comando = conexao.prepareStatement(sql.toString());        
        //insere as icognitas definas no insert
        comando.setInt(1, c.getID());
        
        ResultSet resultado = comando.executeQuery();
        Cursos ret_curso = new Cursos() ;
        if(resultado.first()){
            ret_curso.setID(resultado.getInt("id"));
            ret_curso.setNOME(resultado.getString("nome"));
            ret_curso.setREQUISITO(resultado.getString("requisito"));
            ret_curso.setCARGA_HORARIA(resultado.getInt("carga_horaria"));
            ret_curso.setPRECO(resultado.getDouble("preco"));
        return ret_curso;                            
        }
        return ret_curso;
    }
    
    public void teste_selecao() throws SQLException{
        Cursos c = new Cursos();
        
       c.setID(3);
        
       c = this.buscarPorId(c);
        
        JOptionPane.showMessageDialog(null, c.getID()+ " " + c.getNOME()+ " " + c.getREQUISITO()+ " " +
                c.getCARGA_HORARIA()+ " " + c.getPRECO());
       
    }
    
    public List<Cursos> listar() throws SQLException {
        
         StringBuilder sql = new StringBuilder();
        sql.append("select id, nome, requisito, carga_horaria, preco from cursos ");
        sql.append("order by id asc");
        
         //busca a conexao
        Connection conexao = ConnectionFactory.conectar();
        //prepara o comando para execução
        PreparedStatement comando = conexao.prepareStatement(sql.toString());        
        
        ResultSet resultado = comando.executeQuery();
        
        List<Cursos> tabela = new ArrayList<>();
        while(resultado.next()){
            Cursos ret_curso = new Cursos() ;
            ret_curso.setID(resultado.getInt("id"));
            ret_curso.setNOME(resultado.getString("nome"));
            ret_curso.setREQUISITO(resultado.getString("requisito"));
            ret_curso.setCARGA_HORARIA(resultado.getInt("carga_horaria"));
            ret_curso.setPRECO(resultado.getDouble("preco"));
            tabela.add(ret_curso);                            
        }
        return tabela;       
    }
    
    
    public void teste_lista() throws SQLException{
        List<Cursos> tabela;
        
        tabela = this.listar();
        
        for(Cursos c : tabela){
             JOptionPane.showMessageDialog(null, c.getID()+ " " + c.getNOME()+ " " + c.getREQUISITO()+ " " +
                c.getCARGA_HORARIA()+ " " + c.getPRECO());
                        
        }
        
        
        
    }
    
    
    public static void main (String args []) throws SQLException{
        CursosDAO cdao = new CursosDAO();
        cdao.teste_lista();
        
    }
    
    
}
