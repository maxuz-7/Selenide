package ru.skillbox.gruzitskiy;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SkillShopTest {
    @Test

    void skillshop()
    {
        // Открыть страницу intershop.skillbox.ru
        open("http://intershop.skillbox.ru");
        // Ввести Машина в поле поиска, нажать Enter
        $("[class=search-field]").setValue("Машина").pressEnter();
        // Проверка: загрузился список товаров и на первом месте товар с именем Машина
        $$("[class=collection_title]").first().shouldHave(text("Машина"));
    }
}
