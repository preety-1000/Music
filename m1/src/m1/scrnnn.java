package m1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(m1.scrn.class)
public class scrnnn extends Testbase {
	
	
	@Test
	public static  void m1() {
		Testbase.setup();
		
	}
	
	
	@Test
	public  static void m4() {
		Assert.fail();
	}
	
	
	
	}
	
	
	
	
