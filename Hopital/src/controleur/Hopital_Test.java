/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.sql.*;
import java.util.ArrayList;
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
            ArrayList<String> liste = connect.remplirChampsTable(table);
            for (int i = 0; i < liste.size(); i++) {
                System.out.println(" " + liste.get(i) + " ");
            }
            Home hopital = new Home();
            hopital.setVisible(true);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("erreur : " + e);
        } 

    }

}
