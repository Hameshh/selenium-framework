package com.testing.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EchoFitCompPagePO {
    @FindBy(id = "option-label-size-157-item-175")
    public static WebElement EcoCompressionSize28link;

    @FindBy(id = "option-label-color-93-item-50")
    public static WebElement EcoCompressionColourBlueLink;

    @FindBy(xpath = "//*[@id=\"product-addtocart-button\"]/span")
    public static WebElement AddToCartButtonEcoCompressionShort;

    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div[1]/a")
    public static WebElement CartButtonEcoCompressionShort;

    @FindBy(id = "top-cart-btn-checkout")
    public static WebElement ProceedTToCheckoutButtonEcoCompressionShort;


}
