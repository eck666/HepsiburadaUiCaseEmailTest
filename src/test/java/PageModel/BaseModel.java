package PageModel;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseModel extends Driver {
    WebDriverWait wait = new WebDriverWait(webDriver,20);
    public WebElement findElement(By by){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return webDriver.findElement(by);
    }
    public void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    }
    public void clickElement(By by) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }
    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public String getText(By by){
        return findElement(by).getText();
    }
}
