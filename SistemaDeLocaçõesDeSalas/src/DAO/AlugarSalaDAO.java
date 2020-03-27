
package DAO;

import Connection.Conexao;
import Model.Aluno;
import Model.LocationAluno;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AlugarSalaDAO {
    
                
 private Connection con;

 private Conexao conexao;
 
 public AlugarSalaDAO(Conexao conexao) {
        this.conexao = conexao;
    }   

   
    
    
    
   public boolean locationAluno(LocationAluno location) throws SQLException{

    String sql = "insert into alocacao_salas_alunos  values(?,?,?,?);";
  
    //String data_alocacao = location.getAno()+ "-" location.getMes();
 
    
     try{
         this.con = Conexao.getConexao();
         int qtdRowsAffected;
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setLong(1,location.getMatricula_aluno());
            pst.setInt(2, location.getId_sala());
            pst.setString(3,location.getData_alocacao());
            pst.setString(4, location.getHorario());
            
            
            qtdRowsAffected = pst.executeUpdate();
        }
			if(qtdRowsAffected > 0) {
				return true;
			}
			return false;
		} catch (SQLException e) {
		} finally {
			try {
				if(con!=null)
				this.con.close();
			} catch(SQLException e) {
			}
		}
		return false;
    
    
    
    
    
}
   
   public LocationAluno BuscaSalaOcupada(int id) throws SQLException{
  //boolean read = false;
     
   String sql=  "select * from alocacao_salas_alunos where id_sala=?;";
    
     LocationAluno aluno = null;
     try{
     this.con = conexao.getConexao();
       PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,id); 
            ResultSet rs = pst.executeQuery();
             
        if (rs.next()){
         aluno = new LocationAluno();
          aluno.setId_sala(rs.getInt(1));  
         aluno.setMatricula_aluno(rs.getLong("matricula_aluno"));   
         
         aluno.setData_alocacao(rs.getString("data_alocacao"));
         aluno.setHorario(rs.getString("horario"));
        }
        
        pst.close();

     }catch(Exception e){
         e.printStackTrace();
     }finally {
         try{
             this.con.close();
         }catch(SQLException e){
             e.printStackTrace();
         }
     }
  
       // ff.imprimir(aluno);
        return aluno;
     
       
 } 
   
   public boolean deleteAlocacao(int id ){
     String  sql ="Delete from alocacao_salas_alunos where id_sala = ?; ";
     
     
     
     try{
     this.con = conexao.getConexao();
       PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,id); 
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
