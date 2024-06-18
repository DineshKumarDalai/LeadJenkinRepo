package PageObjects;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import stepDefinations.BaseClass;
import utilities.Helper;

public class Productpage extends BaseClass {

	
	public Productpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	private By catalog_link = By.xpath("//a[@href='#']//p[contains(text(),'Catalog')]");
	private By product_link = By.xpath("//p[text()=' Products']");
	private By AllTableRows  = By.xpath("//table[@id='products-grid']/tbody/tr");
	private By pagination_link = By.xpath("//ul[@class='pagination']//a");
	private By paginationNext_link = By.id("products-grid_next");
	private By paginationPrevious_link = By.id("products-grid_previous");
	
	
	public void clcikCatalog() {
		Helper.getDriver().findElement(catalog_link).isDisplayed();
		Helper.getDriver().findElement(catalog_link).click();
	}
	
	public void ClickProductLink() {
		Helper.getDriver().findElement(product_link).isDisplayed();
		Helper.getDriver().findElement(product_link).click();
	}
	
	public void CountNoRows() {
	int totalRows =	Helper.getDriver().findElements(AllTableRows).size();
	System.out.println("Total number of row is = "+totalRows);
	
	}
	
	public void pagination() throws InterruptedException {
		
		
		int paginationsize = Helper.getDriver().findElements(pagination_link).size();
	
		for(int i=1;i<=paginationsize;i++) {
			String s = String.valueOf(i);
			System.out.println("Value of s is "+s);
			WebElement linktext = Helper.getDriver().findElement(By.xpath("//a[@data-dt-idx='"+i+"']"));
			String linktextvalue = linktext.getText();
			
			System.out.println("value of data-dt-idx is "+linktext.getText());
			
			if(s.equalsIgnoreCase(linktextvalue)) {
        WebElement link = Helper.getDriver().findElement(By.xpath("//ul[@class='pagination']//a[@data-dt-idx='"+i+"']"));
        link.click();
        System.out.println(i+" link clicked sucessfully");
        Thread.sleep(8000);
        int totalRows =	Helper.getDriver().findElements(AllTableRows).size();
    	System.out.println(i+" link Total number of row is = "+totalRows);
		}
			else {
				break;
			}
	}
	}
	public void ClickArraowPagination() throws InterruptedException {
		int totalRows =	Helper.getDriver().findElements(AllTableRows).size();
		System.out.println("1 Total number of row is = "+totalRows);
		int paginationsize = Helper.getDriver().findElements(pagination_link).size();
		System.out.println("Total link "+paginationsize);
		Helper.getDriver().findElement(paginationNext_link).isDisplayed();
		for(int i=2;i<=paginationsize;i++) {
			String s = Helper.getDriver().findElement(paginationNext_link).getAttribute("class");
			if(!s.contains("disabled")) {
			Helper.getDriver().findElement(paginationNext_link).click();
			Thread.sleep(8000);
			int totalRows1 =	Helper.getDriver().findElements(AllTableRows).size();
			System.out.println(i+" Total number of row is = "+totalRows1);
		}
		}
	}
	
	public void ClickBackArrowpagination() throws InterruptedException {
		int paginationsize = Helper.getDriver().findElements(pagination_link).size();
		Helper.getDriver().findElement(paginationPrevious_link).isDisplayed();
		for(int i=2;i<=paginationsize;i++) {
			String s = Helper.getDriver().findElement(paginationPrevious_link).getAttribute("class");
			if(!s.contains("disabled")) {
			Helper.getDriver().findElement(paginationPrevious_link).click();
			Thread.sleep(8000);
			int totalRows1 =	Helper.getDriver().findElements(AllTableRows).size();
			System.out.println(i+" Total number of row is = "+totalRows1);
		}
	}
}
}
