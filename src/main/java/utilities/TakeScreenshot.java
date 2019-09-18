package utilities;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TakeScreenshot
{
    //----------------------------------------------------------------------------------------------------------------//
    String folder_name;
    DateFormat df;

    public static void getScreenshot(AppiumDriver<WebElement> d) throws IOException
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        Date date = new Date();
        String fileName = sdf.format(date);
        File des = d.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(des, new File(System.getProperty("user.dir") + "//screenshots//" + fileName + ".png"));
        System.out.println("-- Screenshot is captured --");
    }
    //----------------------------------------------------------------------------------------------------------------//


}
