package testcases;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class excelFiles {

    static FileInputStream ex=null;
    static  String filepath = System.getProperty("user.dir")+"/src/test/java/testCases/";
    public FileInputStream getFileInputStream(String filepath)
    {

        File srcFile = new File(filepath);


        try{ex = new FileInputStream(srcFile);}
        catch (FileNotFoundException e){
            System.out.println("Test Data File Not Found Treminating process : Check file path of TestData");
            System.exit(0);
        }
        return ex;

    }

    public Object[][] getExcelData(String filename) throws IOException {
        ex = getFileInputStream(filepath + filename);
        XSSFWorkbook wb = new XSSFWorkbook(ex);
        XSSFSheet sheet = wb.getSheetAt(0);

        int totalNuOfRows = (sheet.getLastRowNum() + 1);
        int totalNuOfCols =2; // Update to 5 columns to match your test method parameters

        String[][] arrayExcelOfData = new String[totalNuOfRows][totalNuOfCols];

        for (int i = 0; i < totalNuOfRows; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < totalNuOfCols; j++) {
                if (row != null && row.getCell(j) != null) {
                    arrayExcelOfData[i][j] = row.getCell(j).toString();
                } else {
                    arrayExcelOfData[i][j] = ""; // Assign a default empty value if null
                }
            }
        }
        wb.close();
        ex.close();
        return arrayExcelOfData;
    }
}
