package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static driver.Driver.webDriver;

public class HomeModel extends BaseModel {


    public static By loginClick = By.xpath("//*[@id='myAccount']");
    public static By clickLogin2 = By.xpath("//*[@id='login']");
    public void userVisitSite(String key){
        webDriver.get(key);
    }
    public void clickLogin(String xxx){
        clickElement(loginClick);
    }
    public void clickLogin2(){
        clickElement(clickLogin2);
    }

}
