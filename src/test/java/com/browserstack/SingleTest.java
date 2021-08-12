package com.browserstack;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SingleTest extends BrowserStackJUnitTest {

  @Test
  public void test() throws Exception {
    /*driver.get("https://www.google.com/ncr");
    WebElement element = driver.findElement(By.name("q"));
    element.sendKeys("BrowserStack");
    element.submit();
    Thread.sleep(5000);

    assertTrue(driver.getTitle().matches("(?i)BrowserStack - Google Search"));*/
      driver.get("https://the-internet.herokuapp.com/login");
      Thread.sleep(3000);
      WebElement e1 = driver.findElement(By.cssSelector("input[id='username']"));
      e1.sendKeys("tomsmith");
      Thread.sleep(3000);
      WebElement e2 = driver.findElement(By.xpath("//input[@id='password']"));
      e2.sendKeys("SuperSecretPassword!");
      Thread.sleep(3000);
      WebElement e3 = driver.findElement(By.cssSelector("button[class='radius']"));
      e3.click();

  }
}
