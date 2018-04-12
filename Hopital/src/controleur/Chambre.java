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
 * @author comel
 */
public class Chambre {

    private Connexion connect;
    public Vector<Vector> result;
    public String requete = "SELECT * FROM service;";

    public Chambre(Connexion con) {
        connect = con;
        result = actualiser(con);
    }

    /**
     *
     * @param connect
     * @param new_requete
     * @return
     */
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
        result = recherche(con, "SELECT * FROM chambre;");
        return result;
    }
    

    public Vector getChambre(int i) {
        return result.get(i);
    }
    
}