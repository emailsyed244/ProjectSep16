package com.sep16.pages;

import com.sep16.common.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

/**
 * Created by UC181137 on 16/09/2017.
 */
@Component
public class SearchPage extends AbstractPage {


  public WebElement searchTextbox (){
      return waitForElementVisible(By.id("lst-ib"));
  }

    public WebElement searchCucumberLink (){
        return waitForElementVisible(By.xpath("//h3/a[@href='https://cucumber.io/']"));
    }
}
