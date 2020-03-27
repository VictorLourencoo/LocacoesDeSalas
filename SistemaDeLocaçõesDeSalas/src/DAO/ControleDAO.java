/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.Conexao;
import Model.LocationAluno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class ControleDAO {

                      
 private Connection con;

 private Conexao conexao;
 
 
 public ControleDAO(Conexao conexao) {
        this.conexao = conexao;
    }
 
 
 public boolean verifica() throws SQLException, ParseException{
     
     ArraysDAO location = new ArraysDAO(conexao);
      SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
      
     for(LocationAluno locacao: location.arraysLocation()){
                
         java.util.Date data = formato.parse(locacao.getData_alocacao());
    java.util.Date hoje = new java.util.Date();
                  String dat= formato.format(hoje);
                   java.util.Date atual = formato.parse(dat);
    
      
     /*String hora1 = locacao.getHorario().substring(0,2);
     String hora2= locacao.getHorario().substring(3);
     int comeco = Integer.parseInt(hora1);
     int fim= Integer.parseInt(hora2);
     */
           if(atual.after(data)){
           /// ainda vai acontecer
            delete(locacao.getMatricula_aluno());  
    return true;
       }
        
         
           
           
        }
     return false;
 }
 
 public boolean delete(long matricula){
     String  sql ="Delete * from alocacao_salas_alunos where matricula_aluno = ?; ";
     
     
     
     try{
     this.con = conexao.getConexao();
       PreparedStatement pst = con.prepareStatement(sql);
            pst.setLong(1,matricula); 
            ResultSet rs = pst.executeQuery();
          
     int qtdRowsAffected = pst.executeUpdate();
			pst.close();
			if(qtdRowsAffected > 0) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			System.out.println("");
		} finally {
			try {
				this.con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
 
}
}


