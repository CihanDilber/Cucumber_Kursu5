package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD_old {

    private static WebDriver driver;

    public static WebDriver getDriver()  // driveri baslat bana ver
    {

        // extend report turkce bilgisayar calismamasi sebebi ile kondu
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        if (driver == null) {  // 1 kere calissin
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--remote-allow-origins=*");
//            driver = new ChromeDriver(options);

            driver=new ChromeDriver();

        }

        return driver;

    }

    public static void quitDriver(){
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

        if(driver!=null){  // dolu ise kapat, bos degilse
            driver.quit();
            driver=null;
        }
    }
}