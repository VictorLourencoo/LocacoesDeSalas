
package Controller;

import Connection.Conexao;
import DAO.AlugarSalaDAO;
import DAO.ControleDAO;
import Model.Aluno;
import Model.LocationAluno;
import java.util.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;



public class Alugar_SalaController {
    Conexao conexao = new Conexao();
    AlugarSalaDAO alugarSala = new AlugarSalaDAO(conexao);
   
    public boolean locationAluno(long matricula, int cod_sala, String horario, String data_alocacao ) throws SQLException, ParseException{
    
 
   // java.sql.Date data =  (java.sql.Date) new SimpleDateFormat("yyyy/mm/dd").parse(data_alocacao);
    
    LocationAluno location = new LocationAluno();
    location.setMatricula_aluno(matricula);
    location.setData_alocacao(data_alocacao);
    location.setId_sala(cod_sala);
    location.setHorario(horario);
  
            return alugarSala.locationAluno(location);
            
    }
    
    
      ControleDAO controle = new ControleDAO(conexao);
public boolean deleteLocacao(int n) {
		// TODO Auto-generated method stub
		if (n <= 0) {
			return false;
		}
		return alugarSala.deleteAlocacao(n);	
	}

public boolean verificad() throws SQLException, ParseException{
    
    
    return controle.verifica();
}
    
public LocationAluno ocupada(int cod) throws SQLException{
    return alugarSala.BuscaSalaOcupada(cod);
}
    
    
    
}
