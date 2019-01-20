package soni.Practice.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


public class SceenShot {

	public static void captureVisiblePart(WebDriver driver,String
			fileSavePath,String fileName) throws Exception{
		// this code for create unique file
		Calendar calender=Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss_SSS");
		fileName= fileName+"_"+formater.format(calender.getTime())+".png";
		// this code to capture screenshot
		TakesScreenshot ts= (TakesScreenshot)driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationPath= fileSavePath+"/"+ fileName;
		File destinationfile = new File(destinationPath);
		FileUtils.copyFile(source, destinationfile);
	}
	
	public static void captureFullPage(WebDriver driver,String
			fileSavePath,String fileName) throws Exception{
		// this code for create unique file
		Calendar calender=Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss_SSS");
		fileName= fileName+"_"+formater.format(calender.getTime())+".png";
		// this code to capture screenshot
		Screenshot screenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		String destinationPath= fileSavePath+"/"+ fileName;
		File destinationfile = new File(destinationPath);
		//ImageIO.write(im, formatName, output)
		ImageIO.write(screenshot.getImage(), "png", destinationfile);
	
	}
}
