package com.sep16.step_definition;

import com.sep16.configuration.WebConnect;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by UC181137 on 16/09/2017.
 */
@ContextConfiguration("classpath:cucumber.xml")
public class BaseStepDef {

    @Autowired
    protected WebConnect webConnect;

    public WebDriver getDriver(){
        return webConnect.getDriver();
    }

}
