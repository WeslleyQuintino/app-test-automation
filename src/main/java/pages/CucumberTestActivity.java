package pages;

import Core.DriverFactory;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Core.DriverFactory.*;
public class CucumberTestActivity extends DriverFactory {

    @AndroidBy(xpath = "//android.widget.TextView[@text='Olá, viajante']")
    private AndroidElement titleHome;

    public void validateHomePage() throws InterruptedException {
        System.out.println(titleHome.getText().trim());
        Thread.sleep(15000);
        assertEquals("Olá, viajante", titleHome.getText());
    }
}
