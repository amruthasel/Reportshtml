package purushotham1;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class bookaflight extends constant {
	@Test
	public void booking()
	{
		
		driver.findElement(By.name("rbuyFlights")).click();
	}

}
