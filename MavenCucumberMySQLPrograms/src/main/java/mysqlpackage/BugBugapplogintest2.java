package mysqlpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BugBugapplogintest2 {
	public static void main(String[] args) throws Exception {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dburl = "jdbc:mysql://localhost/customer";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		System.out.println("Connection Established");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from logintest");
		
		String url = "https://www.saucedemo.com/";
		String newurl = "https://www.saucedemo.com/";
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		d.get(url);
		Thread.sleep(2000);
		
		while(rs.next()) {
			d.findElement(By.xpath("//input[@id='user-name']")).sendKeys(rs.getString(1));
			d.findElement(By.xpath("//input[@id='password']")).sendKeys(rs.getString(2));
			Thread.sleep(1000);
			d.findElement(By.xpath("//input[@id='login-button']")).click();
			Thread.sleep(1000);
			newurl = d.getCurrentUrl();
			if(url.equals(newurl)) {
				System.out.println(rs.getString(1)+" Login Failed");
			}
			else {
				System.out.println(rs.getString(1)+" Login Successful");
				Thread.sleep(1000);
				d.get(url);
			}
			d.navigate().refresh();
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}