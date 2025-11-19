package gametesting;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClickandHoldElement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		d.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		Thread.sleep(2000);
		
		WebElement tileA = d.findElement(By.xpath("//li[@name='A']"));
		WebElement tileB = d.findElement(By.xpath("//li[@name='B']"));
		WebElement tileC = d.findElement(By.xpath("//li[@name='C']"));
		WebElement tileD = d.findElement(By.xpath("//li[@name='D']"));
		WebElement tileE = d.findElement(By.xpath("//li[@name='E']"));
		WebElement tileF = d.findElement(By.xpath("//li[@name='F']"));
		WebElement tileG = d.findElement(By.xpath("//li[@name='G']"));
		WebElement tileH = d.findElement(By.xpath("//li[@name='H']"));
		WebElement tileI = d.findElement(By.xpath("//li[@name='I']"));
		WebElement tileJ = d.findElement(By.xpath("//li[@name='J']"));
		WebElement tileK = d.findElement(By.xpath("//li[@name='K']"));
		WebElement tileL = d.findElement(By.xpath("//li[@name='L']"));
		
		Actions a = new Actions(d);
		
		Action ac1 = a.clickAndHold(tileB).moveToElement(tileA).release(tileB).build();
		ac1.perform();
		
		Action ac2 = a.clickAndHold(tileD).moveToElement(tileC).release(tileD).build();
		ac2.perform();
		
		Action ac3 = a.clickAndHold(tileF).moveToElement(tileE).release(tileF).build();
		ac3.perform();
		
		Action ac4 = a.clickAndHold(tileH).moveToElement(tileG).release(tileH).build();
		ac4.perform();
		
		Action ac5 = a.clickAndHold(tileJ).moveToElement(tileI).release(tileJ).build();
		ac5.perform();
		
		Action ac6 = a.clickAndHold(tileL).moveToElement(tileK).release(tileL).build();
		ac6.perform();
		
		System.out.println("All tiles are moved to next places");
	}
}