package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		// implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// 2	Enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");

		// 3	Enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		// 4	Click Login
		driver.findElement(By.xpath("(//form[@id='login']//input)[3]")).click();

		// 5	Click crm/sfa link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		// 6	Click Leads link
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		// 7	Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
         
	
		
		// 8	Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();		

		// 9	Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1234567890");

		// 10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	
		// 11	Capture lead ID of First Resulting lead
		String fLeadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
		System.out.println(fLeadID);

		// 12	Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

		// 13	Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();

		// 14	Click Find leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();


		// 15	Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(fLeadID);

		// 16	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// 17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String confMsg = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(confMsg);

		// 18	Close the browser (Do not log out)
		//driver.close();

		

	}

}
