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
 * @author bd, comel
 */





public class ConnexionGraphique extends JDialog implements ActionListener, ItemListener {
    private Connexion premiereConnexion;
    private final JLabel titre, nom, login, mdp;
    private final JTextField nomTxt, loginTxt;
    private final JPasswordField mdpTxt;
    private final JButton connect;
    private final JPanel p0, p1, p11, p12, p13, p2;
    
    public ConnexionGraphique(JFrame parent, String title) {  //JDialog pour se connecter avant d'acceder au programme
    super(parent, title, true);
        // creation par heritage de la fenetre
        //super("Identification");
      
        // mise en page (layout) de la fenetre visible
        setLayout(new BorderLayout());
        setBounds(0, 0, 800, 400);
        setResizable(true);
        setVisible(true);
        setLocationRelativeTo(null);
        
        // creation des labels
        titre = new JLabel("Bienvenue, veuillez vous identifier", JLabel.CENTER);
        nom = new JLabel("Nom de la BDD :", JLabel.CENTER);
        login = new JLabel("Login :", JLabel.CENTER);
        mdp = new JLabel("Mot de Passe :", JLabel.CENTER);
        Font police = new Font("Arial",Font.BOLD,40);
        titre.setFont(police);
        
        nomTxt = new JTextField(8);
        loginTxt = new JTextField(8);
        mdpTxt = new JPasswordField(8);   
        
        connect = new JButton("Ok");
        
        // mise en place des panneaux
        p0 = new JPanel();
        p1 = new JPanel();
        p11 = new JPanel();
        p12 = new JPanel();
        p13 = new JPanel();
        p2 = new JPanel();
        
        
        // ajout des objets graphiques dans les panneaux
        p0.add(titre);
        p11.add(nom);
        p11.add(nomTxt);
        p12.add(login);
        p12.add(loginTxt);
        p13.add(mdp);
        p13.add(mdpTxt);
        p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
        p1.add(p11);
        p1.add(p12);
        p1.add(p13);
        p2.add(connect);

        // ajout des listeners
        nomTxt.addActionListener(this);
        loginTxt.addActionListener(this);
        mdpTxt.addActionListener(this);
        connect.addActionListener(this);
        
        // disposition geographique des panneaux
        add("North", p0);
        add("Center",p1);
        add("South",p2);

        this.setVisible(true);      

        // pour fermer la fenetre
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent ae) {
                System.exit(0); // tout fermer												
                
            }
        });
    }
    
    
    
    

    public ConnexionGraphique() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     *
     * Pour gerer les actions sur les boutons on utilise la fonction
     * actionPerformed
     *
     * @param ae
     */
    @Override
    @SuppressWarnings("CallToThreadDumpStack")
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        // tester cas de la commande evenementielle
        if (source == connect) {
            String nomString = new String(nomTxt.getText());
            String loginBDDString = new String(loginTxt.getText());
            String mdpBDDString = new String(mdpTxt.getPassword());
            System.out.println("nom = " + nomString);
            System.out.println("login = " + loginBDDString);
            System.out.println("mdp = " + mdpBDDString);


           // if(nomString.equals("hopital") && loginBDDString.equals("root") && mdpBDDString.equals("")){   // [Version Finale] mdp normal
            if(nomString.equals("") && loginBDDString.equals("") && mdpBDDString.equals("")){
                System.out.println("Connexion OK");
                this.setVisible(false);
                
            }
            else{
                System.out.println("Connexion refusee");
            }

/*
            try {
                try {
                    // tentative de connexion si les 4 attributs sont remplis
                    //maconnexion = new Connexion(nomString, loginBDDString, mdpBDDString);
                    premiereConnexion = new Connexion("hopital", "root", "");
                    System.out.println("connexion ok");
                    String a=new String();
                    this.setVisible(false);
                    //FenetreMenu fen = new FenetreMenu(this);
                } catch (ClassNotFoundException cnfe) {
                    System.out.println("Connexion echouee : probleme de classe"); 
                    cnfe.printStackTrace();
                }
            } catch (SQLException e) {
                System.out.println("Connexion echouee : probleme SQL");
                e.printStackTrace();
            }

*/            
        } 
        
    }

    /**
     *
     * Pour gerer les actions sur items d'une liste on utilise la methode
     * itemStateChanged
     */
    @Override
    @SuppressWarnings("CallToThreadDumpStack")
    public void itemStateChanged(ItemEvent ae) { 
    }
    
}
