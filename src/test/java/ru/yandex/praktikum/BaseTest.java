package ru.yandex.praktikum;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

import static org.openqa.selenium.remote.BrowserType.CHROME;
import static org.openqa.selenium.remote.BrowserType.FIREFOX;

public abstract class BaseTest {

    //TODO разобраться с настоящей инициализацией браузера
    private final GeckoDriverService geckoDriverService = new GeckoDriverService.Builder().build();
    private final WebDriver firefoxDriver = new FirefoxDriver(geckoDriverService);

    private final ChromeDriverService chromeDriverService = new ChromeDriverService.Builder().build();
    private final WebDriver chromeDriver = new ChromeDriver(chromeDriverService);

    private WebDriver webDriver;

    public void selectBrowser(String browser) {
        switch (browser) {
            case CHROME: {
                webDriver = chromeDriver;
                break;
            }
            case FIREFOX: {
                webDriver = firefoxDriver;
                break;
            }
            default:
                webDriver = chromeDriver;
                break;
        }
    }

    @Before
    public void init() {
        selectBrowser(CHROME);
        webDriver.get("url"); //TODO написать начальный урл
    }

    @After
    public void quit() {
        webDriver.close();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
