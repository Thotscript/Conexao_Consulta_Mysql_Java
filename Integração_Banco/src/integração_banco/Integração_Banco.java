
package integração_banco;

import java.sql.*;

public class Integração_Banco {

    
    public static void main(String[] args) throws SQLException {
        try{
            //Pacote com o Driver de Conexão
            Class.forName("com.mysql.cj.jdbc.Driver");
            // con = objeto que faz a conexão com o banco de dados
            // Tipo de conexão : <Banco> : Endereço IP ou url : porta / NomeDoBanco "?" informa que agora
            // vem a senha
            //user = nome de usuário "&" password=senha
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bancoteste?user=root&password=jura9090");
            //Objeto Statement é o protocolo de comunicação / idioma de comunicação
            // objeto con ("con liga e o Statement(stmt) atende a ligação")
             
            Statement stmt = con.createStatement();
             //ResulSet faz a pesquisa no banco
                ResultSet rs = stmt.executeQuery("select* from tabela1");
             while(rs.next()){
                 System.out.println("Nome");
                 System.out.print(rs.getString("Nome")+" ");
                 System.out.println(rs.getString("SobreNome"));
             }
 
          }catch(ClassNotFoundException | SQLException e){}
    }
    
}
