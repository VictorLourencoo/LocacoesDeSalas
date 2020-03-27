/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Connection.Conexao;
import DAO.LoginDAO;
import Model.Aluno;

import java.sql.SQLException;
import java.text.ParseException;

/**
 *
 * @author Victor Emanuel
 */
public class LoginController {
    Conexao conexao = new Conexao();
    LoginDAO login;

    public LoginController() throws SQLException {
        this.login = new LoginDAO(conexao);
    }
    
  public Aluno loginC(long matricula, String senha) throws SQLException, ParseException{
      
      return login.logar(matricula, senha);
      
  }
  
  
   
  public Aluno Busca(long matricula) throws SQLException{
      return login.BuscaMatricula_aluno(matricula);
  }

    
 

    

public boolean cadastroControl_aluno(long matricula, String nome, long telefone, String curso, String email, String senha) {
		// TODO Auto-generated method stub
	
		
		Aluno aluno = new Aluno();
		aluno.setMatricula(matricula);
                aluno.setNome(nome);
                aluno.setCurso(curso);
                aluno.setEmail(email);
                aluno.setTelefone(telefone);
                aluno.setSenha(senha);
                return login.cadastrarAluno(aluno);
                
                
	}

      
 
        
        
        
        
    
}
