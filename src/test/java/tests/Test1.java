package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args ) {
    /*
    // bu kısım her bir değerin girilmesi ve en altta bu değerlerin okunması kısmı
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement fullName = driver.findElement(By.id("userName"));
        fullName.click();
        fullName.sendKeys("Esra");

        WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail'"));
        email.click();
        email.sendKeys("esra123@gmail.com");

        WebElement currentAddress = driver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address'"));
        currentAddress.click();
        currentAddress.sendKeys("Istanbul , Türkiye");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys("Eyüp, Istanbul, Türkiye");

        WebElement submitButton = driver.findElement(new By.ByCssSelector("button.btn"));
        submitButton.click();

        WebElement nametext = driver.findElement(By.xpath("//div/p[@id='email']"));
        String emailText = nametext.getText();
        System.out.println(emailText);
*/
 // burada checkbox kısmındaki butonun check olup olmamasıyla ilgileniyoruz.
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/checkbox");
        driver.manage().window().maximize();

        String homeCheckBoxCssValue = "label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement homeCheckBox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
        homeCheckBox.click();
// dom değiştiği için tekrar bul ve bu değeri almasını bekle
        homeCheckBox = driver.findElement(new By.ByCssSelector(homeCheckBoxCssValue));
    // get attirbute ile elementdeki herhangi bir att değerini string olarak alabiliyoruz.
        String homeCheckboxClassName = homeCheckBox.getAttribute("class");

        if (homeCheckboxClassName.equals("rct-icon rct-icon-check")) {
            System.out.println("Checkbox is checked");
        } else  {
            System.out.println("Checkbox is unchecked!");
        }

    }
}
