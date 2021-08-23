package Manager;
import Documentry.GenerateDocumentry;
import static Documentry.GenerateDocumentry.GetStringArray;
import static Documentry.GenerateDocumentry.generate;
import FXFile.GenerateFXMLController;
import FramePkg.NewJFrame;
import static Manager.NumberToText.textNumber;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

public class readSheet {
    public static XSSFWorkbook workbook;
    public static String cellValueMaybeNull;
    public static String Imagename;
    public static Utilities ut;
    public static DataFormatter formatter = new DataFormatter();
    static int beforeDecimal,afterDecimal;
    static ArrayList imageName = new ArrayList();
    public static XSSFSheet readSheet(int sheetNumber,String path)
    {
        try
        {
            FileInputStream file = new FileInputStream(new File(path));
            //Create Workbook instance holding reference to .xlsx file
            workbook = new XSSFWorkbook(file);
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(sheetNumber);
        } 
        catch (Exception e)  { e.printStackTrace(); }
        return workbook.getSheetAt(0);
    }
    
    public static void getSheet(XSSFSheet sheet, int start, int end){
        try {
            for (int rowIndex = start; rowIndex <= end; rowIndex++) {
                Row row = sheet.getRow(rowIndex);
                Imagename = formatter.formatCellValue(row.getCell(1));
                NewJFrame.rollno.setText(    formatter.formatCellValue(row.getCell(1)));
                NewJFrame.nameLeb.setText(   formatter.formatCellValue(row.getCell(2)));
                NewJFrame.english.setText(   formatter.formatCellValue(row.getCell(3)));
                NewJFrame.marathi.setText(   formatter.formatCellValue(row.getCell(4)));
                NewJFrame.hindi.setText(     formatter.formatCellValue(row.getCell(5)));
                NewJFrame.geography.setText( formatter.formatCellValue(row.getCell(6)));
                NewJFrame.psychology.setText(formatter.formatCellValue(row.getCell(7)));
                NewJFrame.defence.setText(   formatter.formatCellValue(row.getCell(8)));
                NewJFrame.total.setText(     formatter.formatCellValue(row.getCell(9)));
                NewJFrame.percent_N.setText( formatter.formatCellValue(row.getCell(10)));
                NewJFrame.env.setText(       formatter.formatCellValue(row.getCell(11)));
                NewJFrame.phy.setText(       formatter.formatCellValue(row.getCell(12)));
                
                if(NewJFrame.percent_N.getText().length() < 5)
                    NewJFrame.percent_N.setText(NewJFrame.percent_N.getText()+".00%");
                else
                    NewJFrame.percent_N.setText(NewJFrame.percent_N.getText()+"%");

                NewJFrame.remark.setText((Float.parseFloat(NewJFrame.percent_N.getText().replace("%", "")) > 75)? "Excellent" : "Good");
                NewJFrame.percent_W.setText(NumberToText.getPercentagesInWords(Integer.parseInt(NewJFrame.percent_N.getText().substring(0, 2)),
                                            textNumber(Integer.parseInt(NewJFrame.percent_N.getText().substring(3, 5)))));
//                NewJFrame.percent_W.setText("Eighty Four Only");
//                ut.paneSaver(NewJFrame.jPanel1, CreatFolder.path+"\\"+Imagename+".jpg");
                
                if(GenerateFXMLController.rButton.equals("images"))
                    ut.paneSaver(NewJFrame.jPanel1, GenerateFXMLController.folderPath+"\\"+Imagename+".jpg");
                else{
                    ut.paneSaver(NewJFrame.jPanel1, "Certificate//Generate//"+Imagename+".jpg");
                    imageName.add("Certificate//Generate//"+Imagename+".jpg");
                }
            }
            System.out.println(imageName);
            if(GenerateFXMLController.rButton.equals("document"))
               generate(GetStringArray(imageName)); 
        } catch (IllegalStateException exception) {}
        
        JOptionPane.showMessageDialog(null, "Completed !");
    }

    public static void main(String[] args) {
        String[] IMageargs1 = {"shubham","shashikant","patil"};
        System.out.println(IMageargs1);
        
        ArrayList list = new ArrayList(); 
        list.add("Shubham");
        list.add("shashikant");
        list.add("patil");
        
        String[] IMageargs = (String[]) list.toArray();
        System.err.println(IMageargs);
    }
}
