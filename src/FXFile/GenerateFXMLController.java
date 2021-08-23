package FXFile;
import FramePkg.NewJFrame;
import Manager.Utilities;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author BOSS
 */
public class GenerateFXMLController implements Initializable {
    File selectedDirectory;
    public static String folderPath,rButton;
    DirectoryChooser directoryChooser = new DirectoryChooser();
    public static FileChooser chooser = new FileChooser();
    public static File f;
    @FXML
    private JFXRadioButton images;
    @FXML
    private ToggleGroup save_as;
    @FXML
    private JFXRadioButton document;
    @FXML
    private JFXTextField pathTxt;
    @FXML
    private JFXButton selectBtn;
    @FXML
    private Button continueBtn;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        images.setSelected(true);
        rButton = "images";
    }

    @FXML
    private void getselectPopup(ActionEvent event) {
//        Utilities.select.setVisible(false);
        if(images.isSelected()){
            selectedDirectory = directoryChooser.showDialog(null);
            pathTxt.setText(selectedDirectory.getAbsolutePath());
            folderPath = selectedDirectory.getAbsolutePath();
        }
        if(document.isSelected()){
            chooser = new FileChooser();
            chooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Document", "*.docx"));
            f = chooser.showSaveDialog(null);
            pathTxt.setText(f.getAbsolutePath());
            folderPath = pathTxt.getText();
        }
    }

    @FXML
    private void startGenerating(ActionEvent event) {
        if(pathTxt.getText().equals(""))
            Utilities.Notification("Notification !!", "\n Please select path");
        else{
//            NewJFrame.startBtn.setEnabled(false);
            NewJFrame.startConditions();
            if(images.isSelected())
                rButton = "images";
            if(document.isSelected())
                rButton = "document";
        }
    }

    @FXML
    private void saveasImage(ActionEvent event) {
        rButton = "images";
        pathTxt.setText("");
    }

    @FXML
    private void saveasDoc(ActionEvent event) {
        rButton = "document";
        pathTxt.setText("");
    }
    
}
