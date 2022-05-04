package PageModel;

import org.openqa.selenium.By;

import java.util.logging.Logger;

public class LoginModel extends BaseModel {
    public static By email = By.id("txtUserName");
    public static By password = By.className("hb-AxiLy");
    public static By submitButton = By.cssSelector("[type='submit']");
    public static By errorBoxMail = By.className("hb-fznKot");
    public static By errorBoxPw = By.className("hb-fzokND");


    protected final Logger log = Logger.getLogger(String.valueOf(BaseModel.class));
    public void waitSeconds(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();

            log.info("");
        }
    }
    public boolean checkErrorMessage(String type) {
        switch (type) {
            case "E-Mail Hatalı":
                return getText(errorBoxMail).equals("E-posta adresi eksik veya hatalı.");
            case "Şifre Hatalı":
                return getText(errorBoxPw).equals("Girdiğiniz şifre eksik veya hatalı.");
        }
        return false;
    }

    public void clickSubmitBtn() {
        waitSeconds(1);
        clickElement(submitButton);
    }

    public void setTextEmail(String emailText) {
        waitSeconds(1);
        sendKeys(email, emailText);
    }


}
