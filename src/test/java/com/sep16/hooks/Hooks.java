package com.sep16.hooks;

import com.sep16.configuration.WebConnect;
import com.sep16.step_definition.BaseStepDef;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by UC181137 on 16/09/2017.
 */
public class Hooks extends BaseStepDef{

//    @Autowired
//    private WebConnect driver;

    private final static org.slf4j.Logger LOG= org.slf4j.LoggerFactory.getLogger("Hooks");

    @Before
    public void setup(){
        LOG.info("In Setup");
         if(getDriver()==null){
             getDriver().navigate().to("http://www.google.co.uk");
         }else{
             getDriver().manage().deleteAllCookies();
             getDriver().navigate().to("http://www.google.co.uk");
         }
    }

    @After
    public void tearDown(Scenario scenario){
        LOG.info("Scenario ID :"+scenario.getId());
        LOG.info("Scenario Name :"+scenario.getName());
        LOG.info("Scenario Status :"+scenario.getStatus());
        if(scenario.isFailed()){
            byte[] screenshot=((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }
    }
}
