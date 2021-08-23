package Documentry;
import FXFile.GenerateFXMLController;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
//import org.apache.poi.xwpf.usermodel.Document;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
//import com.spire.doc.*;
//import com.spire.doc.documents.*;


public class GenerateDocumentry {
    public static String[] IMageargs;
    
    public static void generate(String[] file){
        try {
            XWPFDocument doc = new XWPFDocument();
            XWPFParagraph p = doc.createParagraph();
            XWPFRun xwpfRun = p.createRun();
//            String path = "C:\\Users\\Lenovo\\Desktop\\pragti\\";
//            String[] IMageargs={ path+"1.jpg",path+"2.jpg",path+"3.jpg",path+"4.jpg" };
            for (String imgFile : file) {
                int format=XWPFDocument.PICTURE_TYPE_JPEG;
            //            xwpfRun.setText(imgFile);
                xwpfRun.addBreak();
                xwpfRun.addPicture (new FileInputStream(imgFile), format, imgFile, Units.toEMU(550), Units.toEMU(500)); // 200x200 pixels
                //xwpfRun.addBreak(BreakType.PAGE);
            }
            FileOutputStream out = new FileOutputStream(GenerateFXMLController.folderPath);
            doc.write(out);
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(GenerateDocumentry.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidFormatException ex) {
            Logger.getLogger(GenerateDocumentry.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static String[] GetStringArray(ArrayList<String> arr)
    {
        IMageargs = new String[arr.size()];

        for (int j = 0; j < arr.size(); j++) 
            IMageargs[j] = arr.get(j);

        return IMageargs;
    }
    
    public static void main(String[] args) throws Exception {
        String path = "C:\\Users\\Lenovo\\Desktop\\pragti\\";
        ArrayList list = new ArrayList();
        list.add(path+"1.jpg");
        list.add(path+"2.jpg");
        list.add(path+"3.jpg");
        generate(GetStringArray(list));
/*
***************************************************************************************************************************************************************************************************************************************************************
***************************************************************************************************************************************************************************************************************************************************************        
        String inputFile="Sample.docx";
        String outputFile="out/result.docx";
        Document document;
        document = new Document(inputFile);
        Section section = document.getSections().get(0);
        section.getPageSetup().getMargins().setLeft(60f);
        document.saveToFile(outputFile, FileFormat.Docx);
*/
    }
}