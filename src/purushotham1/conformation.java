package purushotham1;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class conformation extends constant {
	@Test
	public void conformationtest()
	{
		String expect="Your itinerary has been booked!";
		String act=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
	if (expect.equals(act)) {
		System.out.println("successfully book");
		
	}

}}
