package safecity;
import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
 
import javax.swing.*;
import java.awt.*;
 
/**
 * This sample demonstrates how to create Browser instance,
 * embed it into Swing BrowserView container, display it in JFrame and
 * navigate to the "www.google.com" web site.
 */
public class GoogleMapsSample extends  JFrame{
      GoogleMapsSample(){
        Browser browser = new Browser();
        BrowserView browserView = new BrowserView(browser);
 
        
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.add(browserView, BorderLayout.CENTER);
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
 
        browser.loadURL("https://www.google.com/maps/@31.576451,74.3151784,15z");
    }
}