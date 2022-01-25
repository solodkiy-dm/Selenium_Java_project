import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/dm/chromedriver");

        WebDriver driver = new ChromeDriver();

        //не явное ожидание, implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //maximize our window
        driver.manage().window().maximize();
//
//        явное ожидание, explicit wait
//        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
//                    .until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));
        //go to the page
        driver.get("http://google.com");

        //click google settings
        WebElement input = driver.findElement(By.xpath("//div[@class='jyfHyd']"));
        input.click();
        WebElement input1 = driver.findElement(By.xpath(
                "//div[@class='VfPpkd-WsjYwc VfPpkd-WsjYwc-OWXEXe-INsAgc KC1dQ Usd1Ac AaN0Dd  iWeOse']" +
                        "[1]//*[text()='Вкл.']"));
        input1.click();
        WebElement input2 = driver.findElement(By.xpath(
                "//div[@class='VfPpkd-WsjYwc VfPpkd-WsjYwc-OWXEXe-INsAgc KC1dQ Usd1Ac AaN0Dd  iWeOse']" +
                        "[2]//*[text()='Вкл.']"));
        input2.click();
        WebElement input3 = driver.findElement(By.xpath(
                "//div[@class='VfPpkd-WsjYwc VfPpkd-WsjYwc-OWXEXe-INsAgc KC1dQ Usd1Ac AaN0Dd  iWeOse']" +
                        "[3]//*[text()='Выкл.']"));
        input3.click();
        WebElement input4 = driver.findElement(By.xpath("//span[text()='Подтвердить']"));
        input4.click();

        WebElement inputSearch = driver.findElement(By.xpath("//input[@name='q']"));
        inputSearch.sendKeys("olx.pl", Keys.ENTER);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement olx = driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']"));
        olx.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //explicit wait for element by id
        WebElement accept = (new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("onetrust-accept-btn-handler"))));

        //click acceptParam
        WebElement acceptParam = driver.findElement(By.id("onetrust-accept-btn-handler"));
        acceptParam.click();

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//
//        }

//        driver.navigate().back();
        String title = driver.getTitle();
        System.out.println(title);
        String handle = driver.getWindowHandle();
        System.out.println(handle);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100)", "");
//        js.executeScript("window.open()");

        WebElement motor = driver.findElement(By.xpath("//a[@href='https://www.olx.pl/motoryzacja/'][1]"));
        motor.click();

        WebElement samOs = driver.findElement(By.xpath("//span[text()='Samochody osobowe']"));
        Thread.sleep(2000);
        samOs.click();

        WebElement marka = driver.findElement(By.xpath("(//span[@class='icon down abs'])[1]"));
        Thread.sleep(2000);
        marka.click();

        WebElement skoda = driver.findElement(By.xpath("//a[@data-code='skoda']"));
        Thread.sleep(2000);
        skoda.click();

        WebElement model = driver.findElement(By.xpath("//div[@class='filter-item rel filter-item-model']"));
        Thread.sleep(2000);
        model.click();

        WebElement octavia = driver.findElement(By.xpath("(//span[text()='Octavia'])[1]"));
        Thread.sleep(2000);
        octavia.click();

        WebElement cenaOd = driver.findElement(By.xpath("(//span[text()='od'])[1]"));
        Thread.sleep(2000);
        cenaOd.click();

        WebElement cenaOdValue = driver.findElement(By.xpath("//ul//a[@data-name='7 000']"));
        Thread.sleep(2000);
        cenaOdValue.click();

        WebElement cenaDo = driver.findElement(By.xpath("(//span[text()='do'])[1]"));
        Thread.sleep(2000);
        cenaDo.click();

        WebElement cenaDoValue = driver.findElement(By.xpath("//ul//a[@data-name='10 000']"));
        Thread.sleep(2000);
        cenaDoValue.click();

        WebElement rokProdOd = driver.findElement(By.xpath
                ("(//a[@class='button button-from numeric gray block fnormal rel zi3 clr']" +
                        "//span[@data-default-label='od'])[1]"));
        Thread.sleep(2000);
        rokProdOd.click();

        WebElement rokProdOdValue = driver.findElement(By.xpath("//ul//a[@data-name='2007']"));
        Thread.sleep(2000);
        rokProdOdValue.click();

        WebElement rokProdDo = driver.findElement(By.xpath("(//span[text()='do'])[1]"));
        Thread.sleep(2000);
        rokProdDo.click();

        WebElement rokProdDoValue = driver.findElement(By.xpath("(//ul//a[@data-name='2010'])[2]"));
        Thread.sleep(2000);
        rokProdDoValue.click();

        WebElement pojSilOd = driver.findElement(By.xpath("(//span[text()='od'])[1]"));
        Thread.sleep(2000);
        pojSilOd.click();

        WebElement pojSilOdValue = driver.findElement(By.xpath("(//a[text()='1 250 cm³'])[1]"));
        Thread.sleep(2000);
        pojSilOdValue.click();

        WebElement pojSilDo = driver.findElement(By.xpath("(//span[text()='do'])[1]"));
        Thread.sleep(2000);
        pojSilDo.click();

        WebElement pojSilDoValue = driver.findElement(By.xpath("(//a[text()='2 000 cm³'])[2]"));
        Thread.sleep(2000);
        pojSilDoValue.click();

//        System.out.println(pojSilDoValue);
//        System.out.println(pojSilOdValue);

        WebElement przebiegOd = driver.findElement(By.xpath("(//span[text()='od'])[1]"));
        Thread.sleep(2000);
        przebiegOd.click();

        WebElement przebiegOdValue = driver.findElement(By.xpath("//a[text()='200 000 km']"));
        Thread.sleep(2000);
        przebiegOdValue.click();

//        WebElement przebiegDo = driver.findElement(By.xpath("(//span[text()='do'])[1]"));
//        przebiegDo.sendKeys("250000");
//        Thread.sleep(2000);

    }
}
