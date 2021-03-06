/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;
import controleur.*;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modele.Connexion;

/**
 *
 * @author bd, comel, louis
 */





public class ConnexionGraphique extends JDialog implements ActionListener, ItemListener {
    private Connexion premiereConnexion;
    private final JLabel titre, nom, login, mdp;
    private final JTextField nomTxt, loginTxt;
    private final JPasswordField mdpTxt;
    private final JButton connect;
    private final JPanel panelA, panelB, panelBB, panelBC, panelBD, panelC;
    
    public ConnexionGraphique(JFrame parent, String title) {  //JDialog pour se connecter avant d'acceder au programme
    super(parent, title, true);
        // creation par heritage de la fenetre
        
      
        // selection des parametres de la fenetre d'identification
        setLayout(new BorderLayout());
        setBounds(0, 0, 900, 500);
        setResizable(true);
        setVisible(true);
        setLocationRelativeTo(null);
        
        // definition des noms des panneaux
        titre = new JLabel("Bienvenue, veuillez vous identifier", JLabel.RIGHT);
        nom = new JLabel("Nom de la BDD :", JLabel.RIGHT);
        login = new JLabel("Login :", JLabel.RIGHT);
        mdp = new JLabel("Mot de Passe :", JLabel.RIGHT);
        
        Font police = new Font("Arial",Font.BOLD,40);
        titre.setFont(police);
        
        nomTxt = new JTextField(10);
        loginTxt = new JTextField(10);
        mdpTxt = new JPasswordField(10);
        connect = new JButton("Ok");
        
        // definition des pannels
        panelA = new JPanel();
        panelB = new JPanel();
        panelBB = new JPanel();
        panelBC = new JPanel();
        panelBD = new JPanel();
        panelC = new JPanel();
        
        
        // insertion des noms et des boutons dans les pannels
        
        panelA.add(titre);
        panelBB.add(nom);
        panelBB.add(nomTxt);
        panelBC.add(login);
        panelBC.add(loginTxt);
        panelBD.add(mdp);
        panelBD.add(mdpTxt);
        
        panelB.setLayout(new BoxLayout(panelB, BoxLayout.PAGE_AXIS));
        panelB.add(panelBB);
        panelB.add(panelBC);
        panelB.add(panelBD);
        panelC.add(connect);
        
        add("North", panelA);
        add("Center",panelB);
        add("South",panelC);

        // listeners
        nomTxt.addActionListener(this);
        loginTxt.addActionListener(this);
        mdpTxt.addActionListener(this);
        connect.addActionListener(this);
        
        
        

        this.setVisible(true);      

        
    }
    
    
    
    

    public ConnexionGraphique() {
        throw new UnsupportedOperationException("Not supported yet."); //Je sais pas trop ce que ca fait 
    }
    
    /**
     *
     * Utilisation de  ActionPerformed pour les boutons
     * 
     *
     * @param ae
     */
   
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        // evenements
        if (source == connect) {
            String nomString = new String(nomTxt.getText());
            String loginBDDString = new String(loginTxt.getText());
            String mdpBDDString = new String(mdpTxt.getPassword());
            System.out.println("nom = " + nomString);
            System.out.println("login = " + loginBDDString);
            System.out.println("mdp = " + mdpBDDString);


           // if(nomString.equals("hopital") && loginBDDString.equals("root") && mdpBDDString.equals("")){   // [Version Finale] mdp normal
            if(nomString.equals("hopital") && loginBDDString.equals("root") && mdpBDDString.equals("")){
                System.out.println("Connexion OK");
                this.setVisible(false);
                
            }
            else{
                System.out.println("Connexion refusee");
            }


        } 
        
    }

    /**
     *
     * 
     * itemStateChanged : actions sur les elements d'une liste
     */
    @Override
    @SuppressWarnings("CallToThreadDumpStack")
    public void itemStateChanged(ItemEvent ae) { 
    }
    
}
