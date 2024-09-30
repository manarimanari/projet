/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package developpement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Scripts {
static final String user ="root";
static final String password ="";; 
static final String url = "jdbc:mysql://localhost/DataBase";
  
public static void main (String []args){
Statement st = null;
Connection cn = null;

try {
//Etape 1 : Chargement du driver
Class.forName("com.mysql.jdbc.Driver");
//Etape 2 : Récupération de la connexion
cn = DriverManager.getConnection(url, user, password);
//Etape 3 : Création d'un statement
st = cn.createStatement();
String req1 = "CREATE TABLE DevData (\n" +
"Developpeurs VARCHAR (32),\n" +
"Jour CHAR (11),\n" +
"NbScripts INTEGER) ";
st.executeUpdate(req1);
System .out.println(" la table est cree ");
// Insertion des données avec les corrections
String req2 = "INSERT INTO `DevData` (`Developpeurs`, `Jour`, `NbScripts`) VALUES ('ALAMI', 'Lundi', 1)";
String req3 = "INSERT INTO `DevData` (`Developpeurs`, `Jour`, `NbScripts`) VALUES ('WAFI', 'Lundi', 2)";
String req4 = "INSERT INTO `DevData` (`Developpeurs`, `Jour`, `NbScripts`) VALUES ('SLAMI', 'Mardi', 9)";

st.executeUpdate(req2);
st.executeUpdate(req3);
st.executeUpdate(req4);

System .out.println(" les valeurs sont inseres ");
} catch (SQLException e) {
System.out.println("SQL erreur" + e.getMessage());
} catch (ClassNotFoundException ex) {
System.out.println("Impossible de charger le driver");
}finally{
   try {
//Etape 4 : Libérer les ressources de la mémoire
    if(st!=null)
st.close();
    if(cn!=null)   
cn.close();
} catch (SQLException ex) {
System.out.println("Impossible de libérer les ressources");
}
} 
}
    
}