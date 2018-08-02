package com.accenture.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmail {
	
	public  void IrSantiago() throws Exception
	{
		WebDriver driver = new ChromeDriver(); //Creamos una variable de tipo WebDriver que permita capturar la url
		String url = "https://mail.google.com";   // llama la url de gmail
		driver.get(url);  //url por get
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //Tiempo en segundos
	
		WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']")); // id identificador identifica el correo
		email_phone.sendKeys("----@gmail.com"); // input donde se va ingresar el correo o lo que se vaya buscar
		driver.findElement(By.id("identifierNext")).click(); // clic del boton
	
		WebElement password = driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")); // id identificar identificar la contraseña
		WebDriverWait wait = new WebDriverWait(driver, 500); 
		wait.until(ExpectedConditions.elementToBeClickable(password)); // pasword  
		password.sendKeys("Pasword"); // contraseña
		driver.findElement(By.id("passwordNext")).click();
		
		
	
		WebElement redactar;
		WebElement dirigidoA;
		WebElement para;
		WebElement asunto;
		WebElement enviar;
	
		Thread.sleep(2000);
		redactar = driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")); // aca selecciono el boton redactar por xpath
		redactar.click();
	
		dirigidoA = driver.findElement(By.name("to"));
		dirigidoA.sendKeys("daneilatoro@gmail.com");
		dirigidoA.click();
	
		para = driver.findElement(By.name("subjectbox"));
		para.sendKeys("Dani esto es una prueba de mi automatización");
		para.click();
	
		asunto = driver.findElement(By.xpath("/html[1]/body[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/div[1]")); 
		asunto.sendKeys("Esto es una prueba");
		asunto.click();
	
		enviar = driver.findElement(By.xpath("/html[1]/body[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]")); // id identificador identifica el correo;
		enviar.click();
	}
}

