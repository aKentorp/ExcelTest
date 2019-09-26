import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;

public class Excel {

    public static void main(String[] args){
        Workbook wb = new HSSFWorkbook();

        try{
            FileOutputStream output = new FileOutputStream("Test1.xls");
            wb.write(output);
            output.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
