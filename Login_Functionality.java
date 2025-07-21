package Flipkart_APK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Functionality {

	public static void main(String[] args) throws Exception {
		//Navigate to the login page
		WebDriver driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
       
		driver.get("https://adactinhotelapp.com/index.php");
		System.out.println("open browser");
		driver.findElement(By.name("username")).sendKeys("Bkbimal1");
		driver.findElement(By.id("password")).sendKeys("766ETI");
		
		driver.findElement(By.id("login")).click();
        System.out.println("login is completed");
        Thread.sleep(3000);
       
        
        
        // Search for a hotel
        WebElement location = driver.findElement(By.id("location"));
        WebElement hotels = driver.findElement(By.id("hotels"));
        WebElement roomType = driver.findElement(By.id("room_type"));
        WebElement numberOfRooms = driver.findElement(By.id("room_nos"));
        WebElement checkInDate = driver.findElement(By.id("datepick_in"));
        WebElement checkOutDate = driver.findElement(By.id("datepick_out"));
        WebElement adultsPerRoom = driver.findElement(By.id("adult_room"));
        WebElement searchButton = driver.findElement(By.id("Submit"));

        location.sendKeys("Sydney");
        hotels.sendKeys("Hotel Creek");
        roomType.sendKeys("Standard");
        Thread.sleep(3000);
        numberOfRooms.sendKeys("1");
        checkInDate.clear();
        checkInDate.sendKeys("10/01/2025");
        checkOutDate.clear();
        Thread.sleep(3000);
        checkOutDate.sendKeys("15/01/2025");
        adultsPerRoom.sendKeys("2");
        searchButton.click();
        
      //Select hotel
        WebElement radioButton = driver.findElement(By.id("radiobutton_0")); // Selecting the first hotel
        WebElement continueButton = driver.findElement(By.id("continue"));

        radioButton.click(); // Select the hotel
        continueButton.click(); // Proceed to the next page
        
      

        System.out.println("Hotel selection successful!");
        
        driver.quit();
        System.out.println("driver closed");
	}
	

}
