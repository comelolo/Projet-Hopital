/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.*;
import java.sql.*;

/**
 *
 * @author comel
 */
public class Chambre {

    private int no_chambre;
    private String code_service;
    private int surveillant;
    private int nb_lits;
    private ArrayList<String> result;
    public String requete = "SELECT * FROM chambre;";

    public Chambre(Connexion connect) {
        try {
            result = connect.remplirChampsRequete(requete);
        } catch (SQLException e) {
            System.out.println("erreur : " + e);
        }
    }

    
    public ArrayList recherche(Connexion connect, String new_requete) {
        try {
            result = connect.remplirChampsRequete(new_requete);
        } catch (SQLException e) {
            System.out.println("erreur lors de la recherche : " + e);
        }
        return result;
    }

    public String getChambre(int i) {
        return result.get(i);
    }
}
