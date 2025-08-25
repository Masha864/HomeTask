import lab.lesson9.pages.HomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;

public class MtsByTests1 {
    private WebDriver driver;
    private HomePage homePage;
    private Actions action;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mts.by");
        waitForPageLoad(driver);
        homePage = new HomePage(driver);
        homePage.acceptCookies();
        action = new Actions(driver);
    }

    private void waitForPageLoad(WebDriver driver) {
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(priority = 1)
    public void checkServicesPlanPlaceholders() throws InterruptedException {
        action.scrollToElement(driver.findElement(By.className("pay__partners")));
        action.moveToElement(driver.findElement(By.className("select__now"))).build().perform();

        Assert.assertTrue(homePage.isServicesPlanSelectedDisplayed(), "План 'Услуги связи' is selected by default");

        Assert.assertTrue(homePage.isNumberPhonePlaceholderServicesDisplayed(), "Placeholder 'Номер телефона' is present");

        WebElement inputSummaServices = driver.findElement(By.id("connection-sum"));
        String placeholderServicesValue = inputSummaServices.getAttribute("placeholder");
        String expectedPlaceholderServicesValue = "Сумма";
        Assert.assertEquals(placeholderServicesValue, expectedPlaceholderServicesValue, "Значение placeholder Сумма не соответствует ожидаемому.");

        WebElement inputEmail = driver.findElement(By.id("connection-email"));
        String emailPlaceholderValue = inputEmail.getAttribute("placeholder");
        String expectedEmailPlaceholderValue = "E-mail для отправки чека";
        Assert.assertEquals(emailPlaceholderValue, expectedEmailPlaceholderValue, "Значение placeholder E-mail не соответствует ожидаемому.");
    }

    @Test(priority = 2)
    public void checkHomeInternetPlanPlaceholders() throws InterruptedException {

        action.moveToElement(driver.findElement(By.className("select__now"))).build().perform();
        driver.findElement(By.xpath("//span[@class='select__now']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//li[@class='select__item']/p[text()='Домашний интернет']")).click();
        Thread.sleep(2000);

        Assert.assertTrue(homePage.isNumberInternetHomePlaceholderDisplayed(), "Placeholder 'Номер абонента' is present");

        Assert.assertTrue(homePage.isSummaInternetHomePlaceholderDisplayed(), "Placeholder 'Сумма' is present");

        Assert.assertTrue(homePage.isEmailInternetHomePlaceholderDisplayed(), "Placeholder 'E-mail для отправки чека' is present");
    }

    @Test(priority = 3)
    public void checkInstalmentPlanPlaceholders() throws InterruptedException {

        action.moveToElement(driver.findElement(By.className("select__now"))).build().perform();
        driver.findElement(By.xpath("//span[@class='select__now']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//li[@class='select__item']/p[text()='Рассрочка']")).click();
        Thread.sleep(2000);

        Assert.assertTrue(homePage.isNumberAccountPlaceholderDisplayed(), "Placeholder 'Номер счета на 44' is present");

        Assert.assertTrue(homePage.isSummaPlaceholderDisplayed(), "Placeholder 'Сумма' is present");

        Assert.assertTrue(homePage.isEmailPlaceholderDisplayed(), "Placeholder 'E-mail для отправки чека' is present");
    }

    @Test(priority = 4)
    public void checkArrearsPlanPlaceholders() throws InterruptedException {

        action.moveToElement(driver.findElement(By.className("select__now"))).build().perform();
        driver.findElement(By.xpath("//span[@class='select__now']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//li[@class='select__item']/p[text()='Задолженность']")).click();
        Thread.sleep(2000);

        Assert.assertTrue(homePage.isNumberAccountArrearsPlaceholderDisplayed(), "Placeholder 'Номер счета на 2073' is present");

        Assert.assertTrue(homePage.isSummaArrearsPlaceholderDisplayed(), "Placeholder 'Сумма' is present");

        Assert.assertTrue(homePage.isEmailArrearsPlaceholderDisplayed(), "Placeholder 'E-mail для отправки чека' is present");
    }
}
}
