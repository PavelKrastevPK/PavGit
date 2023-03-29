package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestUtilJala {
    public WebDriver driver;
    private String url;
    private int implicitWait;
    private String browser;

    @BeforeMethod
    public void Setup() {
        setupBrowserDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    private void setupBrowserDriver() {
        try (FileInputStream configFile = new FileInputStream("src/test/resources/JalaData/")) {
            Properties config = new Properties();
            config.load(configFile);
            url = config.getProperty("urlAddress");
            implicitWait = Integer.parseInt(config.getProperty("implicitWait"));
            browser = config.getProperty("browser");
        } catch (IOException e) {
            System.out.println("Cannot read configs");
        }
        switch (browser) {
            case "edge":
                createGetEdgeDriver(url, implicitWait);
                break;
            case "chrome":
                createGetChromeDriver(url, implicitWait);
            default:
                throw new IllegalStateException("Unsupported browser type");
        }

    }

    private void loadUrl(String url) {
        driver.get(url);
    }

    private void createGetChromeDriver(String url, int implicitWait) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
        loadUrl(url);
    }

    private void createGetEdgeDriver(String url, int implicitWait) {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
        loadUrl(url);
    }
}
