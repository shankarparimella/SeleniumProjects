package mysqlpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class QuickxpertinfotechSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String dburl = "jdbc:mysql://localhost/customer";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		System.out.println("Connection Established");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from Quickxpertinfotech");
		
		String url = "https://quickxpertinfotech.com/signup.php";
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		d.get(url);
		Thread.sleep(2000);
		Actions a = new Actions(d);
		System.out.println("Registered with below list of Users");
		
		while(rs.next()) {
			d.findElement(By.xpath("//input[@name='u_fname']")).sendKeys(rs.getString(1));
			d.findElement(By.xpath("//input[@name='u_email']")).sendKeys(rs.getString(2));
			d.findElement(By.xpath("//input[@name='u_passwd']")).sendKeys(rs.getString(3));
			d.findElement(By.xpath("//input[contains(@name,'conf')]")).sendKeys(rs.getString(3));
			d.findElement(By.xpath("//input[@name='u_phone_no']")).sendKeys(rs.getString(4));
			WebElement city1 = d.findElement(By.xpath("//input[@id='u_city_auto']"));
			Action ac = a.sendKeys(city1, rs.getString(5)).pause(Duration.ofSeconds(5)).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
			ac.perform();
			Thread.sleep(5000);
//			d.findElement(By.xpath("//button[contains(.,'Sign Up')]")).click();
			Thread.sleep(1000);
			d.navigate().refresh();
			System.out.println(rs.getString(1));
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		}
}