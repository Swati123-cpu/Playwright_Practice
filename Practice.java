package HandleIframe;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Frame;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Practice {
	public static void main(String[] args) {
		Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://the-internet.herokuapp.com/iframe");
		
		List<Frame> totalnumberofframes=page.frames();
		System.out.println("Total frames:----"+totalnumberofframes.size());
		
		String text = page.frameLocator("//iframe[@title='Rich Text Area']").locator("//body[@id='tinymce']/p").textContent();
		System.out.println(text);
		
		page.getByText("Elemental Selenium").click();
		System.out.println(page.title());
		System.out.println(page.url());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<Frame> totalnumberofframes=page.frames();
//		System.out.println("Total frames:------"+totalnumberofframes.size());
//		
//		String text = page.frameLocator("//iframe[@title='Rich Text Area']").locator("//body[@id='tinymce']/p").textContent();
//		System.out.println(text);
//		
//		page.getByText("Elemental Selenium").click();
//		System.out.println(page.title());
//		System.out.println(page.url());
	}

}
