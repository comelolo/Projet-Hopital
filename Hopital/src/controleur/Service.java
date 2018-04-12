/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;


import java.util.*;
import java.sql.*;
import modele.*;

/**
 *
<<<<<<< HEAD
 * @author duthu 
=======
 * @author duthu comelolo
 * 
<<<<<<< HEAD
>>>>>>> 0743c2253783774827fdad199216afc28d794076
=======
>>>>>>> 0743c2253783774827fdad199216afc28d794076
 */
public class Service {
    
    private Connexion connect;
    public Vector<Vector> result;
    public String requete = "SELECT * FROM chambre;";
    
    
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
    
    
<<<<<<< HEAD
    public Vector<Vector> actualiser(Connexion con) {
        result = recherche(con, "SELECT * FROM service;");
        return result;
=======
    // Fonctions
    public void rechercherService(){
        //rechercher ds la bdd
    }
    
    public void majService(){
        
    }
    
    public void supprimerService(){
        
    }
    
    public void afficherService(){
        System.out.println("Code du service : "+getCodeService());
        System.out.println("- Nom du service : "+getNomService());
        System.out.println("- Batiment du service : "+getBatimentService());
        System.out.println("- Directeur du service : "+getDirecteurService());
        
>>>>>>> 0743c2253783774827fdad199216afc28d794076
    }
    

    
}
