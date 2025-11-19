package mysqlpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mysqlclass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dburl = "jdbc:mysql://localhost/loginformtest";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		System.out.println("Connection established");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from logincredentials");
		
		while(rs.next()) {
			WebDriver d = new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
			d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
			
			d.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(rs.getString(1));
			d.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(rs.getString(2));
			Thread.sleep(2000);
			d.findElement(By.xpath("//button[@type='submit'][contains(.,'Login')]")).click();
//			d.close();
			Thread.sleep(1000);
		}
	}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
}}