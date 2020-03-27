/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Connection.Conexao;
import Model.Aluno;
import Model.LocationAluno;
import Model.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import view.TelaAluno;

/**
 *
 * @author Victor Emanuel
 */
public class ArraysDAO {
                  
 private Connection con;

 private Conexao conexao;
 
 
 public ArraysDAO(Conexao conexao) {
        this.conexao = conexao;
    }

   
    
   
    
    public List<LocationAluno> arraysLocation() throws SQLException{
         String sql = "select * from alocacao_salas_alunos;";
         List<LocationAluno> locationAluno= new ArrayList<LocationAluno>();
       
   
     try{
         this.con = conexao.getConexao();
       PreparedStatement pst = con.prepareStatement(sql);
       ResultSet rs = pst.executeQuery();
       while(rs.next()){
          LocationAluno location = new LocationAluno();
           location.setMatricula_aluno(rs.getLong("matricula_aluno"));
           location.setId_sala(rs.getInt("id_sala"));
           location.setHorario(rs.getString("horario"));
           location.setData_alocacao(rs.getString("data_alocacao"));    
          
          locationAluno.add(location);
        }
       pst.close();
		} catch (SQLException e) {
			System.out.println("");
		} finally {
			try {
				this.con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return locationAluno;
     
     
     }
    
    

      
    public List<Sala> arraysSalas(int id_bloco) throws SQLException{
        String sql = null;
        
        if( id_bloco == 1){
         sql = "select * from Alocacao(1);";
        }else if(id_bloco == 2) {
            sql = "select * from Alocacao(2);";
        }else if(id_bloco == 3){
            sql = "select * from Alocacao(3);";
            
        }else if(id_bloco ==4){
            sql ="select * from Alocacao(4);";
        }else if(id_bloco == 5){
            sql = "select * from Alocacao(5);";
        }else {
            JOptionPane.showMessageDialog(null, "Nenhum bloco encontrado");
            
            new TelaAluno().setVisible(true);
        }
        
        List<Sala> salas= new ArrayList<Sala>();
       
   
     try{
         this.con = conexao.getConexao();
       PreparedStatement pst = con.prepareStatement(sql);
       ResultSet rs = pst.executeQuery();
       while(rs.next()){
         Sala sala = new Sala();
         sala.setId_sala(rs.getInt("id_sala"));
         sala.setId_bloco(rs.getInt("id_bloco"));
         sala.setCapacidade(rs.getInt("capacidade"));
         sala.setAndar(rs.getInt("andar"));
         sala.setDescricao(rs.getString("descricao"));
         
         salas.add(sala);
        }
       pst.close();
		} catch (SQLException e) {
			      JOptionPane.showMessageDialog(null, "erro");
		} finally {
			try {
				this.con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return salas;
     
     
     }
    
     public List<Sala> arraysBusca(int id_bloco) throws SQLException{
        String sql = null;
        
        if( id_bloco == 1){
         sql = "select * from vazias(1);";
        }else if(id_bloco == 2) {
            sql = "select * from vazias(2);";
        }else if(id_bloco == 3){
            sql = "select * from vazias(3);";
            
        }else if(id_bloco ==4){
            sql ="select * from vazias(4);";
        }else if(id_bloco == 5){
            sql = "select * from vazias(5);";
        }else {
            JOptionPane.showMessageDialog(null, "Nenhum bloco encontrado");
            
            new TelaAluno().setVisible(true);
        }
        
        List<Sala> salas= new ArrayList<Sala>();
       
   
     try{
         this.con = conexao.getConexao();
       PreparedStatement pst = con.prepareStatement(sql);
       ResultSet rs = pst.executeQuery();
       while(rs.next()){
         Sala sala = new Sala();
         sala.setId_sala(rs.getInt("id_sala"));
         sala.setId_bloco(rs.getInt("id_bloco"));
         sala.setCapacidade(rs.getInt("capacidade"));
         sala.setAndar(rs.getInt("andar"));
         sala.setDescricao(rs.getString("descricao"));
         
         salas.add(sala);
        }
       pst.close();
		} catch (SQLException e) {
			      JOptionPane.showMessageDialog(null, "erro");
		} finally {
			try {
				this.con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return salas;
     
     
     }
    
}
    

