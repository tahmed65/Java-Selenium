package step_definitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CgsSalesforcePage;




public class CgsSalesforceStepDef{
    public WebDriver driver;
    
    public CgsSalesforceStepDef()
    {
    	driver = Hooks.driver;
    }
    
    @Given("user visit CGS salesforce site")
    public void user_visit_cgs_salesforce_site() throws InterruptedException {
       Thread.sleep(2);
       driver.get("https://cgs1.lightning.force.com/");
    }

    @When("user enter user id and password")
    public void user_enter_user_id_and_password() throws Throwable {
        PageFactory.initElements(driver, CgsSalesforcePage.class);
        CgsSalesforcePage.user_authentication_process();;
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        
    }

    @Then("user logs into the CGS site")
    public void user_logs_into_the_cgs_site() {
        
    }

    @Given("user clicks on Sign In button")
    public void user_clicks_on_sign_in_button() throws InterruptedException {
    	Thread.sleep(3);
    	PageFactory.initElements(driver, CgsSalesforcePage.class);
    	CgsSalesforcePage.loginbutton();
    }
    
}