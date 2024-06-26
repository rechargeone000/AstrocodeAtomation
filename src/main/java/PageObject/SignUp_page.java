package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonElements.CommonHelp;
import baseclass.BaseTestclass;

public class SignUp_page extends BaseTestclass {

	By signupsubmit = By.xpath("//button[normalize-space()='Signup']");

	By checkbox1 = By.xpath("//input[@name='term']");

	By nuumberisalreadytaken = By.xpath("//div[@class='invalid-feedback'])[2]");
	By registerbtnv = By.xpath("//a[@class='py-5 px-10 text-dark-blue font-14']");

	By namee = By.xpath("//input[@name='full_name']");
	By entermob = By.xpath("//*[@id='mobile']");

	By eml = By.xpath("//*[@id='email']");
	By pasword = By.xpath("//*[@id='password']");
	By connppasword = By.xpath("//*[@id='confirm_password']");

	By signsubmit = By.xpath("(//button[@type=\"submit\"])[2]");

	public void clickonregbtn(String name, String number, String emaile, String passwordd, String conpassword)
			throws InterruptedException {
		Thread.sleep(2000);

		CommonHelp.clickOnElement_JS(registerbtnv);
		Thread.sleep(5000);

		driver.findElement(namee).sendKeys(name);
		driver.findElement(entermob).sendKeys(number);

		driver.findElement(eml).sendKeys(emaile);
		driver.findElement(pasword).sendKeys(passwordd);

		driver.findElement(connppasword).sendKeys(conpassword);

		Thread.sleep(3000);

		CommonHelp.clickOnElement_JS(checkbox1);
		driver.findElement(signupsubmit).click();
		Thread.sleep(4000);
		// driver.findElement(signsubmit).click();

	}

	public String userisnotsinedup() {
		String intext = driver.findElement(nuumberisalreadytaken).getText();
		System.out.println(intext);
		String numbertext = driver.findElement(By.xpath("(//div[@class=\"invalid-feedback\"])[2]")).getText();
		return intext;
	}

	public void check() {
		// CommonHelp.clickOnElement(registerbtnv);
		System.out.println("clicked on the click button");
		CommonHelp.clickOnElement(checkbox1);
	}

	public void deletetheuser() throws InterruptedException {
		LoginPage lp = new LoginPage();
		try {
			lp.logincase("astrolok.vedic@gmail.com", "admin@112211");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		By usersEle = By.xpath("//span[normalize-space()='Users']");
		By Students = By.xpath("//a[normalize-space()='Students']");
		CommonHelp.scrollToElementView(usersEle);
		Thread.sleep(2000);

		driver.findElement(usersEle).click();
		Thread.sleep(2000);
		driver.findElement(Students).click();
		WebElement firstrow = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[3]/div[2]/div[2]/div/table/tbody/tr[2]"));
		System.out.println(firstrow.getText());
		driver.findElement(By.xpath(
				"//button[@class='btn-transparent text-primary trigger--fire-modal-1']//i[@class='fa fa-times']"))
				.click();
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("(//a[@class='btn btn-danger btn-shadow'])[1]")).click();
		Thread.sleep(3000);

	}

}
