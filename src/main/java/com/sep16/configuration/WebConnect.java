package com.sep16.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by UC181137 on 16/09/2017.
 */
@Component
public class WebConnect {

    private final static org.slf4j.Logger LOG= org.slf4j.LoggerFactory.getLogger("WebConnect");

    @Value("${driverType}")
    private String driverType;

    private static RemoteWebDriver driver;

    public WebDriver getDriver(){
        LOG.info("In GetDriver");
        if(driver==null) {
            if (driverType.equalsIgnoreCase("firefox")) {
                LOG.info("Firefox Driver is being initialized....!");
                driver = new FirefoxDriver();
            } else if (driverType.equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else {
                // throw new Exception("No Driver Found..!");
                LOG.error("No Driver Found..!");
            }
        }
        return driver;
    }

    public void closeSetup(){
        if(getDriver()!=null){
            getDriver().quit();
        }
    }

}
