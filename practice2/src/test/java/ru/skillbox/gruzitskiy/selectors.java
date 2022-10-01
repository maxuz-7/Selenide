package ru.skillbox.gruzitskiy;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class selectors {

    @Test
    void SelenideSelectors(){
        open("http://intershop2.skillbox.ru/");
        $("footer").shouldBe(visible);   // tag
        $("#menu").shouldBe(visible);  // element id
        $(".before-top-header").shouldBe(visible);  // class
        $("button.searchsubmit[type=submit]").shouldBe(visible);  // tag, class and attribute
        $("footer").$("#pages-2").$(withText("Бонусная программа")).shouldBe(visible); // child

        open("http://qajava.skillbox.ru/");
        $("a[test-info=about-us]").shouldBe(visible);
        $(withText("Доставка и оплата")).shouldBe(visible);
        $(withText("Корзина")).shouldBe(visible);
        $(withText("Атлант расправил плечи")).parent().shouldBe(visible);
        $(withText("Атлант расправил плечи")).closest(".book-info").shouldBe(visible);
        $(withText("Атлант расправил плечи")).closest(".book-info").sibling(1).shouldHave(text("Ночь, когда огни погасли"));

        open("http://qajava.skillbox.ru/module04/lesson2/");
        $x("//button[@id='write-to-me']").shouldBe(visible);
        $("#write-to-me").shouldBe(visible);
    }
}
