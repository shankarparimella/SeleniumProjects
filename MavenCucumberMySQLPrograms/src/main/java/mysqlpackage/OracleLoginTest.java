package mysqlpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OracleLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String dburl = "jdbc:mysql://localhost/customer";
			String username = "root";
			String password = "root";
			
			Connection con = DriverManager.getConnection(dburl,username, password);
			System.out.println("Connection Established");
			
			String url = "https://quickxpertinfotech.com/login";
			WebDriver d = new ChromeDriver();
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
			d.get(url);
			Thread.sleep(2000);
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from OracleUsers");
			System.out.println("Verified below list of Credentials");
			
			while(rs.next()) {
				d.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys(rs.getString(1));
				d.findElement(By.xpath("//input[@type='password']")).sendKeys(rs.getString(2));
				Thread.sleep(2000);
				d.findElement(By.xpath("//button[@name='submit']")).click();
				Thread.sleep(2000);
				System.out.println(rs.getString(1));
				d.navigate().refresh();
			}			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}