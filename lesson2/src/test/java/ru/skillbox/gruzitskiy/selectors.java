package ru.skillbox.gruzitskiy;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class selectors {

    @Test
    void SelenideSelectors(){
        open("http://qajava.skillbox.ru/search.html");
        $("footer").shouldBe(visible);   // tag
        $("#footer").shouldBe(visible);  // element id
        $("[placeholder='����� �� ��������...']").shouldBe(visible);   // attribute
        $("[maxlength]").shouldBe(visible); // attribute
        $(".filter-button").shouldBe(visible);  // class one parameter
        $("footer#footer").shouldBe(visible);  // tag + id
        $("input[name=search-input-form]").shouldBe(visible);   // tag + attribute
        $("input[name=search-input-form][maxlength]").shouldBe(visible); // tag + 2 attributes
        $("button.filter-button.show-results").shouldBe(visible); // tag + 2 classes
        $("div img").shouldBe(visible); // �������
        $("div>h1").shouldBe(visible); // child
        $("div div h1").shouldBe(visible); // ������� ��������
        $("div.content h1").shouldBe(visible); // ������� ������

        $(byText("��������")).shouldBe(visible);   // text search
        $(withText("������")).shouldBe(visible);  // with text search
        $(withText("������")).parent().shouldBe(visible); // parent
        $(withText("������")).closest("div").shouldBe(visible); // near parent div
        $(withText("������")).closest(".book-info").shouldBe(visible); // near parent class
        $("#search").sibling(0).shouldBe(visible);  // near next sibling 0
        $("#search").preceding(0).shouldBe(visible);  // near before sibling 0
        $("#search").sibling(0).shouldHave(text("0"));  // near next sibling 0 and
        $("#search").preceding(0).shouldHave(text("������� �������"));  // near before sibling 0
        $x("//footer[@id='footer']").shouldBe(visible);  // footer#footer

        $("body").$("div.content").$(withText("������")).shouldBe(visible); // many selectors
        $(withText("������")).closest(".content").preceding(1).$("#logo").shouldHave(text("������� �������"));
    }
}
