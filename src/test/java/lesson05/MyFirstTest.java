package lesson05;

import lesson06.TestBase;
import org.hamcrest.CoreMatchers;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

//1. Напишите тест, похожий на рассмотренный на занятии 5 (ввод посикового запроса и проверка первой подсказки), только проверьте, что все подсказки выпадающего списка содержат вводимый текст.
//        1.1. Искать список всех подсказок через findElements;
//        1.2. Проверку всех подсказок сделать с помощью Stream API.
//        2. Запустить сьют через мавен и через IDE.

public class MyFirstTest extends TestBase {


    @Test(timeout = 5000l)
    public void verifyFirstTipIsCorrect() {
        driver.findElement(By.id("search_query_top")).clear();
        driver.findElement(By.id("search_query_top")).sendKeys("Dress");

        Assert.assertThat(
                driver.findElement(By.xpath("//*[@id='index']/div[2]/ul/li[1]")).getText(),
                CoreMatchers.containsString("Dress"));
    }

    @Test(timeout = 5000l)
    public void verifyFirstTipIsCorrect_viaAssertTrue() {
        driver.findElement(By.id("search_query_top")).clear();
        driver.findElement(By.id("search_query_top")).sendKeys("Dress");

        Assert.assertTrue("First tip text was wrong",
                driver.findElement(By.xpath("//*[@id='index']/div[2]/ul/li[1]")).getText().contains("Dress1"));
    }

    @Test
    public void verifyHintsContainText() {
        String search = "Dress";
        driver.findElement(By.id("search_query_top")).clear();
        driver.findElement(By.id("search_query_top")).sendKeys(search);

        List<WebElement> a = driver.findElements(By.xpath("//div[@class='ac_results']/ul/li"));
        Assert.assertTrue(String.format("Not all Hints contain %s", search), a.stream().allMatch(i -> i.getText().contains(search)));


    }
}
