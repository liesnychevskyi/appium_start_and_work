package utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofSeconds;

public class TapActions
{
    private AndroidDriver driver;

    public TapActions (AndroidDriver driver)
    {
        this.driver = driver;
    }

}
