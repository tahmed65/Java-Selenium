package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import helpers.Constants;
import helpers.DataHelper;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class CgsSalesforcePage extends BaseClass{
	public CgsSalesforcePage (WebDriver driver) {
		super(driver);
	}

	//creating object of ExcelUtils class
	static DataHelper excelUtils = new DataHelper();

	//using the Constants class values for excel file path 
	static String excelFilePath =Constants.Path_TestData+Constants.File_TestData;

	//------------------------Page Elements--------------------------------------//

	@FindBy(how=How.ID, using= "username")
	public static WebElement username;

	@FindBy(how=How.ID, using= "password")
	public static WebElement password;

	@FindBy(how=How.ID, using= "Login")
	public static WebElement SignIn;




	//--------------------------------------------------------------------------//


	public static void user_authentication_process() throws InterruptedException, IOException {



		//calling the ExcelUtils class method to initialise the workbook and sheet
		DataHelper.setExcelFile(excelFilePath,"Sheet1");

		//iterate over all the row to print the data present in each cell.
		for(int i=1;i<=DataHelper.getRowCountInSheet();i++)
		{
			//Enter the values read from Excel in username, password
			username.sendKeys(DataHelper.getCellData(i,0));
			password.sendKeys(DataHelper.getCellData(i,1));
			



		}
	}

	public static void loginbutton() throws InterruptedException{
		SignIn.click();
	}


}


















	