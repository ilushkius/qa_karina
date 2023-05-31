package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;

public class FaqTextTest extends BaseTest {

    @Test
    public void checkTextOneInFAQ() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion(mainPage.getQuestion0());
        String expected = "Сколько это стоит? И как оплатить?";
        String actual = mainPage.getText(mainPage.getQuestion0());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTextTwoInFAQ() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion(mainPage.getQuestion1());
        String expected = "Хочу сразу несколько самокатов! Так можно?";
        String actual = mainPage.getText(mainPage.getQuestion1());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTextThreeInFAQ() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion(mainPage.getQuestion2());
        String expected = "Как рассчитывается время аренды?";
        String actual = mainPage.getText(mainPage.getQuestion2());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTextFourInFAQ() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion(mainPage.getQuestion3());
        String expected = "Можно ли заказать самокат прямо на сегодня?";
        String actual = mainPage.getText(mainPage.getQuestion3());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTextFiveInFAQ() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion(mainPage.getQuestion4());
        String expected = "Можно ли продлить заказ или вернуть самокат раньше?";
        String actual = mainPage.getText(mainPage.getQuestion4());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTextSixInFAQ() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion(mainPage.getQuestion5());
        String expected = "Вы привозите зарядку вместе с самокатом?";
        String actual = mainPage.getText(mainPage.getQuestion5());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTextSevenInFAQ() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion(mainPage.getQuestion6());
        String expected = "Можно ли отменить заказ?";
        String actual = mainPage.getText(mainPage.getQuestion6());
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTextEightInFAQ() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion(mainPage.getQuestion7());
        String expected = "Я жизу за МКАДом, привезёте?";
        String actual = mainPage.getText(mainPage.getQuestion7());
        Assert.assertEquals(expected, actual);
    }
}
