/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.escola.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author frank
 */
public class ConnectionFactory {

private static final String USUARIO = "root";
private static final String SENHA = "";
private static final String URL = "jdbc:mysql://localhost:3306/projetoescola";

public static Connection conectar() throws SQLException {
DriverManager.registerDriver(new com.mysql.jdbc.Driver());
Connection conexao = DriverManager.getConnection(URL,USUARIO,SENHA);

return conexao;

}

public static void main(String [] args){
    try{
        Connection conexao = conectar();
        System.out.println(conexao);
        System.out.println("Se acima não deu erro, então eu vou rodar");
        conexao.close();
                                         
    }catch(SQLException e){
        System.out.println("Conexão Falhou o motivo é "+e.getMessage());
    }
}    
}
