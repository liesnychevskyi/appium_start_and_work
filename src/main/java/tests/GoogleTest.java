package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest
{
    //----------------------------------------------------------------------------------------------------------------//
    //GIT command:
    //0). git init - new local repository creation (empty)
    // git remote add origin "address of git repository"
    //1). git status
    //2). git add -A  - adding all the files to stage area
    // git config --global user.name "name"  - just once for identify the user name
    // git config --global user.email "mail" - just once for identify the user mail
    //3). git commit -m "some comment about commit"
    //4). git push -u origin master   - push to remote repository
    //5). git pull origin master   - pulling from the repository
    //----------------------------------------------------------------------------------------------------------------//
    @Test(priority = 1)
    public void googleTest()
    {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Best Appium best tutorial");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Assert.assertTrue(true);
    }
    //----------------------------------------------------------------------------------------------------------------//
    @Test(priority = 2)
    public void amazonTest()
    {
        driver.get("http://www.amazon.com");
        driver.findElement(By.id("nav-search-keywords")).sendKeys("Appium best tutorial");
        System.out.println("Testing Amazon ---");
    }
    //----------------------------------------------------------------------------------------------------------------//
    @Test(priority = 3)
    public void appleTest()
    {
        driver.get("http://www.apple.com");
        System.out.println("Testing Apple ---");
    }
    //----------------------------------------------------------------------------------------------------------------//
}
