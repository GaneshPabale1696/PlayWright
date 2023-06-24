package com.PlayWright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.AriaRole;

public class ExampleDemo {

	 public static void main(String[] args) {
		    try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext();
		      Page page = context.newPage();
		      page.navigate("https://demo.playwright.dev/todomvc/");
		      page.navigate("https://demo.playwright.dev/todomvc/#/");
		      page.getByPlaceholder("What needs to be done?").click();
		      page.getByPlaceholder("What needs to be done?").fill("amazone");
		      page.getByPlaceholder("What needs to be done?").press("Enter");
		      page.navigate("https://www.google.com/search?q=amazone&oq=amazone&aqs=chrome..69i57.46476j0j4&sourceid=chrome&ie=UTF-8");
		      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("India's largest online store - Great deals & prices everyday Amazon.in https://www.amazon.in")).click();
		      page.getByPlaceholder("Search Amazon.in").click();
		      page.getByPlaceholder("Search Amazon.in").fill("apple");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("apple airpods")).click();
		      page.navigate("https://www.amazon.in/Apple-AirPods-with-Charging-Case/dp/B07Q6153FQ/ref=sr_1_1_sspa?crid=1ZXL4AXDOW27J&keywords=apple+airpods&qid=1686058573&sprefix=apple%2Caps%2C489&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		      page.navigate("https://www.amazon.in/Apple-AirPods-with-Charging-Case/dp/B07Q6153FQ/ref=sr_1_1_sspa?crid=1ZXL4AXDOW27J&keywords=apple+airpods&qid=1686058573&sprefix=apple%2Caps%2C489&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add to Cart")).click();
		    }
		  }
	
	
}
