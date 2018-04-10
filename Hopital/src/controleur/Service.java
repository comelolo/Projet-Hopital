/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

/**
 *
 * @author duthu comelolo
 */
public class Service {
    
    int codeService;
    String nomService;
    int batimentService;
    String directeurService;
    
    
    //Constructeur par défaut
    
    public Service(){
        System.out.println("Création d'un nouveau service par défaut");
        codeService=123;
        nomService="Service";
        batimentService=0;
        directeurService="Dupont";
    }
    
    
    //Getters
    public int getCodeService(){
        return codeService;
    }
    
    public String getNomService(){
        return nomService;       
    }
    
    public int getBatimentService(){
        return batimentService;
    }
    
    public String getDirecteurService(){
        return directeurService;
    }
    
    //Setters
    public void setCodeService(int pCodeService){
        codeService=pCodeService;
    }
    
    public void setNomService(String pNomService){
        nomService=pNomService;
    }
    
    public void setBatimentervice(int pBatimentService){
        batimentService=pBatimentService;
    }
    
    public void setDirecteurService(String pDirecteurService){
        directeurService=pDirecteurService;
    }
    
    
    // Fonctions
    public void rechercherService(){
        //rechercher dans la bdd
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
        
    }
    
    
}
