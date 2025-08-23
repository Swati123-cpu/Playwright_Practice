package Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		Browser browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("http://www.facebook.com");
		
		System.out.println(page.title());
		System.out.println(page.url());
		
		//xpath
//		page.locator("//input[@name='email']").fill("swatichavan20@gmail.com");
//		page.locator("//input[@name='pass']").fill("swati@123");
//		page.locator("//button[@name='login']").click();
		
//		page.fill("//input[@name='email']","swati@gmail.com");
//		page.fill("//input[@name='pass']","swati123");
//		page.click("//button[@name='login']");
		
		/*
		 * page.locator("//input[@name='email']").type("swati@gmail.com");
		 * page.locator("//input[@name='pass']").type("swati123");
		 */
		
//		page.type("//input[@name='email']", "swati@gmail.com");
//		page.type("//input[@name='pass']", "swati123");	
		
		Thread.sleep(3000);
		
//		System.out.println(page.title());
//		System.out.println(page.url());

//		page.fill("xpath=//input[@name='email']","swati@1234");
//		page.fill("xpath=//input[@name='pass']", "swati1234");
//		page.click("xpath=//button[@name='login']");
		
		//css
		
		
//		page.fill("css=input[name='email']","swati@facebook.com");
//		page.fill("css=input[name='pass']","swati@1234%");
//		page.click("css=button[name='login']");
		
//		Locator txtEmail=page.locator("#email");
//		System.out.println(txtEmail.count());
//		txtEmail.fill("swatichavan@gmail.com");
		
		/*
		 * Locator links = page.locator("//a[contains(text(),'Privacy')]");
		 * System.out.println(links.count());
		 */
		//links.click();
		
		//links.first().click();
	//	links.last().click();
		
//		page.close();
//		browser.close();
		
		
		
			

		
	}

}
