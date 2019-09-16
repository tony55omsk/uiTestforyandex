import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.*;

public class Yandex1 {
    @BeforeMethod
    public void settings(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = Boolean.parseBoolean("true");
    }
    @Test
    public void yandex1(){
        open("https://yandex.ru/");
        $(linkText("Маркет")).click();
        $(linkText("Электроника")).click();
        $(linkText("Смартфоны")).click();
        $(linkText("Все фильтры")).click();

        $("#glf-pricefrom-var").setValue("20000");
        $(By.xpath("/html/body/div[1]/div[5]/div/div[1]/div[1]/div[4]/div[2]/div/div[1]/div[2]/a/span/label")).click();
        $(By.xpath("/html/body/div[1]/div[5]/div/div[1]/div[1]/div[4]/div[2]/div/div[1]/div[8]/a/span/label")).click();
        $(By.xpath("/html/body/div[1]/div[5]/div/div[1]/div[5]/a[2]")).click();
        sleep(5000);
    }
}