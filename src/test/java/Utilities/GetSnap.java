package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetSnap {
    public static void capture(WebDriver driver) throws IOException {
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        TakesScreenshot sc = (TakesScreenshot) driver;
        File src = sc.getScreenshotAs(OutputType.FILE);
        File dest = new File("/Users/antonyshon.j/Desktop/Screenshots/"+timestamp+".png");
        FileUtils.copyFile(src,dest);
    }
}
