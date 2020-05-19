package com.vytrack.utilities.DeadPool;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoadingWaits {

    public static void expWait(){
        WebDriver driver = Driver.get();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement loader= driver.findElement(By.cssSelector(".loader-mask>.loader-frame"));
        wait.until(ExpectedConditions.invisibilityOfAllElements(loader));
    }

}