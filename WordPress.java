package bd.com.Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WordPress extends Base{

	public String url = "http://localhost/example/wp-login.php?loggedout=true&wp_lang=en_US";
	
@Test	
	
public void WebsiteTest() throws InterruptedException {
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='user_login']"));
		email.sendKeys("ummemaria");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='user_pass']"));
		password.sendKeys("MariaRime@2024");
		
		WebElement login = driver.findElement(By.xpath("//input[@id='wp-submit']"));
		login.click();
		
		Thread.sleep(2000);
		Actions action = new Actions(driver);
	    action.clickAndHold(driver.findElement(By.xpath("//a[contains(text(),'Example wordpress')]"))).build().perform();
	    WebElement visitsite = driver.findElement(By.xpath("//a[contains(text(),'Visit Site')]"));
		action.moveToElement(visitsite).perform();
		
		WebElement visitsite1 = driver.findElement(By.xpath("//a[contains(text(),'Visit Site')]"));
		visitsite1.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		Actions action1 = new Actions(driver);
	    action1.clickAndHold(driver.findElement(By.xpath("//div[contains(text(),'WP Dark Mode')]"))).build().perform();
	    WebElement settings = driver.findElement(By.xpath("//a[contains(text(),'Settings')]"));
		action1.moveToElement(settings).perform();
		
		WebElement settings1 = driver.findElement(By.xpath("//a[contains(text(),'Settings')]"));
		settings1.click();
		Thread.sleep(2000);
		WebElement adminpaneldarkmode = driver.findElement(By.xpath("//a[contains(text(),'Admin Panel Dark Mode')]"));
		adminpaneldarkmode.click();
		Thread.sleep(2000);
		WebElement enableadminpaneldarkmode = driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='wp-dark-mode-admin']/div[1]/div[1]/div[1]/div[2]/div[3]/section[1]/div[1]/div[1]/label[1]/div[1]/div[1]"));
		enableadminpaneldarkmode.click();
		Thread.sleep(2000);
		WebElement savechanges = driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='wp-dark-mode-admin']/div[1]/div[1]/div[1]/div[2]/div[4]/button[2]"));
		savechanges.click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(6000);
		WebElement customization = driver.findElement(By.xpath("//div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/*[1]"));
		customization.click();
		Actions action2 = new Actions(driver);
        action2.clickAndHold(driver.findElement(By.xpath("//div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/*[1]"))).build().perform();
	   WebElement switchsettings = driver.findElement(By.xpath("//a[contains(text(),'Switch Settings')]"));
	   action2.moveToElement(switchsettings).perform();
		
		WebElement switchsettings1 = driver.findElement(By.xpath("//a[contains(text(),'Switch Settings')]"));
		switchsettings1.click();
		
		WebElement normalswitches = driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='wp-dark-mode-admin']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/section[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]"));
		normalswitches.click();
		
		WebElement savechanges1 = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/button[2]"));
		savechanges1.click();
		
		
		WebElement custom = driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/section[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[6]/span[1]"));
		Actions action3 = new Actions(driver);
		action3.moveToElement(custom).perform();
		
		WebElement size = driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/section[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/input[1]"));
		size.sendKeys("220");
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("x");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
     	WebElement savechanges2 = driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='wp-dark-mode-admin']/div[1]/div[1]/div[1]/div[2]/div[4]/button[2]"));
		savechanges2.click();
	
    	WebElement left = driver.findElement(By.xpath("//span[contains(text(),'Left')]"));
    	left.click();
	
    	WebElement savechanges3 = driver.findElement(By.xpath("//body/div[@id='wpwrap']/div[@id='wpcontent']/div[@id='wpbody']/div[@id='wpbody-content']/div[@id='wp-dark-mode-admin']/div[1]/div[1]/div[1]/div[2]/div[4]/button[2]"));
    	savechanges3.click();
	
    	WebElement advanced= driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]"));
		advanced.click();
    	
        Actions action4 = new Actions(driver);
        action4.clickAndHold(driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]"))).build().perform();
        WebElement accessibility = driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/a[4]"));
        action4.moveToElement(accessibility ).perform();
		
        WebElement accessibility1 = driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/a[4]"));
		accessibility1.click();
		
		WebElement keyboardshortcut = driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[6]/div[1]/label[1]/div[2]/div[1]"));
		keyboardshortcut.click();
		
		WebElement savechanges4 = driver.findElement(By.xpath("//div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[4]/button[2]"));
    	savechanges4.click();
		
		
		Thread.sleep(6000);
}

}
