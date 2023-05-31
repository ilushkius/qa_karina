package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;

public class OrderPositiveTest extends BaseTest {

    @Test
    public void checkOrderUpButton() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage.clickOrderUpButton();
        OrderPage orderPage = new OrderPage(getWebDriver());
        mainPage.clickCookieButton();
        orderPage.inputName("Петр");
        orderPage.inputSurname("Петров");
        orderPage.inputAdress("Халтуринская улица, 20");
        orderPage.inputUnderground("Бульвар Рокоссовского");
        orderPage.clickUnderground(orderPage.getUdergroundRokossovskyBoulevard());
        orderPage.inputPhone("87779998877");
        orderPage.clickButtonFurther(); // Кнопка Далее
        orderPage.insertDates("29.05.2023");
        orderPage.clickEmptySpace();
        orderPage.clickRentalPeriod();
        orderPage.clickThreeDay(); // 3 дня
        orderPage.clickBlackPearl(); // Черный жемчуг
        orderPage.clickButtonOrderMiddle(); // Заказать
        orderPage.clickYesButtonConfirmOrder(); // Кнопка ДА
        boolean isDisplayed = orderPage.displayingButtonViewOrder();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
    }

    @Test
    public void checkOrderMiddleButton() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage.clickCookieButton();
        mainPage.clickOrderMiddleButton();
        OrderPage orderPage = new OrderPage(getWebDriver());
        orderPage.inputName("Иван");
        orderPage.inputSurname("Иванов");
        orderPage.inputAdress("улица Амундсена, 12");
        orderPage.inputUnderground("Свиблово");
        orderPage.clickUnderground(orderPage.getUdergroundSviblovo());
        orderPage.inputPhone("89997779977");
        orderPage.clickButtonFurther();
        orderPage.insertDates("29.05.2023");
        orderPage.clickEmptySpace();
        orderPage.clickRentalPeriod();
        orderPage.clickTwoDay(); // 2 дня
        orderPage.clickGrayHopelessness(); // Серая безысходность
        orderPage.writeCommentСourier("Код домофона - 1111");
        orderPage.clickButtonOrderMiddle(); // Заказать
        orderPage.clickYesButtonConfirmOrder(); // Кнопка ДА
        boolean isDisplayed = orderPage.displayingButtonViewOrder();
        Assert.assertTrue("Кнопка 'Посмотреть статус' не найдена", isDisplayed);
    }

}