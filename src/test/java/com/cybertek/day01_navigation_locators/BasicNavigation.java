package com.cybertek.day01_navigation_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BasicNavigation {
    public static void main(String[] args) {

        //set up chrome driver
        WebDriverManager.chromedriver().setup();

        //create chrome
        WebDriver driver = new ChromeDriver();
        //navigate to https://amazon.com

        driver.get("https://amazon.com");

        driver.navigate().to("https://amazon.com");

        driver.navigate().back();

        driver.navigate().forward();

        //closing browser
        /*
        close() method - close current tab
        quit() method - close all tabs

         */
        driver.close();


    }
}
