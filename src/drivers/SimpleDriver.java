//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleDriver {

    public void drive() {
        System.setProperty("webdriver.chrome.driver", "C:\\extrenal_libs\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/xhtml");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(new CharSequence[]{"worlds 2018"});
        searchBox.submit();
        driver.quit();
    }
}
