/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;



/**
 *
 * @author Victor Emanuel
 */
public class Aluno {

    private String nome;
    private long Matricula;
    private String email;
    private long telefone;
    private String senha;
    private String curso;

    public Aluno(String nome, long Matricula, String email, long telefone, String senha, String curso) {
        this.nome = nome;
        this.Matricula = Matricula;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.curso = curso;
    }

    public Aluno() {
        
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return Matricula;
    }

    public void setMatricula(long Matricula) {
        this.Matricula = Matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
