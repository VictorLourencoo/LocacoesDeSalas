    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Calendar;
import java.util.Date;




public class LocationAluno {

    private long matricula_aluno;
    private int Id_sala;
    private String data_alocacao;
    private String horario;

    public LocationAluno(long matricula_aluno, int Id_sala, String data_alocacao, String horario) {
        this.matricula_aluno = matricula_aluno;
        this.Id_sala = Id_sala;
        this.data_alocacao = data_alocacao;
        this.horario = horario;
    }

    public LocationAluno() {
    }
    
    

    public long getMatricula_aluno() {
        return matricula_aluno;
    }

    public void setMatricula_aluno(long matricula_aluno) {
        this.matricula_aluno = matricula_aluno;
    }

    public int getId_sala() {
        return Id_sala;
    }

    public void setId_sala(int Id_sala) {
        this.Id_sala = Id_sala;
    }

    public String getData_alocacao() {
        return data_alocacao;
    }

    public void setData_alocacao(String data_alocacao) {
        this.data_alocacao = data_alocacao;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    
    

}