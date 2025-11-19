package crossBrowser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SEOtestingPractise {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String homeurl = "https://www.google.com/";
		String testurl="";
		HttpURLConnection htp=null;
		
		//200 TO 399 
		WebDriver d=new ChromeDriver();
		d.get(homeurl);
		Thread.sleep(2000);
		
		List<WebElement> sel=d.findElements(By.tagName("a"));
		
		Iterator<WebElement> iter=sel.iterator();

		FileInputStream f=new FileInputStream(new File("D:\\@ Selenium\\Non-Functional Testing\\SEO Report.xlsx"));
        Workbook w=new XSSFWorkbook(f);
        Sheet sh=w.getSheetAt(0);
        
//	while(iter.hasNext()) {
        for(int i=0; iter.hasNext(); i++)
		{
			testurl=iter.next().getAttribute("href");
			//anchor tag 
			
			if(testurl==null || testurl.isEmpty())
			{
				 Row r= sh.getRow(i);
			        
			        if(r==null)
			        {
			        	r=sh.createRow(0);
			        }
			        
			        int lastcell=r.getLastCellNum();
			        
			        //getLastCellNum is predefined method of Row
			        //it is used to check whether column value is null or empty or not
			        
			        if(lastcell==-1)
			        {
			        	lastcell=0;
			        }
			        
//			        Cell c=r.createCell(lastcell);
//			        Cell c1=r.createCell(lastcell+1);
			        Cell c = r.getCell(0);
			        Cell c1 = r.getCell(1);
			        c.setCellValue(testurl);
			        c1.setCellValue("Anchor tag is not given");
				System.out.println(testurl+" Anchor tag is not given");
				 continue;
			}
			//domain test
			//https://biodataking.com
			//https://signup.biodataking.com - invalid domain
			//https://biodataking.com/signup - valid domain
			
			if(!testurl.startsWith(homeurl))
			{
				System.out.println(testurl+" Domain is incorrect");
				Row r= sh.getRow(i);
		        
		        if(r==null)
		        {
		        	r=sh.createRow(0);
		        }
		        
		        int lastcell=r.getLastCellNum();
		        
		        //getLastCellNum is predefined method of Row
		        //it is used to check whether column value is null or empty or not
		        
		        if(lastcell==-1)
		        {
		        	lastcell=0;
		        }
		        
//		        Cell c=r.createCell(lastcell);
//		        Cell c1=r.createCell(lastcell+1);
		        Cell c = r.getCell(0);
		        Cell c1 = r.getCell(1);
		        c.setCellValue(testurl);
		        c1.setCellValue("Domain is incorrect");
			}
			htp=(HttpURLConnection)(new URL(testurl)).openConnection();
			htp.setRequestMethod("HEAD");
			htp.connect();
			int res = htp.getResponseCode();
			
			
			if(res>=400)
			{
				Row r= sh.getRow(i);
		        
		        if(r==null)
		        {
		        	r=sh.createRow(0);
		        }
		        
		        int lastcell=r.getLastCellNum();
		        
		        //getLastCellNum is predefined method of Row
		        //it is used to check whether column value is null or empty or not
		        
		        if(lastcell==-1)
		        {
		        	lastcell=0;
		        }
		        
//		        Cell c=r.createCell(lastcell);
//		        Cell c1=r.createCell(lastcell+1);
		        Cell c = r.getCell(0);
		        Cell c1 = r.getCell(1);
		        c.setCellValue(testurl);
		        c1.setCellValue("This is a broken link");
				System.out.println(testurl+" This is a broken link");
			}
			else
			{
				Row r= sh.getRow(i);
		        
		        if(r==null)
		        {
		        	r=sh.createRow(0);
		        }
		        
		        int lastcell=r.getLastCellNum();
		        
		        //getLastCellNum is predefined method of Row
		        //it is used to check whether column value is null or empty or not
		        
		        if(lastcell==-1)
		        {
		        	lastcell=0;
		        }
		        
//		        Cell c=r.createCell(lastcell);
//		        Cell c1=r.createCell(lastcell+1);
		        Cell c = r.getCell(0);
		        Cell c1 = r.getCell(1);
		        c.setCellValue(testurl);
		        c1.setCellValue("This is a valid link");
				System.out.println(testurl+" This is a valid link");
			}
			
			  FileOutputStream fo=new FileOutputStream("D:\\@ Selenium\\Non-Functional Testing\\SEO Report.xlsx");
		        w.write(fo);	
		}System.out.println("*****Validation of website is completed*****");
	}	

}//}