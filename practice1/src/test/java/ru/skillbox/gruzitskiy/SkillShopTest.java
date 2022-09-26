package ru.skillbox.gruzitskiy;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SkillShopTest {
    @Test

    void skillshop()
    {
        // ������� �������� intershop.skillbox.ru
        open("http://intershop.skillbox.ru");
        // ������ ������ � ���� ������, ������ Enter
        $("[class=search-field]").setValue("������").pressEnter();
        // ��������: ���������� ������ ������� � �� ������ ����� ����� � ������ ������
        $$("[class=collection_title]").first().shouldHave(text("������"));
    }
}
