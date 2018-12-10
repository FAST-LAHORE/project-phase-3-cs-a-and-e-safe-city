/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safecity;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
 
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Bilal
 */
public class RuntimeSurviellance extends JFrame{
    
     RuntimeSurviellance(){
        Browser browser = new Browser();
        BrowserView browserView = new BrowserView(browser);
 
        
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.add(browserView, BorderLayout.CENTER);
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
 
        browser.loadURL("http://english.cctv.com/live/");
    }
    
}
