package CaputureScreenshot;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.utility.Utility;

public class CaptureElementScreenshots {
	
	public static void main(String[] args) {
		
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://www.facebook.com/");
		
		
		Locator form = page.getByTestId("royal_login_form");
		
//		form.screenshot(new Locator.ScreenshotOptions()
//				.setPath(Paths.get("./Screenshots/Facebook_.png")));

		
		Utility.capturescreen(form);
		
		Utility.captureFullPageScreenshots(page);
		
		System.out.println(page.url()+"   "+page.title());
		
		page.close();
	}

}
