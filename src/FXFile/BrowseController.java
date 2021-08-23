package FXFile;
import FramePkg.NewJFrame;
import static FramePkg.NewJFrame.pathTxt;
import Manager.Utilities;
import com.jfoenix.controls.JFXButton;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;
public class BrowseController implements Initializable {
    public static FileChooser chooser = new FileChooser();
    public static File f;
    @FXML
    private JFXButton browse;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void showBrowsseBox(ActionEvent event) {
        Utilities.browse.setVisible(false);
        chooser = new FileChooser();
        chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Excel File", "*.xlsx"));
        f = chooser.showOpenDialog(null);
        pathTxt.setText(f.getAbsolutePath());
    }
    
}
