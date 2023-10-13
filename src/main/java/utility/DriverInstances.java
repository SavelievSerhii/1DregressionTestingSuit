package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


import java.util.concurrent.TimeUnit;

public class DriverInstances {

//    private static final Map<String, WebDriver> webDriverInstances = new HashMap();
//
//    static {
//        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\chromedriver.exe");
//        System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\msedgedriver.exe");
//        System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY, System.getProperty("user.dir") + "\\src\\main\\resources\\drivers\\geckodriver.exe");
//    }
//
//    private DriverInstances() {
//    }
//
//    /**
//     * @param driverType - a type of driver to be initialized:
//     *                   GC - Google Chrome
//     *                   FF - Firefox
//     *                   IE - Internet Explorer
//     *                   EG - Edge
//     */
//
//    public static synchronized WebDriver getInstance(String driverType) {
//        WebDriver webDriver = webDriverInstances.get(driverType);
//        switch (driverType.toUpperCase()) {
//            case Constant.GOOGLE_CHROME:
//                String downloadFilepath = Constant.PathsForFilesOfProject.PROJECT_DOWNLOAD_PATH;
//                HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//                chromePrefs.put("profile.default_content_settings.popups", 0);
//                chromePrefs.put("download.prompt_for_download", false);
//                chromePrefs.put("download.default_directory", downloadFilepath);
////                ChromeOptions options = new ChromeOptions();
////                options.setExperimentalOption("prefs", chromePrefs);
////                DesiredCapabilities cap = DesiredCapabilities.chrome();
////                cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
////                cap.setCapability(ChromeOptions.CAPABILITY, options);
////                options.merge(cap);
////                webDriver = new ChromeDriver(options);
//                break;
//            case Constant.FIREFOX:
//                FirefoxOptions firefoxOptions = new FirefoxOptions();
////                firefoxOptions.addPreference("browser.download.dir", Variables.PROJECT_DOWNLOAD_PATH);
////                firefoxOptions.addPreference("browser.download.folderList", 2);
////                firefoxOptions.addPreference("browser.download.manager.showWhenStarting", false);
////                firefoxOptions.addPreference("browser.helperApps.neverAsk.openFile",
////                        Variables.MIME_TYPES);
////                firefoxOptions.addPreference("browser.helperApps.neverAsk.saveToDisk",
////                        Variables.MIME_TYPES);
////                firefoxOptions.addPreference("browser.helperApps.alwaysAsk.force", false);
////                firefoxOptions.addPreference("browser.download.manager.alertOnEXEOpen", false);
////                firefoxOptions.addPreference("browser.download.manager.focusWhenStarting", false);
////                firefoxOptions.addPreference("browser.download.manager.useWindow", false);
////                firefoxOptions.addPreference("browser.download.manager.showAlertOnComplete", false);
////                firefoxOptions.addPreference("browser.download.manager.closeWhenDone", false);
//                webDriver = new FirefoxDriver(firefoxOptions);
//                break;
//            case Constant.EDGE:
//                webDriver = new EdgeDriver();
//                break;
//            default: {
//                System.out.println(DriverInstances.class + " Empty or invalid browser type: " + driverType);
//                System.exit(1);
//            }
//        }
//        webDriverInstances.put(driverType, webDriver);
//        System.out.println("New WebDriver instance has been initialized: " + driverType);
//        webDriver.manage().timeouts().setScriptTimeout(60, SECONDS);
//        webDriver.manage().timeouts().pageLoadTimeout(60, SECONDS);
//        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(webDriver);
//        WebEventListener webEventListener = new WebEventListener();
//        eventFiringWebDriver.register(webEventListener);
//        return eventFiringWebDriver;
//    }

    public static WebDriver createDriver() {
        WebDriver driver = null;

        switch (Settings.PLATFORM_AND_BROWSER) {
            case "win_chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\T472686\\Documents\\Tools\\drivers\\chromedriver.exe");
//                System.setProperty("webdriver.http.factory", "jdk-http-client");
                driver = new ChromeDriver();
                break;

            case "win_firefox":
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\T472686\\Documents\\Tools\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;

            case "win_edge":
                System.setProperty("webdriver.edge.driver", "C:\\Users\\T472686\\Documents\\Tools\\drivers\\msedgedriver.exe");
                driver = new EdgeDriver();
                break;

            default:
                Assert.fail(" Incorrect platform or browser name: " + Settings.PLATFORM_AND_BROWSER);
//                System.out.println("Incorrect platform or browser name:" + Settings.PLATFORM_AND_BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constant.TimeoutVariable.IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
