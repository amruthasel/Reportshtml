package purushotham1;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class findflight extends constant {
	@Test
	public void flight()
	{
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.name("passCount")).sendKeys("4");
		driver.findElement(By.name("fromPort")).sendKeys("london");
		driver.findElement(By.name("fromMonth")).sendKeys("may");
		driver.findElement(By.name("fromDay")).sendKeys("7");
		driver.findElement(By.name("findFlights")).click();
		
		
		
		
		
	}

}
