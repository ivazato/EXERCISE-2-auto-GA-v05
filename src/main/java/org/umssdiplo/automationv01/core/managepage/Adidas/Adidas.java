package org.umssdiplo.automationv01.core.managepage.Adidas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Adidas extends BasePage {

    @FindBy(xpath = "//a[contains(.,'HOMBRE')]")
    private WebElement hombreLink;

    @FindBy(css = "div.col-5")
    private WebElement futbolLink;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div[3]/a")
    private WebElement firstItemLink;


    @FindBy(xpath = "//button[@title='Elige tu talla']")
    private WebElement selectTalla;

    @FindBy(xpath = "//button[@title='MX 9.5']")
    private WebElement talla;

    public static final String PATH_TALLA = "//button[@title='%s']";


    public void hoverOnHombreMenu() throws InterruptedException {
        CommonEvents.hoverElement(hombreLink);
    }

    public void clickOnfutbol() {
        CommonEvents.clickButton(futbolLink);
    }

    public void clickFirstItem() {
        CommonEvents.clickButton(firstItemLink);
    }


    public void clickSelectTalla() {
        CommonEvents.clickButton(selectTalla);
    }

//    public void clickTalla(String talla) {
//        By by = By.xpath(String.format(PATH_TALLA, talla));
//        CommonEvents.clickButton(by);
//    }

}
