package CaputureScreenshot;

import java.nio.file.Paths;
import java.sql.Date;
import java.text.SimpleDateFormat;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class CaptureScreenshots {

	
	public static void main(String[] args) {
		
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://www.facebook.com/");
		
		System.out.println(page.url()+"   "+page.title());
		
		
		// here we want to capture the screenshots 
		
//		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./Screenshots/screenhots_"+".png")));
		
		//page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./Screenshots/screenhots1_"+".png")).setFullPage(true));
		
//		byte[] buffer = page.screenshot();
//		System.out.println(Base64.getEncoder().encodeToString(buffer));
		
		capturescreen(page);
	//	Utility.capturescreen(page);
		
		
		page.close();
		
		
	}
	
	public static void capturescreen(Page page)
	{
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
		Date date =new Date(0);
		String customdateFormat = simpleDateFormat.format(date);
		page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("./Screenshots/facebook_"+customdateFormat+".png")));
		
	}
}
