package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{


    // sol taraftaki menuler burada
    // pom larin oldugu yani locater aldigimiz her page e constructor ile pageFactory koyuyoruz
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;
    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;
    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citizenships;

    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citizenShip;

    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    private WebElement fees;

    @FindBy(xpath = "//span[text()='States']")
    private WebElement states;

    public WebElement getWebElement(String strButton){

        switch (strButton)
        {
            case "setup" : return setup;
            case "parameters" : return parameters;
            case "countries" : return countries;
            case "citizenShip" : return citizenShip;
            case "nationalities" : return nationalities;
            case "fees" : return fees;
            case "states" : return states;
        }

        return null;
    }
}
