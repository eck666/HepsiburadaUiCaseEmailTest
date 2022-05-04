package Tests;

import PageModel.LoginModel;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class LoginTest {
    LoginModel loginModel = new LoginModel();
    @Step("Email alanına <key> yazılır.")
    public void setEmail(String email) {
        loginModel.setTextEmail(email);
    }
    @Step("Kullanıcı E-Mail yazdıktan sonra Giriş Yap'a tıklar.")
    public void clickSubmit() {
        loginModel.clickSubmitBtn();
    }
    @Step("Kullanıcı <key> yazısı aldığını görür.")
    public void checkErrorMessage(String type) {
        Assert.assertTrue("Login fail case failed", loginModel.checkErrorMessage(type));
    }
}
