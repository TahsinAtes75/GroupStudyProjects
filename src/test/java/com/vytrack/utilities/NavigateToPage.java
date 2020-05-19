package com.vytrack.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NavigateToPage {

    public static void navigateToModulePage (WebDriver driver, String moduleName, String pageName) {

        WebElement module = driver.findElement(By.xpath("//span[contains(text(), '" + moduleName + "')]"));
        WebElement page = driver.findElement(By.xpath("//span[.='" + pageName + "']"));

        Actions action = new Actions(driver);
        action.moveToElement(module).perform();

        page.click();

        LoadingWaits.expWait(driver);






    }
}
