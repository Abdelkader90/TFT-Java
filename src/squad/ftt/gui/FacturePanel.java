/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import squad.ftt.dao.classes.ArticlesDao;
import squad.ftt.dao.classes.SoldesDao;
import squad.ftt.entities.Articles;
import squad.ftt.entities.Soldes;
 
public class FacturePanel extends JPanel implements ActionListener { 
 
    private int h=this.getHeight();
    private int w=this.getWidth();
    DateFormat df = new SimpleDateFormat("dd/MM/yy \n HH:mm:ss");
    DateFormat df3 = new SimpleDateFormat("ddMMyyHHmss");
    DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
    Calendar calobj = Calendar.getInstance();
    JButton validerPaiement= new JButton("Valider Paiement");

    public FacturePanel() {
          
    validerPaiement.setLayout(null);
    validerPaiement.addActionListener((ActionListener) this);
    this.add(validerPaiement,BorderLayout.SOUTH);
  }
     
    
    
    public void paintComponent(Graphics g){
          g.setColor(Color.white);
          g.fillRect(0, 0, 400, 600);
          
          Font font = new Font("Courier", Font.BOLD, 12);
          g.setFont(font);
          g.setColor(Color.black);
          g.drawRect(0, 0, 395, 520);
          g.drawString("Fédération Tunisienne de Tennis",10,20);  
          g.drawString(df.format(calobj.getTime()),15,35);  
          
          //nom d'utilisateur Courant
          g.drawString("Rached B.Ayed",300,20);
          g.drawLine(0,50,400,50);
          g.drawString("Facture numéro :"+df3.format(calobj.getTime()),100,64);
          g.drawLine(0,70,400,70);
          g.drawLine(0,90,400,90);
          g.drawString("Bon de Commande",140,105);
          g.drawLine(0,120,400,120);
          g.drawString("Liste des articles",30,135);
          g.drawString("Prix Unitaire",170,135);
          g.drawLine(160,150,400,150);
          g.drawString("Nombre",260,135);
          g.drawLine(250,120,250,400);
          g.drawString("Total",330,135);
          g.drawLine(310,120,310,400);
          
          int x = 170;
          //boucle pour les produits Pas = 20;
          if ( AffichageArticles.Livraison )
          {
           g.drawString("Colissimo",30,x);           
           g.drawString("10",200,x);
           g.drawString("1",270,x);
           g.drawString("10",330,x);
           x=x+20;
          }
          for(int i = 0 ; i<AffichageArticles.arts.size();i++){
           g.drawString(AffichageArticles.arts.get(i).getLibelle_article(),30,x);           
           g.drawString(String.valueOf(AffichageArticles.arts.get(i).getPrix()),200,x);
           g.drawString("1",270,170);
           g.drawString(String.valueOf(AffichageArticles.arts.get(i).getPrix()),330,x);
          x=x+20;
          }
          g.drawLine(160,120,160,400);
          g.drawLine(0,400,400,400);
          g.drawString("Total :",300,430); 
          g.drawString(AffichageArticles.total.toString(),340,430); 
    validerPaiement.setBounds(100, 530, 220, 30); 

    }               
  
    
    public static BufferedImage getScreenShot(Component component)
    {
        BufferedImage image = new BufferedImage(component.getWidth(),component.getHeight()-70,BufferedImage.TYPE_INT_RGB);
          component.paint(image.getGraphics());
          return image;
    }
    public static void saveScreen(Component component,String filename) throws IOException
    { BufferedImage image = getScreenShot(component);
   // upload To server Localhost 
    ImageIO.write(image,"png",new File(filename));
    
    
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
          SoldesDao sd = new SoldesDao();
            JOptionPane jop3= new JOptionPane();
        if ( sd.getUserSoldes(Authentification.user)> Float.parseFloat(AffichageArticles.total.toString()))
        { 
        Articles a = new Articles();
        ArticlesDao aDao =  new ArticlesDao();
      ;
     Soldes s = new Soldes();
        for (Articles ac : AffichageArticles.arts )       
     {
        a= aDao.findArticleById(ac.getId_articles());
        a.setEtat_article("Indisponnible");
        a.setUser_id_user(Authentification.user);
        aDao.updateArticle(a);
    
     }  
        
        try {
            saveScreen(this,"C://wamp//www//SquadWeb//web//uploads/"+df3.format(calobj.getTime())+".png");
        } catch (IOException ex) {
            Logger.getLogger(FacturePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     s.setValeur(Double.valueOf(AffichageArticles.total.toString()));
     s.setDate_ajout(Date.valueOf(df2.format(calobj.getTime())));
     s.setPreuve(df3.format(calobj.getTime())+".png");
     s.setUser_id_user(Authentification.user.getId());
     s.setType_transaction("retrait");
     sd.addSoldes(s); }
        else 
        {
          JOptionPane.showMessageDialog(null,"Votre solde est insuffisant");
        }
    }
    
}