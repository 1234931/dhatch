package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignments {

	public static void main(String[] args) 
			 {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
        driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElementById("createLeadForm_companyName").sendKeys("dhatch");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("uday");
		
		WebElement dropDown = driver.findElementById("createLeadForm_dataSourceId");
		Select select =new Select(dropDown);
		select.selectByVisibleText("Direct Mail");
		
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Ranvir");
		
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("krishitha");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("3000000");
		
		
		driver.findElementById("createLeadForm_lastName").sendKeys("N");
		
		driver.findElementById("createLeadForm_birthDate").sendKeys("03/06/1991");
		
		driver.findElementById("createLeadForm_departmentName").sendKeys("Testing");
		
		WebElement currency=driver.findElementById("createLeadForm_currencyUomId");
		Select select2=new Select(dropDown);
		
		driver.findElementById("createLeadForm_industryEnumId").sendKeys("Computer software");
		WebElement campaign=driver.findElementById("createLeadForm_marketingCampaignId");
		Select select1=new Select(dropDown);
		select1.selectByIndex(1);
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("###&&***");
		driver.findElementById("createLeadForm_description").sendKeys("THE CREATE WILL BE CREATED");
		
		WebElement ownership=driver.findElementById("createLeadForm_ownershipEnumId");
		 Select select3=new Select(ownership);
		 select3.selectByVisibleText("Partnership");
		 
		 driver.findElementById("createLeadForm_sicCode").sendKeys("600127");
		 driver.findElementById("createLeadForm_importantNote").sendKeys("The Elements find by Xpath");
		 driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("123456");
		 driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("06");
		 driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9994858338");
		 driver.findElementById("createLeadForm_primaryEmail").sendKeys("yuganthika@gmail.com");
		 driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com/opentaps");
		 driver.findElementById("createLeadForm_generalToName").sendKeys("DHATCHAYINI");
		 driver.findElementById("createLeadForm_generalAddress1").sendKeys("shri ram sankari apartment ,105 ,guduvancheri");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("638154");
		driver.findElementById("createLeadForm_generalCity").sendKeys("KARUR");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("199876543");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("April Batch");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("CHENNAI");

		
		WebElement id = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select select5=new Select(id);
		select5.selectByVisibleText("India");
		driver.findElementByName("submitButton").click();
		
		String text1 = "ACCENTURE";
		driver.findElementById("viewLead_companyName_sp").getText();
		String replaceAll = text1.replaceAll("\\d", "");
		System.out.println(replaceAll);
		 
		driver.findElementByLinkText("Duplicate Lead").click();
		
		WebElement id2 = driver.findElementById("createLeadForm_companyName");
		id2.clear();
		id2.sendKeys("ZOHO");
		
		
		
		driver.findElementByXPath("//input[@name='submitButton']").click();
		String text2 = driver.findElementById("viewLead_companyName_sp").getText();
		String replaceAll2 = text2.replaceAll("\\d", "");
		System.out.println(replaceAll2);
		
		if(replaceAll.equals(replaceAll2)) {
			System.out.println("they are equal company name not update");
		}else {
			System.out.println("they are updated company name");
		}
	
		driver.close();
	}
	

		 
		 
		
		
	
		
		
		
		

	}


