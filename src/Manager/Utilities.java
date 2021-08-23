package Manager;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.controlsfx.control.Notifications;

public class Utilities{
    public static char character;
    public static JFileChooser jfc;
    public static FileNameExtensionFilter filter;
    public static ImageIcon imageIcon;
    public static Image img;
    static int n1, n2, a, b;
    public static JFrame browse,select;
    public static FileChooser chooser = new FileChooser();
    public static File f;

    public static void isDigit(java.awt.event.KeyEvent KEY){
        character = KEY.getKeyChar();
        if(!Character.isDigit(character))
            KEY.consume();
    }

    public static String myFileChooser(){
        jfc = new JFileChooser();
//        jfc.getFileFilter().accept();
        jfc.setAcceptAllFileFilterUsed(false);
        filter = new FileNameExtensionFilter("Excel file", "xlsx");
        jfc.addChoosableFileFilter(filter);
        jfc.showOpenDialog(null);
        File f = jfc.getSelectedFile();
        return f.getAbsolutePath();
    }

    public static void imageIcon(JLabel label, String path){
        imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(path));
        img = imageIcon.getImage();
        img = img.getScaledInstance(label.getWidth(), label.getHeight(),Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(img)); 
    }

    public static void paneSaver(JPanel pane, String path) {
        try{
            int w = pane.getWidth(), h = pane.getHeight();
            BufferedImage image = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
            Graphics g = image.createGraphics();
//            pane.setVisible(true);
            pane.paint(g);
            ImageIO.write(image, "png", new File(path));
        }
        catch (IOException e) { System.out.println(e); }
    }
    
    public static void createDirectory(String Directorypath){
        try {
            Files.createDirectory(Paths.get(Directorypath));
        } catch (IOException ex) {
            Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);  
        }
    }

    public static String textNumber(int n){
        n1 = n;
        n2 = n;
        b = n1%10;
        a = n2/10;
 
        String[] single_digits = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine"};
        String[] two_digits = new String[]{"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteen"};
        String[] tens_multiple = new String[]{"","","twenty","thirty","forty","fifty","sixty", "seventy","eighty","ninety"};
        if(a==1)
            return two_digits[b+1];
        else if(b==0)
            return tens_multiple[a];
        else
            return tens_multiple[a]+" "+single_digits[b];
    }
    
//   public static void getBrowsePopup(JFrame frame, String file, int width, int height){
    public static void getBrowsePopup( String file, int width, int height){
       try {
           browse = new JFrame("");
           browse.setBounds(200,200,width,height);
           browse.setLocationRelativeTo(null);
           browse.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
           JFXPanel fxp = new JFXPanel();
           browse.add(fxp);
           browse.setVisible(false);
           
           URL url = new File("src/FXFile/"+file+".fxml").toURI().toURL();
           Parent root = FXMLLoader.load(url);
           
           Scene scene = new Scene(root, 200, 200);

           fxp.setScene(scene);
        } catch (IOException ex) {
           Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
    public static void getSelectPopup(String file, int width, int height){
       try {
           select = new JFrame("");
           select.setBounds(200,200,width,height);
           select.setLocationRelativeTo(null);
           select.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
           JFXPanel fxp = new JFXPanel();
           select.add(fxp);
           select.setVisible(false);
           
           URL url = new File("src/FXFile/"+file+".fxml").toURI().toURL();
           Parent root = FXMLLoader.load(url);
           
           Scene scene = new Scene(root, 200, 200);

           fxp.setScene(scene);
        } catch (IOException ex) {
           Logger.getLogger(Utilities.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
    public static void Notification(String Title, String Messages){
//        image = new Image(new File("images/menu.png").toURI().toString());
        Notifications noti = Notifications.create()
                .title(Title)
                .text(Messages)
//                .graphic(new ImageView(image))
                .hideAfter(javafx.util.Duration.seconds(5))
                .position(Pos.BOTTOM_RIGHT);
        noti.show();
    }
   
    public static String getsaveAsPopup(){
        chooser = new FileChooser();
        chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Excel File", "*.xlsx"));
        f = chooser.showSaveDialog(null);
        System.out.println(f.getAbsolutePath());
        return f.getAbsolutePath();
    }
    
    public static void main(String args[]) {
       JFrame frame = null;
       getBrowsePopup("Browse",880,250);
    }
}


//System.getProperty("user.home") + "/Desktop";