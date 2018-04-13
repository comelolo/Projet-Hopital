/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.sql.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;
import modele.Connexion;
import vue.*;

/**
 *
 * @author comel
 */
public class Hopital_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        Connexion connect = null;

        try {
            connect = new Connexion("hopital", "root", "");
            String table = "chambre";
            String requete = "SELECT * FROM chambre;";
            Vector<Vector> ligne= connect.remplirChampsRequete(requete);
            
            for (int j = 0; j < ligne.size(); j++) {   
                Vector n = new Vector();
                String champ="";
                n = ligne.get(j);
                for (int i = 0; i < n.size(); i++) {   
                    champ = champ + " " + n.get(i);
                }
                champ=champ + "\n";
                System.out.println(champ);
            }
            
            Home hopital = new Home(connect);
            /**
            ConnexionGraphique connexion = new ConnexionGraphique(hopital);
            *  si connexion valider alors
            *   connexion.setVisible(false);
            *   hopital.setVisible(true);
            * 
            */
            
            
            hopital.setVisible(true);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("erreur : " + e);
        } 

    }

}
