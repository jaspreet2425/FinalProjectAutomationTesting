package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class class_two {
	@BeforeClass
    void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "C://Users//localadmin//Downloads//chromedriver_win32//chromedriver.exe");
        // beforeclass action to link the driver
    }
	@Test
    public void imagess() throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://s1.demo.opensourcecms.com/wordpress/");
        java.util.List<WebElement> listImages = driver.findElements(By.tagName("img"));
        //creating the list for getting the number of elements
        int figures = 0; //variable to count the images
        for (WebElement image : listImages) { //loop
            if ( image.isDisplayed()) { //condition for images
                figures++;    //increment
            }
        }
        System.out.println("Total Numbers of images: " + figures);
        driver.close();
    }
    @Test
    //this test is same as above just a tag is changed i.e. for buttons
    public void buttons() throws InterruptedException {
        ChromeDriver driver =new ChromeDriver();
        driver.get("https://s1.demo.opensourcecms.com/wordpress/");
        java.util.List<WebElement> listButtons = driver.findElements(By.tagName("button"));

        int counts = 0;
        for (WebElement button : listButtons) {
            if(button.getText().equals("buttonName")) {
                counts++;
            }
        }
        System.out.println("Total Number of buttons: " + counts);
        driver.close();
    }

}
