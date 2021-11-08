package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static String path;
    private static WebDriver driver = null;

    public static WebDriver getDriver() throws MalformedURLException {
        path = System.getProperty("user.dir");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("autoGrantPermissions",true);
        cap.setCapability("deviceName","159d7dfb");
        cap.setCapability("udid","159d7dfb");
        cap.setCapability("platformVersion","9");
        cap.setCapability("platformName","Android");
        cap.setCapability("app",path+"/Apps/Smiles-React-Android-Hml24000.apk");
        cap.setCapability("appPackage","com.br.smiles.hml");
        cap.setCapability("appActivity","com.br.smiles.MainActivity");
        cap.setCapability("newCommandTimeout",3000);
        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }
}
