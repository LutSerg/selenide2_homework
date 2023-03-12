package com.asteroster.solutionstest;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class SolutionsTest {
    @BeforeEach
    void setUp() {
        Configuration.browser = "firefox";
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void solutionTest () {


        open("https://github.com/");
        $$("ul .HeaderMenu-link").findBy(Condition.text("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".h1-mktg").shouldBe(Condition.visible)
                .shouldHave(Condition.text("Build like the best"));
    }
}
