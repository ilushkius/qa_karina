package ru.yandex.praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private final WebDriver webDriver;

    public MainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    private By acceptCookie = By.id("rcc-confirm-button");
    // Cookie
    private By cookieButton = By.id("rcc-confirm-button");
    // Вопрос 1 "Сколько это стоит? И как оплатить?"
    private By question0 = By.id("accordion__heading-0");
    // Вопрос 2 "Хочу сразу несколько самокатов! Так можно?"
    private By question1 = By.id("accordion__heading-1");
    // Вопрос 3 "Как рассчитывается время аренды?"
    private By question2 = By.id("accordion__heading-2");
    // Вопрос 4 "Можно ли заказать самокат прямо на сегодня?"
    private By question3 = By.id("accordion__heading-3");
    // Вопрос 5 "Можно ли продлить заказ или вернуть самокат раньше?"
    private By question4 = By.id("accordion__heading-4");
    // Вопрос 6 "Вы привозите зарядку вместе с самокатом?"
    private By question5 = By.id("accordion__heading-5");
    // Вопрос 7 "Можно ли отменить заказ?"
    private By question6 = By.id("accordion__heading-6");
    // Вопрос 8 "Я жизу за МКАДом, привезёте?"
    private By question7 = By.id("accordion__heading-7");
    // Кнопка "Заказать" наверху
    private By orderUpButton = By.className("Button_Button__ra12g");
    // Кнопка "Заказать" снизу
    private By orderMiddleButton = By.xpath(".//div[@class='Home_FinishButton__1_cWm']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");

    public void clickCookieButton() {
        webDriver.findElement(cookieButton).click();
    }

    public void scrollToQuestion() {
        WebElement element = webDriver.findElement(question0);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickQuestion(By text) {
        webDriver.findElement(text).click();
    }

    public String getText(By text) {
        return webDriver.findElement(text).getText();
    }

    public void clickOrderUpButton() {
        webDriver.findElement(orderUpButton).click();
    }

    public void clickOrderMiddleButton() {
        webDriver.findElement(orderMiddleButton).click();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public By getAcceptCookie() {
        return acceptCookie;
    }

    public void setAcceptCookie(By acceptCookie) {
        this.acceptCookie = acceptCookie;
    }

    public By getCookieButton() {
        return cookieButton;
    }

    public void setCookieButton(By cookieButton) {
        this.cookieButton = cookieButton;
    }

    public By getQuestion0() {
        return question0;
    }

    public void setQuestion0(By question0) {
        this.question0 = question0;
    }

    public By getQuestion1() {
        return question1;
    }

    public void setQuestion1(By question1) {
        this.question1 = question1;
    }

    public By getQuestion2() {
        return question2;
    }

    public void setQuestion2(By question2) {
        this.question2 = question2;
    }

    public By getQuestion3() {
        return question3;
    }

    public void setQuestion3(By question3) {
        this.question3 = question3;
    }

    public By getQuestion4() {
        return question4;
    }

    public void setQuestion4(By question4) {
        this.question4 = question4;
    }

    public By getQuestion5() {
        return question5;
    }

    public void setQuestion5(By question5) {
        this.question5 = question5;
    }

    public By getQuestion6() {
        return question6;
    }

    public void setQuestion6(By question6) {
        this.question6 = question6;
    }

    public By getQuestion7() {
        return question7;
    }

    public void setQuestion7(By question7) {
        this.question7 = question7;
    }

    public By getOrderUpButton() {
        return orderUpButton;
    }

    public void setOrderUpButton(By orderUpButton) {
        this.orderUpButton = orderUpButton;
    }

    public By getOrderMiddleButton() {
        return orderMiddleButton;
    }

    public void setOrderMiddleButton(By orderMiddleButton) {
        this.orderMiddleButton = orderMiddleButton;
    }
}