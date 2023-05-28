apackage ru.yandex.practicum;

import org.junit.Assert;
import org.junit.Test;

public class faqText {

    @Test
    public void checkTextOneInFAQ() {
        ru.yandex.practicum.MainPage mainPage = new ru.yandex.practicum.MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion(mainPage.question0);
        String expected = "Сколько это стоит? И как оплатить?";
        String actual = mainPage.getText(mainPage.question0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTextTwoInFAQ() {
        ru.yandex.practicum.MainPage mainPage = new ru.yandex.practicum.MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion(mainPage.question1);
        String expected = "Хочу сразу несколько самокатов! Так можно?";
        String actual = mainPage.getText(mainPage.question1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTextThreeInFAQ() {
        ru.yandex.practicum.MainPage mainPage = new ru.yandex.practicum.MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion(mainPage.question2);
        String expected = "Как рассчитывается время аренды?";
        String actual = mainPage.getText(mainPage.question2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTextFourInFAQ() {
        ru.yandex.practicum.MainPage mainPage = new ru.yandex.practicum.MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion(mainPage.question3);
        String expected = "Можно ли заказать самокат прямо на сегодня?";
        String actual = mainPage.getText(mainPage.question3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTextFiveInFAQ() {
        ru.yandex.practicum.MainPage mainPage = new ru.yandex.practicum.MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion(mainPage.question4);
        String expected = "Можно ли продлить заказ или вернуть самокат раньше?";
        String actual = mainPage.getText(mainPage.question4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTextSixInFAQ() {
        ru.yandex.practicum.MainPage mainPage = new ru.yandex.practicum.MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion(mainPage.question5);
        String expected = "Вы привозите зарядку вместе с самокатом?";
        String actual = mainPage.getText(mainPage.question5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTextSevenInFAQ() {
        ru.yandex.practicum.MainPage mainPage = new ru.yandex.practicum.MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion(mainPage.question6);
        String expected = "Можно ли отменить заказ?";
        String actual = mainPage.getText(mainPage.question6);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkTextEightInFAQ() {
        ru.yandex.practicum.MainPage mainPage = new ru.yandex.practicum.MainPage(webDriver);
        mainPage.clickCookieButton();
        mainPage.scrollToQuestion();
        mainPage.clickQuestion(mainPage.question7);
        String expected = "Я жизу за МКАДом, привезёте?";
        String actual = mainPage.getText(mainPage.question7);
        Assert.assertEquals(expected, actual);
    }
}
