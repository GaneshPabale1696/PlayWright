package com.PlayWright;

import java.nio.file.Paths;

import com.microsoft.playwright.*;

public class DemoPlayWrightProgram {

	public static void main(String[] args) {

		     Playwright playwright = Playwright.create(); 
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		      Page page = browser.newPage();
		      page.navigate("https://www.google.com/");
		      System.out.println(page.title());
		      page.type("//textarea[@name='q']", "Facebook");
		      page.click("//input[@name='btnK']");
		      page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
		     // browser.close();
		     // playwright.close();
		  }
	}


