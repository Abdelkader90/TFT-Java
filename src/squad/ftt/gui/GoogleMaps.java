/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squad.ftt.gui;

/**
 *
 * @author hppro
 */


  
import javax.swing.*;
import java.awt.*;
  
/**
 * This sample demonstrates how to create Browser instance,
 * embed it into Swing BrowserView container, display it in JFrame and
 * navigate to the "www.google.com" web site.
 */

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
 
import squad.ftt.entities.Stade;
 
public class GoogleMaps extends javax.swing.JFrame{
     static Stade s;
     
    public GoogleMaps(Stade stade){
       this.s=stade;
       final Browser browser = new Browser();
       BrowserView browserView = new BrowserView(browser);
       JFrame frame = new JFrame("Map");
       frame.add(browserView, BorderLayout.CENTER);
       frame.setSize(900, 500);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
       browser.loadURL("http://www.google.com/maps/place/"+stade.getLibelle()+","+stade.getLieu()+","+"Tunisie");   
    }
   
   public static void main(String[] args) {
      GoogleMaps ge;          
      ge = new GoogleMaps(s);
                     
                    
       
       
       
       
   

}
}

