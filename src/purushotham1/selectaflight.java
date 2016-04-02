package purushotham1;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class selectaflight extends constant {
	@Test
	public void flightselection()
	{
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.name("reserveFlights")).click();
	}

}
