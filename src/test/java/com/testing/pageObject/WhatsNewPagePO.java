package com.testing.pageObject;

import com.github.dockerjava.api.model.Link;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhatsNewPagePO {
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/div/strong/a")
    public static WebElement EchoFitCompressionShortLink;


}
