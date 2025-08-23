package Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class First_PW_Test {
	public static void main(String[] args) {
		Playwright playwrite = Playwright.create();
		Browser browser = playwrite.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page = browser.newPage();
		page.navigate("https://www.google.com");
		
		String title = page.title();
		System.out.println("Facebook title:" +title);
		
		String url = page.url();
		System.out.println("Facebook url:" +url);
		
	}

}
