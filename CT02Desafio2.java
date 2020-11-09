package com.example.tests;

//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class CT02Desafio2 {
  private WebDriver driver;
  //private String baseUrl;
  //private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private final String pathFirefoxDriver = "C:\\Selenium\\firefox.exe";

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  System.setProperty("webdriver.firefox.driver", pathFirefoxDriver);
	  driver = new FirefoxDriver();
    //baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCT02Desafio2() throws Exception {
    driver.get("https://shopcart-challenge.4all.com/");
    driver.findElement(By.xpath("//div[@id='open-categories-btn']/img")).click();
    driver.findElement(By.id("category-0")).click();
    driver.findElement(By.id("add-product-0-btn")).click();
    driver.findElement(By.id("add-product-1-btn")).click();
    driver.findElement(By.id("add-product-2-btn")).click();
    driver.findElement(By.xpath("//div[@id='open-categories-btn']/img")).click();
    driver.findElement(By.id("category-all")).click();
    driver.findElement(By.id("add-product-3-btn")).click();
    driver.findElement(By.xpath("//button[@id='cart-btn']/img")).click();
    driver.findElement(By.xpath("//div[@id='add-product-3-qtd']/span")).click();
    driver.findElement(By.xpath("//div[@id='add-product-3-qtd']/span")).click();
    driver.findElement(By.xpath("//div[@id='add-product-3-qtd']/span")).click();
    driver.findElement(By.xpath("//div[@id='add-product-3-qtd']/span")).click();
    driver.findElement(By.xpath("//div[@id='add-product-3-qtd']/span")).click();
    driver.findElement(By.xpath("//div[@id='add-product-3-qtd']/span")).click();
    driver.findElement(By.xpath("//div[@id='add-product-3-qtd']/span")).click();
    driver.findElement(By.xpath("//div[@id='add-product-3-qtd']/span")).click();
    driver.findElement(By.xpath("//div[@id='add-product-3-qtd']/span")).click();
    driver.findElement(By.id("remove-product-3-qtd")).click();
    driver.findElement(By.id("remove-product-3-qtd")).click();
    driver.findElement(By.id("remove-product-3-qtd")).click();
    driver.findElement(By.id("remove-product-3-qtd")).click();
    driver.findElement(By.id("remove-product-3-qtd")).click();
    driver.findElement(By.id("finish-checkout-button")).click();
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//div[@id='root']/div[3]/div/div/div/button")).click();
    driver.close();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  /*private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }*/
}
