package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;

public class Hooks {

    @After  // cucumber olani aldik // her senaryodan sonra calisir bu
    public void after(){
        System.out.println("Senaryo bitti");
        GWD.quitDriver();
    }
}
