package Tests;
import PageModel.HomeModel;
import com.thoughtworks.gauge.Step;

public class HomeTest {

    HomeModel homeModel = new HomeModel();

    @Step("Kullanıcı <key> sitesini ziyaret eder")
    public void userVisitSite(String key){
        homeModel.userVisitSite(key);
    }
    @Step("Kullanıcı <key> tabına gider.")
    public void clickLogin(String xxx){
        homeModel.clickLogin(xxx);
    }
    @Step("Kullanıcı Giriş Yap'a tıklar.")
    public void clickLogin2(){
        homeModel.clickLogin2();
    }

}