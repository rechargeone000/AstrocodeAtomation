package Testcaseoutp;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseclass.BaseTestclass;

public class forgotpassword extends BaseTestclass {

	//@Test
	public void mailtest() {
		int c = 0;
		String url = "https://lms.asttrolok.in";
		loadConfig(url);
		for (int i = 0; i < 500; i++) {
			driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"))
					.sendKeys("balmukund.sahu@rechargestudio.com");

			driver.findElement(By.xpath("//button[normalize-space()='Reset Password']")).click();
					
			// Thread.sleep(5000);
			c++;
			System.out.println(c);

		}

	}

}
