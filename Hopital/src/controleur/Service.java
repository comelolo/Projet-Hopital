

package controleur;


import java.util.*;
import java.sql.*;
import modele.*;

/**

 * @author duthu 
 * 
 */
public class Service {
    
    private Connexion connect;
    public Vector<Vector> result;
    public String requete = "SELECT * FROM chambre;";
    
    //bonjour
    //Constructeur par défaut
    
    public Service(Connexion con){
        connect = con;
        result = actualiser(con);
        
    }
    
    public Vector<Vector> recherche(Connexion connect, String new_requete) {
        Vector<Vector> result = new Vector<Vector>();
        try {
            result = connect.remplirChampsRequete(new_requete);
        } catch (SQLException e) {
            System.out.println("erreur lors de la recherche : " + e);
        }
        return result;
    }
    
    public void modifier(Connexion connect, String requete) {
        try {
            connect.executeUpdate(requete);
        } catch (SQLException e) {
            System.out.println("erreur lors de la modification : " + e);
        }
    }
    
    

    public Vector<Vector> actualiser(Connexion con) {
        result = recherche(con, "SELECT * FROM service;");
        return result;    
    }
    

    
}
