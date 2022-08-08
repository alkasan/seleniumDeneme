package tests;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Test1 {
    public static void main(String[] args) throws InterruptedException {
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

/*

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
*/

/*
        //burada hobbies checkboxdaki kısmı tik koyup koymadığına bakıyoruz
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();

        WebElement sportCheckbox = driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnabled = sportCheckbox.isEnabled();
        //burada tıklanabilir olup olmadığını kontrol ediyor.
        System.out.println(isEnabled);
        //burada alınan hata sebebi sports üstüne tıklayıncada check etmiş olması o yüzden tik görüntüsü yok
        //if(isEnabled) {
        //    sportCheckbox.click();
        // }
        WebElement sportCheckboxLabel = driver.findElement(new By.ByCssSelector("label[for='hobbies-checkbox-1']"));
        if (isEnabled) {
            try{
                System.out.println("Entered try block!");
                sportCheckbox.click();
            }catch(ElementClickInterceptedException e){
                sportCheckboxLabel.click();
                System.out.println("Entered catch block!");
            }
        }
        //burada ise seçili olup olmadıgını kontrol ediyoruz.
        boolean isSelected = sportCheckbox.isSelected();
        System.out.println(isSelected);
*/
        //radio buton kısımlarını inceleyeceğiz
/*
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();

        WebElement yesradioButtonLabel = driver.findElement(new By.ByCssSelector("label[for=yesRadio]"));
        boolean isEnabled = yesradioButtonLabel.isEnabled();
        if (isEnabled) {
            yesradioButtonLabel.click();
            System.out.println("basarili");
        }
        // biz yukarıda metinden kontrol sağladık fakat kutucuktan kontrol sağlamak için yeni bir element olusuturyoruz
        //radio button tıklıysa seçiliyse bize sout da ki metni döndür

        WebElement yesradioButton =driver.findElement(By.id("yesRadio"));
        boolean isSelected = yesradioButton.isSelected();
        if (isSelected) {
            System.out.println("yes radioButton is selected");
        }

        WebElement output =driver.findElement(new By.ByCssSelector("p.mt-3"));
        System.out.println(output.getText());

        WebElement noradioButton = driver.findElement(By.id("noRadio"));
        boolean isEnable =noradioButton.isEnabled();
        System.out.println(isEnable);
*/
/*
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions action = new Actions(driver);
        action.doubleClick(doubleClickButton).perform();

        WebElement message = driver.findElement(By.id("doubleClickMessage"));
        String messageText = message.getText();
        System.out.println(messageText);

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightClickButton).perform();

        WebElement rightClickMessage =driver.findElement(By.id("rightClickMessage"));
        String message2 = rightClickMessage.getText();
        System.out.println(message2);

        // //div/button[starts-with(text(), 'Click Me')]
        // //div[last()]/button
*/
 /*
   //dinamik element bulma
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");
        driver.manage().window().maximize();

        WebElement dinamicElementButtons = driver.findElement(By.xpath("//div[last()]/button"));
        dinamicElementButtons.click();
*/

/*
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/dynamic-properties");
        driver.manage().window().maximize();

        WebElement textElement = driver.findElement(By.xpath("//div/p"));
        String text = textElement.getText();
        System.out.println(text);
    //  buton 5 sn bekledikten sonra görünüyor, bekleme için webdriverWait kullanıyoruz.
        WebElement firstButton= driver.findElement(By.id("enableAfter"));
        WebDriverWait wait  = new WebDriverWait(driver , 5);
        wait.until(ExpectedConditions.elementToBeClickable(firstButton));
        firstButton.click();
*/

        //    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //    WebDriver driver = new ChromeDriver();

        //    driver.get("https://demoqa.com/dynamic-properties");
        //    driver.manage().window().maximize();
/*
        //renk değişmeden önceki classname konsola yazdırdık
        WebElement colorChangeButton = driver.findElement(By.id("colorChange"));
        String className = colorChangeButton.getAttribute("class");
        System.out.println("Before change: " + className);

        WebDriverWait wait = new WebDriverWait(driver , 5);
        wait.until(ExpectedConditions.attributeToBe(colorChangeButton,"class", "mt-4 text-danger btn btn-primary"));
        className = colorChangeButton.getAttribute("class");
        System.out.println("After change: "+className);
*/

/*
        //burada da görünmeyen dinamik element için gerekli kodlar yazıldı.
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        driver.findElement(By.id("visibleAfter")).click();
*/
        //KIRIK LINKLER -

 /*
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/broken");
        driver.manage().window().maximize();

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("https://demoqa.com/");
        HttpResponse response = null;
        try {
            response = client.execute(request);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);
*/
/*
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/broken");
        driver.manage().window().maximize();

        WebElement brokenImage = driver.findElement(By.xpath("//div/img[2]"));
        String brokenImageUrl = brokenImage.getAttribute("src");
        System.out.println(brokenImageUrl);

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(brokenImageUrl);
        HttpResponse response = null;
        try {
            response = client.execute(request);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);
*/
/*
        // img1 görüntüleme
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/broken");
        driver.manage().window().maximize();

        WebElement validImage = driver.findElement(By.xpath("//div/img[1]"));
        String validImageUrl = validImage.getAttribute("src");
        System.out.println(validImage);

        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(validImageUrl);
        HttpResponse response = null;
        try {
            response = client.execute(request);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println(statusCode);
        if (statusCode ==200) {
            System.out.println("Valid Image!");
        } else if (statusCode ==500) {
            System.out.println("broken image!");
        }

 */
 /*
      // DOWNLOAD İSLEMİ
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();

        WebElement downloadButton = driver.findElement(By.id("downloadButton"));
        downloadButton.click();

        String path = "C:\\Users\\ealka\\Downloads";
        String fileName = "sampleFile.jpeg";
        Thread.sleep(2000);
        boolean isDownloaded = isFileDownloaded(path, fileName);
        System.out.println(isDownloaded);

    }

    public static boolean isFileDownloaded(String downloadpath, String fileName) {
        File file = new File(downloadpath);
        File[] files = file.listFiles();

        for(int i=0; i<files.length ; i++) {
            if ((files[i].getName().equals(fileName))){
                files[i].delete();
                return true;
            }
        }
        return false;

  */
  /*
        // UPLOAD İSLEMİ
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();

        WebElement uploadButton = driver.findElement(By.id("uploadFile"));
        uploadButton.sendKeys("C:\\Users\\ealka\\OneDrive\\Masaüstü\\seleniumIcon.png");

   */
   /*
        //WINDOWS TAB İLE ETKİLEŞİM
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/browser-windows");
        driver.manage().window().maximize();
        // burada ikinci sayfayı açıyoruz
        //eğer ikinci sayfayı farklı bir sayfada açmak istersek new window tıklamaya bakacağız
        // id kısmını tabButton u new window idsini kullanacağız windowButton
        WebElement tabButton = driver.findElement(By.id("tabButton"));
        tabButton.click();
        //buradan sonra ise actıgımız sayfalar kac tane bunu sorgulayarak,
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        System.out.println(tabs.size());

        driver.switchTo().window(tabs.get(1));
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(2000);
        //close kulllanıyoruz quit kullanmıyoruz ki tüm şeyler kapanmasın.
        driver.close();

    */
/*
        //ALERT
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        driver.findElement(By.id("alertButton")).click();

        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();
*/

        // FRAME
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();

        //frame getirmek için
        driver.switchTo().frame("frame1");

        WebElement heading = driver.findElement(By.id("sampleHeading"));
        String text = heading.getText();
        System.out.println(text);




    }
}
