package steps.app;

import io.cucumber.java.pt.Dado;
import pages.CucumberTestActivity;

public class CucumberTestStep {
    CucumberTestActivity home = new CucumberTestActivity();
    @Dado("que estou no aplicativo")
    public void que_estou_no_aplicativo() throws InterruptedException {
        System.out.println("entrou aqui");
        home.validateHomePage();
    }
}
