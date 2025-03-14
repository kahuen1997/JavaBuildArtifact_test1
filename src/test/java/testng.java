import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//Mvn Test Need testng.xml and need to add the location of testng.xml in pom.xml surefire plugin
//Mvn Test Need testng.xml and need to add the location of testng.xml in pom.xml surefire plugin
//Mvn Test Need testng.xml and need to add the location of testng.xml in pom.xml surefire plugin

public class testng {
    WebDriver driver;

    @BeforeClass
        public void setup(){
        System.setProperty("Chrome Webdriver", "C:\\Program Files\\Intellij\\IdeaProjects\\Build_Artifact\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void t1() throws InterruptedException {
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(5000);
    }

    @AfterClass
    public void teardown(){
        driver.quit();
        driver.close();
    }
}
