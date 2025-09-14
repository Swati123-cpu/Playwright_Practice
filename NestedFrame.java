package HandleIframe;

import java.util.List;
import java.util.regex.Pattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Frame;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class NestedFrame {
	public static void main(String[] args) {
		Browser	browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://the-internet.herokuapp.com/nested_frames");
		
		List<Frame> totalframes=page.frames();
		System.out.println("Total number of frames---"+totalframes.size());
		
		 String text = page.frame("frame-middle").locator("//div[@id='content']").textContent();
		System.out.println(text);
		
		page.frameByUrl("/frame_bottom");
		//page.frame("frame-bottom");
		System.out.println("Switched to bottom frame");
		
		page.frameByUrl(Pattern.compile(".*right.*"));
		System.out.println("Switched to right frame");
		
		page.close();
		browser.close();
	}

}
