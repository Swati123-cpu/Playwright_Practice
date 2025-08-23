package Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;



//page.getByRole() to locate by explicit and implicit accessibility attributes.
//page.getByText() to locate by text content.
//page.getByLabel() to locate a form control by associated label's text.
//page.getByPlaceholder() to locate an input by placeholder.
//page.getByAltText() to locate an element, usually image, by its text alternative.
//page.getByTitle() to locate an element by its title attribute.
//page.getByTestId() to locate an element based on its data-testid attribute.



public class BuiltInLocators {
	public static void main(String[] args) {
		Browser browser=Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		page.navigate("https://www.facebook.com");
		
		//getByPlaceholder() used
		
//		page.getByPlaceholder("Email address or phone number").fill("swatiChavan");
//		page.getByPlaceholder("Password").fill("swati@123");
		
//		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		page.getByPlaceholder("Username").fill("Admin");
//		page.getByPlaceholder("Password").fill("admin123");
		
		
		//getByText() used
		
//	    Locator Forpwd=page.getByText("Forgotten password?");
//	    System.out.println(Forpwd.isVisible());
//	    Forpwd.click();
		
//		Locator createna=page.getByText("Create new account");
//		System.out.println(createna.innerHTML());
//	    createna.click();
		
		
//	    Locator	createpagelink=page.getByText("Create a Page");
//        System.out.println(createpagelink.textContent());
//		System.out.println(createpagelink.isVisible());
//		System.out.println(createpagelink.isEnabled());
//		
//		
//		System.out.println(page.locator("#reg_pages_msg").innerText());
//		System.out.println(page.locator("#reg_pages_msg").innerHTML());
//		
//		createpagelink.click();
		
		
		//getByAltText()
//		Locator fb_logo = page.getByAltText("Facebook");
//		System.out.println(fb_logo.isVisible());
//		System.out.println(fb_logo.isEnabled());
		
		//getByTestId()
		
		page.getByTestId("royal-login-button").click();
		page.getByTestId("open-registration-form-button").click();
		
		
		//getByRole()
//		 page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create new account")).click();
//       page.getByRole(AriaRole.LINK,new Page.GetByRoleOptions().setName("Create a Page")).click();
//		page.getByRole(AriaRole.HEADING,new Page.GetByRoleOptions().setName("Facebook helps you connect and share with the people in your life.")).isVisible();
	
	}

}

