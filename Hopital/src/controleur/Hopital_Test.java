/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

import java.sql.*;
import java.util.*;
import modele.Connexion;

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
       try
       {
        Connexion connect = new Connexion("hopital", "root", "");
       } catch(SQLException e) {
           System.out.println("erreur : " + e);
       } catch(ClassNotFoundException e2) {
           System.out.println("erreur : " + e2);
       }
       
    }
    
}
