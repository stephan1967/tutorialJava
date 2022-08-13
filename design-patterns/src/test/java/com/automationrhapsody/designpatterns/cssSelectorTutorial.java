package src.test.java.com.automationrhapsody.designpatterns;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorTutorial {
    private static final String URL1 = "https://demoqa.com/automation-practice-form";

    @Test
    public void cssTutorial() {

        // Source : https://www.toolsqa.com/selenium-webdriver/css-selectors-in-selenium/

        ChromeDriver driver = new ChromeDriver();
        driver.get(URL1);
        driver.manage().window().maximize();

        // FindBy CSS Selector + Id
        driver.findElement(By.cssSelector("input#firstName")).sendKeys("Danny the Frogger");
        driver.findElement(By.cssSelector("input#firstName")).clear();

        // FindBy CSS Selector + Id starting with
        driver.findElement(By.cssSelector("input[id^='lastN']")).sendKeys("the Wixer");
        driver.findElement(By.cssSelector("input[id^='lastN']")).clear();

        // FindBy CSS Selector + Id ending with  (LET OP : er zijn 2 elementen die eindigen op ame :-)
        driver.findElement(By.cssSelector("input[id$='ame']")).sendKeys("Voornaam");
        driver.findElement(By.cssSelector("input[id$='ame']")).clear();

        // FindBy CSS Selector + Id containing
        driver.findElement(By.cssSelector("input[id*='erEm']")).sendKeys("Voornaam@thewiker.org");
        driver.findElement(By.cssSelector("input[id*='erEm']")).clear();


        // FindBy CSS Selector + Class
        driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("Lorem ipsum krokettendag.");
        driver.findElement(By.cssSelector("textarea.form-control")).clear();

        // FindBy CSS Selector + Attribute
        driver.findElement(By.cssSelector("textarea[placeholder='Current Address']")).sendKeys("Als gaajl is mag allus");
        driver.findElement(By.cssSelector("textarea[placeholder='Current Address']")).clear();

        // How to Combine the ID and other Attributes of the web element to create a CSS Selector?
        driver.findElement(By.cssSelector("textarea#currentAddress[placeholder='Current Address']\n")).sendKeys("This is my church !!");
        driver.findElement(By.cssSelector("textarea#currentAddress[placeholder='Current Address']\n")).clear();

        // How to locate a web element using Parent/Child hierarchy?
        // How to locate a web element when one element is the direct parent/child of another element?
        driver.findElement(By.cssSelector("div>textarea[placeholder='Current Address']")).sendKeys("div>textarea[placeholder='Current Address']");
        driver.findElement(By.cssSelector("div>textarea[placeholder='Current Address']")).clear();

        driver.get("https://demoqa.com/selectable");
        driver.findElement(By.cssSelector("ul#verticalListContainer>li:nth-of-type(2)")).click();  // klik op Dapibus ac facilisis in

        driver.quit();
    }
}