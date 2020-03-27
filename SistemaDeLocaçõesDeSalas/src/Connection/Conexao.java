package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

	/*
	 * troca aqui pela url, usuario e senha do teu banco: 
	 * 	private static final String url = "jdbc:postgresql://localhost/LocacaoDeSalas";
	 * 	private static final String usuario = "Postgres";
	   	private static final String senha = "ve9967bl";
	   
	   Só com isso já conecta, aquela parada lá do Class.forName é pra driver mais antigo
	 * */
	private static final String url = "jdbc:postgresql://localhost:5432/LocacaoDeSalas";
	private static final String usuario = "postgres";
	private static final String senha = "ve9967bl";
	
	public static Connection getConexao() throws SQLException {
		Connection con = DriverManager.getConnection(url, usuario, senha);
               return con;
        
       
        }
        
       
        
        
}
