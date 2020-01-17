import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Currency 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				   "C://Users//admin//Desktop//Extractions//chromedriver.exe");
		   WebDriver ObjDriver = new ChromeDriver();
		   ObjDriver.get("http://demo.opencart.com");
	       System.out.println("open cart page loaded");
	       String var1 = ObjDriver.getTitle();
	       System.out.println("Title of the page :" +var1);
	       WebElement Obj1= ObjDriver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/a"));
	       Obj1.click();
	       WebElement Obj2 = ObjDriver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a"));
	       Obj2.click();
	       WebElement Obj3 = ObjDriver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[4]/div/div[2]/div[2]/button[1]"));
	       Obj3.click();
	       WebElement Obj4 = ObjDriver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/i"));
	       Obj4.click();
	       WebElement Obj5 = ObjDriver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/button"));
	       Obj5.click();
	       WebElement Obj6 = ObjDriver.findElement(By.xpath("//*[@id=\"form-currency\"]/div/ul/li[1]/button"));
	       Obj6.click();
	       WebElement Obj7 = ObjDriver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[5]"));
	       Obj7.click();
	       System.out.println(Obj7.getText());
	}
}
