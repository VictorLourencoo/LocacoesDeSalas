
package DAO;


import Connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import Model.Aluno;
import java.text.ParseException;

import view.TelaAluno;


import view.SolicitarSala_1;


public class LoginDAO {
                
 private Connection con;

 private Conexao conexao;
 
 
 public LoginDAO(Conexao conexao) throws SQLException {
        //this.tA = new TelaAluno();
        this.conexao = conexao;
    }
  //AlunoTableModel alunoModel = new AlunoTableModel();
 SolicitarSala_1 sala = new SolicitarSala_1();
 TelaAluno tA;
   

 public Aluno logar(long matricula, String senha) throws SQLException, ParseException{
   String sql=  "select * from aluno where matricula= ? and senha = ?;";
    
      Aluno aluno = null;
     try{
     this.con = conexao.getConexao();
       PreparedStatement pst = con.prepareStatement(sql);
            pst.setLong(1,matricula);
            pst.setString(2, senha);
            ResultSet rs = pst.executeQuery();
        if (rs.next()){
             aluno = new Aluno();
            aluno.setMatricula(matricula);
            aluno.setSenha(senha);
            aluno.setNome(rs.getString("Nome_aluno"));;
            aluno.setCurso(rs.getString("curso"));
            aluno.setEmail(rs.getString("email"));
                 aluno.setTelefone(rs.getLong("telefone"));
      
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
        
    
        return aluno; 
       
 }

 public boolean cadastrarAluno(Aluno aluno){
     String sql = "insert into aluno (matricula, nome_aluno, telefone, curso, email, senha)  values(?,?,?,?,?,?); ";
     try{
         this.con = conexao.getConexao();
         PreparedStatement pst =con.prepareStatement(sql);
         pst.setLong(1, aluno.getMatricula());
         pst.setString(2,aluno.getNome());
         pst.setLong(3, aluno.getTelefone());
         pst.setString(4,aluno.getCurso());
         pst.setString(5,aluno.getEmail());
         pst.setString(6,aluno.getSenha());
     
     	int qtdRowsAffected = pst.executeUpdate();
			pst.close();
			if(qtdRowsAffected > 0) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(con!=null)
				this.con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
 
 
        
          
         public Aluno BuscaMatricula_aluno(long matricula) throws SQLException{
  //boolean read = false;
     
   String sql=  "select * from aluno where matricula= ?;";
    
      Aluno aluno = null;
     try{
     this.con = conexao.getConexao();
       PreparedStatement pst = con.prepareStatement(sql);
            pst.setLong(1,matricula); 
            ResultSet rs = pst.executeQuery();
             
        if (rs.next()){
             aluno = new Aluno();
            aluno.setMatricula(matricula);
            aluno.setNome(rs.getString("Nome_aluno"));
            aluno.setCurso(rs.getString("curso"));
            aluno.setEmail(rs.getString("email"));
            aluno.setTelefone(rs.getLong("telefone"));
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
         
         
         
 
      
         
         
     }



     
     
     
 

 

      

 
    
    
 
 
 
    
    
    
    
    

    
    
    
    

