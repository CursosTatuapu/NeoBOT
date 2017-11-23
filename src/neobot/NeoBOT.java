/*
 * Projeto do curso de bots para coleta de dados online
comandos para instalar em ubuntu
wget https://github.com/mozilla/geckodriver/releases/download/v0.16.1/geckodriver-v0.16.1-linux64.tar.gz
sudo sh -c 'tar -x geckodriver -zf geckodriver-v0.16.1-linux64.tar.gz -O > /usr/bin/geckodriver'
sudo chmod +x /usr/bin/geckodriver
rm geckodriver-v0.16.1-linux64.tar.gz
 */
package neobot;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author Tatuapu
 */
public class NeoBOT {

    private static WebDriver driver;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.setProperty("webdriver.gecko.driver", "geckodriver");
        driver = new FirefoxDriver();
        
        
        driver.get("http://www.submarino.com.br");
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(NeoBOT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
