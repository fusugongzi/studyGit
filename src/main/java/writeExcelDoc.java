import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 * Created by 15600 on 2017/6/5.
 */
public class writeExcelDoc {
    public static void main(String[] args) {
        HSSFWorkbook hssfWorkbook=new HSSFWorkbook();//创建excel文件对象
        Sheet sheet=hssfWorkbook.createSheet();//创建sheet
        sheet.setColumnWidth(1, 100 * 256);
        Row row1;//行
        row1=sheet.createRow(0);//第一行，标题
        row1.createCell(0).setCellValue("name");
        row1.createCell(1).setCellValue("score");
        ArrayList<student> list=new ArrayList<>();
        list.add(new student("wzz",100));
        list.add(new student("jzb",99));

        for(int i=0;i<list.size();i++){//循环创建数据行
            row1=sheet.createRow(i+1);
            row1.createCell(0).setCellValue(list.get(i).getName());
            row1.createCell(1).setCellValue(list.get(i).getScore());
        }

        try {
            FileOutputStream fileOutputStream=new FileOutputStream("D://test.xls");
            hssfWorkbook.write(fileOutputStream);
            fileOutputStream.close();
            System.out.println("完成完成");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
