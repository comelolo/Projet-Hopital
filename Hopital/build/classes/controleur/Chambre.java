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

    private int no_chambre;
    private String code_service;
    private int surveillant;
    private int nb_lits;
    private Connexion connect;
    public Vector<Vector> result;
    public String requete = "SELECT * FROM chambre;";

    public Chambre(Connexion con) {
        connect = con;
        result = recherche(con, "SELECT * FROM chambre;");
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
    
    

    public Vector getChambre(int i) {
        return result.get(i);
    }
    
}