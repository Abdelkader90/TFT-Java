/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import squad.ftt.dao.classes.EvenementDao;
import squad.ftt.dao.classes.Match_JoueurDao;
import squad.ftt.dao.classes.MatchtennisDao;
import squad.ftt.entities.Evenement;
import squad.ftt.entities.Joueur;
import squad.ftt.entities.Matchtennis;

/**
 *
 * @author esprit
 */
class EvenementDetails extends JPanel {
 ImageIcon i= new ImageIcon(getClass().getResource("/squad/ftt/images/detailsEvent.jpg"));
 MatchtennisDao ed = new MatchtennisDao();
 Match_JoueurDao matchDao = new Match_JoueurDao();
 Matchtennis e= new Matchtennis();
 public EvenementDetails() {
    
    }
    
    public void paintComponent(Graphics g){
     g.setColor(Color.white);
          g.fillRect(0, 0, 400, 600);
          
          Font font = new Font("comic sans ms", Font.PLAIN, 22);
          Font font2 = new Font("Arial", Font.PLAIN, 18);
          Font font3 = new Font("Arial", Font.PLAIN, 14);
          Font font4 = new Font("Arial", Font.PLAIN, 12);
          g.setFont(font);
          g.setColor(Color.yellow);
    super.paintComponent(g);
    g.drawImage(i.getImage(), 0, 0, null);    
    g.drawString(GestionEvenement.evenement.getLibelle() ,20,30);
    int i = 80;
    int j = 30;
    int tour = ed.findMatchByEvenement(GestionEvenement.evenement.getId_event()).get(0).getTour().getId();
    g.setFont(font2);
 
    
    for (Matchtennis m : ed.findMatchByEvenement(GestionEvenement.evenement.getId_event()))
    {  if(tour != m.getTour().getId() ) 
           { tour++;
            j= j+200;
            i=150; }
        g.setColor(Color.yellow);
        g.setFont(font3);
       
        if(!matchDao.findByMatch(m).isEmpty())
        {  g.drawString(matchDao.findByMatch(m).get(0).getNom()+" VS "+matchDao.findByMatch(m).get(1).getNom(),j,i);        
           g.setFont(font4);
           g.setColor(Color.white);
           g.drawString(String.valueOf(m.getDate_match()),j,i+15);
           g.drawString(m.getStade().getLibelle(),j+75,i+15);
           
        } 
        
        else { g.drawString("Match en attente",j,i);
        
         g.setFont(font4);
           g.setColor(Color.white);
           g.drawString(String.valueOf(m.getDate_match()),j,i+15);
           g.drawString(m.getStade().getLibelle(),j+75,i+15);
         }

               i=i+50;
         }
    
    }
    
    
    
}
