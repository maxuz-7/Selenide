package ru.skillbox.gruzitskiy;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AmazonTest {

    @Test
    void amazon(){
        // Открыть страницу amazon.com
        open("https://amazon.de");
        // Разрешить все куки
        $("#sp-cc-accept").pressEnter();
        // Ввести Harry Potter в поле поиска, нажать Enter
        $("#twotabsearchtextbox").setValue("Harry Potter").pressEnter();
        // Проверка: загрузился список товаров и на первом месте товар с именем Harry Potter
        $$("[data-component-type=s-search-result]").first().shouldHave(text("Harry Potter"));
    }
}
