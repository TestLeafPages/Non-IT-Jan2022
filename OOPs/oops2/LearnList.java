package oops2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement tableName = driver.findElement(By.id("table_id"));
		List<WebElement> row = tableName.findElements(By.tagName("tr"));
		int size = row.size();
		System.out.println(size);		
		System.out.println(row);
		
		List<String> listName=new ArrayList<String>();
		
		for(WebElement r:row) {
			String text = r.getText();
			listName.add(text);
		}
				
		System.out.println(listName);		
		Set<String> dup=new LinkedHashSet<String>(listName);		
		System.out.println(dup);
		
		
		/*
		 * WebElement col = row.get(1); List<WebElement> column =
		 * col.findElements(By.tagName("td")); int size2 = column.size();
		 * System.out.println(size2);
		 */
	}

}
